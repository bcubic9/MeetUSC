import java.util.*;
public class UI 
{
   
    private Scanner input;
    private MeetUSCFacade facade;
    private String header = "======MeetUSC======";
    private String[] choices = {"Login (l)", "Create User (c)", "Exit (e)"};

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
                    String userName = input.nextLine().trim().toLowerCase();
                    System.out.print("Password: ");
                    String password = input.nextLine().trim().toLowerCase();
                    User currentUser = facade.login(userName, password);
                    if(currentUser != null)
                    {
                        return currentUser;
                    }
                break;

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

   public void showChoices()
   {
       for(int i = 0; i < choices.length; i++)
       {
           System.out.println("- " + choices[i]);
       }
   }

   public static void main(String[] args)
   {
       UI myUI = new UI();
       myUI.run();
   }
}
