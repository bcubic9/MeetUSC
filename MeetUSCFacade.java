import java.util.ArrayList;

class MeetUSCFacade 
{
   private String username;
   private String password;
   private Character guestLogin; 
   private boolean exitApp;

    private boolean addUser (User user)
    {
        return false;
    }

    public ArrayList<Group> getFavGroups()
    {
        return null;
    }

    public ArrayList<Event> getFavEvents()
    {
        return null;
    }

    public boolean login(String username, String password)
    {
        return false;
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

    public boolean createNewUser()
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