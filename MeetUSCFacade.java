import java.util.*;

class MeetUSCFacade 
{
   private String username;
   private String password;
   private Character guestLogin; 
   private boolean exitApp;

   public MeetUSCFacade()
   {

   }

    private User addUser (User user)
    {
        return null;
    }

    public ArrayList<Group> getFavGroups()
    {
        return null;
    }

    public ArrayList<Event> getFavEvents()
    {
        return null;
    }

    public User login(String username, String password)
    {
        return new User(username, password);
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

    public ArrayList<String> getUserProfileInfo(User user)
    {
        return null;
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