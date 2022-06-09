import java.util.ArrayList;
import java.util.UUID;

public class UserList {
  private static UserList userList = null;
  private ArrayList<User> users;
  private ArrayList<User> tempBannedUsers;
  private ArrayList<User> bannedUsers;

  private UserList() {

    this.users = new ArrayList<>();
    this.tempBannedUsers = new ArrayList<>();
    this.bannedUsers = new ArrayList<>();

  }

  public static UserList getInstance() {
    if (userList == null) {
      userList = new UserList();
    }
    return userList;
  }

  public ArrayList<User> getAllUsers() {
    return users;
  }

  public User addUser(String userName, String password, String firstName, String lastName) 
  {
    User newUser = new User(userName, password, firstName, lastName);
    users.add(newUser);
    return newUser;
  }
  //connects to the user.java for the json and datareader
  public User addUser(UUID userID, String userPass, String userUserName, String userFirstName, String userLastName, String userGender, int userAge, 
                      ArrayList<String> userHobbies, String userEmail, boolean userAgreedToTerms, boolean userProfileIsPublic,
                      ArrayList<Category> userCategoriesOfInterest, ArrayList<UUID> groupsJoined, boolean userAdminPrivileges, ArrayList<UUID> userAuthorOf) 
  {
    User newUser = new User(userID, userPass, userUserName, userFirstName, userLastName, userGender, userAge, 
                            userHobbies, userEmail, userAgreedToTerms, userProfileIsPublic,
                            userCategoriesOfInterest, groupsJoined, userAdminPrivileges, userAuthorOf); 
    users.add(newUser);
    return newUser;
  }

  public ArrayList<User> getUsers() {
    return users;
  }

  public User getUserByID(UUID userid) {
    for (User user : users) {
      if (user.getUserId().equals(userid)) {
        return user;
      }
    }
    return null;
  }

  public User getUserByUserName(String userName) {
    
    for (User user : getAllUsers()) {
      if (user.getUserName().equals(userName)) {
        return user;
      }
    }
    return null;
  }

  public User login(String userName, String password)
  {
    User user = getUserByUserName(userName);
    if(user.getUserPassword().equalsIgnoreCase(password))
    {
      return user;
    }
    return null;
  }


}
