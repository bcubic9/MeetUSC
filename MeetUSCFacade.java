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

    public User login(String username, String password)
    {
        return null;
    }

    public Event searchForEvent(Event event)
    {
        return event;
    }

    public Group searchForGroup(Group group)
    {
        return group;
    }

    public ArrayList<String> getHomeScreenInfo()
    {
        return null;
    }

    public ArrayList<String> getEventPageInfo(Event event)
    {
        return null;
    }

    public ArrayList<String> getGroupPageInfo(Group group)
    {
        return null;
    }

    public User getUserProfileInfo(User user)
    {
        return user;
    }

    public boolean setEventPageInfo(Event event)
    {
        return false;
    }

    public boolean setGroupPageInfo(Group group)
    {
        return false;
    }

    public boolean setUserInfo(User user)
    {
        return false;
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