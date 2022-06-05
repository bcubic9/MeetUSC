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
        System.out.println("Choose one of the following options: ");
        User user = login();
        if(user == null)
        {
            System.out.println("Have a nice day!");
            return;
        }
        else
        {
            while(true)
            {
                
            }
        }
   }

   public User login()
   {
    while(true)
    {
        System.out.println("Enter your login information below:");
        System.out.print("Username: ");
        String username = input.nextLine().trim();
        System.out.print("Password: ");
        String password = input.nextLine().trim();
        /** 
         * need to check and see if the boolean is true/false. if true, then allow them to edit items, etc. if false, don't allow them
         * to do certain activities.
         * 
         * User won't be give the return of the login.
         */
        User user = facade.login(username, password); 
        if(user == null)
        {
            System.out.println("Oops! The user "+ username + " does not exist.");
            System.out.println("Do you want to continue?  (Y)es (N)o");
            String cont = input.nextLine().trim().toLowerCase();
            if(cont.equals("y"))
            {
                continue;
            }
            else if(cont.equals("n"))
            {
                return null;
            }
            else 
            {
                System.out.println("Invalid input.");
                continue;
            }
        }
        else
        {
        return user;
        }
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
   public static void main(String[] args)
   {
       UI myUI = new UI();
       myUI.run();
   }
}
