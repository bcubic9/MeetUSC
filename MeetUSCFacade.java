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

    public ArrayList<String> getJoinedGroups()
    {
        return currentUser.getJoinedGroups();
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

    public ArrayList<Event> searchEventsByName(String name)
    {
        return EventList.getInstance().searchByName(name);
    }

    public ArrayList<Group> searchGroupByCategory(Category category)
    {
        return GroupList.getInstance().searchGroupByCategory(category);
    }

    public ArrayList<Group> searchGroupByName(String name)
    {
        return GroupList.getInstance().searchForGroupByName(name);
    }

    public ArrayList<User> getAllUsersTest()
    {
        return UserList.getInstance().getAllUsers();
    }

}