import java.util.*;

public class UI 
{
   
    private Scanner input;
    private MeetUSCFacade facade;
    private String header = "======MeetUSC======";
    private String[] choices = {"Login (l)", "Create User (c)", "Exit (e)"};
    private String[] userOptions = {"View Profile (p)", "View Groups (g)", "View events (v)", "Exit (x)"};
    private static final String divider = "=================";

    public UI()
   {
        input = new Scanner(System.in);
        facade = new MeetUSCFacade();
   }
   
   public void run()
   { 
        System.out.println(header);
        showChoices();
        System.out.println("Type a letter from the above options.");
        login();
   }

   public User login()
   {
       while(true)
       {
           String choice = input.nextLine().trim().toLowerCase();
           switch (choice)
           {
               case "l":
                    System.out.println("Enter your credentials:");
                    System.out.print("Username: ");
                    String userName = input.nextLine();
                    System.out.print("Password: ");
                    String password = input.nextLine().trim().toLowerCase();
                    User currentUser = facade.login(userName, password);
                    if(currentUser != null)
                    {   
                        while(true) {
                            System.out.println(divider);
                            System.out.println("Welcome to Meet USC " + currentUser.getFirstName() + " " + currentUser.getLastName());
                            System.out.println();
                            System.out.println("Select from the following options:");
                            giveUserOptions();
                            String userInput = input.nextLine().trim().toLowerCase();
                            switch(userInput) {
                                case "x":
                                    System.out.println("Have a nice day!");
                                    System.exit(0);
                                    break;
                                case "p":
                                    getUserProfile(currentUser);
                                break;
                                case "g":
                                    GroupList.getInstance().getGroups();
                                break;
                                case "v":
                                    EventList.getInstance().getEvents();
                                break;
                            }
                        }
                    }
                    else
                    {
                        System.out.println("User not found, please try again.");
                        continue;
                    }
                

                case "c":
                    System.out.println("Please enter the following information:");
                    System.out.print("Username: ");
                    String newUserName = input.nextLine().trim().toLowerCase();
                    System.out.print("Password: ");
                    String newPassword = input.nextLine().trim().toLowerCase();
                    System.out.print("First Name: ");
                    String newFirstName = input.nextLine().trim().toLowerCase();
                    System.out.print("LastName: ");
                    String newLastName = input.nextLine().trim().toLowerCase();
                    User newUser = facade.addUser(newUserName, newPassword, newFirstName, newLastName);
                    if(newUser != UserList.getInstance().getUserByUserName(newUserName))
                    {
                        return newUser;
                    }
                break;

                case "e":
                    System.out.println("Have a nice day!");
                    System.exit(0);
                break;

                default:
                    System.out.println("Oops, try again.");
                break;
           }
       }
   }

   public void giveUserOptions()
   {
       for(int i = 0; i < userOptions.length; i++)
       {
           System.out.print(userOptions[i]+ " ");
       }
   }

   public void showChoices()
   {
       for(int i = 0; i < choices.length; i++)
       {
           System.out.println("- " + choices[i]);
       }
   }

   public void getUserProfile(User currentUser) 
   {
        System.out.println("Name: " + currentUser.getFirstName() + " " + currentUser.getLastName());
        System.out.println("Email: " + currentUser.getEmailAddress());
        System.out.println("Profile is public: " + currentUser.getProfileIsPublic());
        System.out.println("Categories of interest: " + currentUser.getCategoriesOfInterest().toString());
        System.out.println("Gender: " + currentUser.getUserGender());
        System.out.println("Age: " + currentUser.getUserAge());
        System.out.println("Username: " + currentUser.getUserName());
        System.out.println("Groups joined: " + currentUser.getJoinedGroups());
    
    }
    


   public static void main(String[] args)
   {
       UI myUI = new UI();
       myUI.run();
   }
}
