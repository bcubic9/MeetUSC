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
    for (User user : users) {
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
