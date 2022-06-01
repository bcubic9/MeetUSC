import java.util.*;
public class UI 
{

    Scanner input = new Scanner(System.in);
    MeetUSCFacade facade = new MeetUSCFacade();

   public UI()
   {

   }

   public void run()
   {
     
     System.out.println("Welcome to MeetUSC."); 
     System.out.println("\n Enter your login information below:");
     System.out.println("\n Username:");
     String username = input.nextLine().trim();
     System.out.println("\n Password:");
     String password = input.nextLine().trim();
     User user = MeetUSCFacade.login(username, password);
    
     if(user != null)
     {
        displayUserPage(user);
     }
     else 
     {
         System.out.println("Oops! The user "+ username + " does not exist.");
     }

   }
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
}
