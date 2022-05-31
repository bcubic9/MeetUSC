import java.util.ArrayList;
public class UI 
{
   public String username;
   private String password;
   public Character guestLogin; 
   public boolean exitApp;
   private Event event;

   public ArrayList<Group> displayFavoriteGroups()
   {
        ArrayList<Group> favorites = new ArrayList<Group>();
        return favorites;
   }

   public ArrayList<Event> displayFavoriteEvents()
   {
       ArrayList<Event> favorites = new ArrayList<Event>();
       return favorites;
   }

   public ArrayList<String> displayEventPage(Event event)
   {
       this.event = event;
       ArrayList<String> eventPage = new ArrayList<String>();
       return eventPage;
   }

   public ArrayList<String> displayGroupPage(Group group)
   {
       ArrayList<String> groupPage = new ArrayList<String>();
       return groupPage;
   }

   public ArrayList<String> displayUserPage(User user)
   {
       ArrayList<String> userPage = new ArrayList<String>();
       return userPage;
   }

   public void exitSystem(boolean exit)
   {
       
   }
}
