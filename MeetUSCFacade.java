import java.util.*;

class MeetUSCFacade 
{
   private User currentUser;

   public MeetUSCFacade()
   {

   }

    public User addUser (String userName, String password, String firstName, String lastName)
    {
        currentUser = UserList.getInstance().addUser(userName, password, firstName, lastName);
        return currentUser;
    }

    public Group addGroup(String name, String description, ArrayList<Category> category)
    {
        return GroupList.getInstance().addGroup(name, description, category);
    }

    public Event addEvent(String name, String description, ArrayList<Category> categories)
    {
        return EventList.getInstance().addEvent(name, description, categories);
    }

    public ArrayList<Group> getJoinedGroups()
    {
        return currentUser.getJoinedGroups();
    }

    public ArrayList<Event> getFavEvents()
    {
        return null;
    }

    public User login(String userName, String password)
    {
        currentUser = UserList.getInstance().login(userName, password);
        return currentUser;
    }

    public ArrayList<Event> searchEventByCategory(Category category)
    {
        return EventList.getInstance().searchByCategory(category);
    }

    public Group searchForGroup(Group group)
    {
        return group;
    }

    public boolean createNewGroup()
    {
        return false;
    }

    public boolean createNewEvent()
    {
        return false;
    }

}