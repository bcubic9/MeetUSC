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
        boolean end = false;
        launchScreen();
        while(end == false) {
            String choice = input.nextLine().trim().toLowerCase();
            switch (choice)
            {
                case "l":
                    login();
                    end = true;
                break;
                
                case "g":
                    System.out.println("Stub");
                    end = true;
                break;

                case "e":
                    System.out.println("Have a nice day!");
                    System.exit(0);
                break;

                default:
                    System.out.println("Oops! Try again.");
                    end = false;
                break;
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

   public void launchScreen()
   {
        System.out.println("Welcome to MeetUSC.");
        System.out.println("Choose one of the following options: ");
        System.out.println("Login (l)");
        System.out.println("Guest Login (g)");
        System.out.println("Exit (e)");
   }

   public ArrayList<Group> displayFavoriteGroups()
   {
        return null;
        /**
         * This logic should return the list of favorite groups specific to the user.
         * I believe it will be something like:
         * return user.getFavoriteGroups();
         * 
         * This may be a redundant method. Marked for review.
         */
   }

   public ArrayList<Event> displayFavoriteEvents()
   {
       return null;
       /**
        * This will act the same as the above method.
        */
   }

   public ArrayList<String> displayEventPage(Event event)
   {
       return null;
       /**
        * This will act the same as the two prior methods.
        */
   }

   public ArrayList<String> displayGroupPage(Group group)
   {
       return null;
   }

   public ArrayList<String> displayUserPage(User user)
   {
       return null;
   }
   public static void main(String[] args)
   {
       UI myUI = new UI();
       myUI.run();
   }
}
