import java.util.ArrayList;

public class UserList {
    private UserList userList = null;
    private List<User> users;
    private List<User> tempBannedUsers;
    private List<User> bannedUsers;

    private UserList userList(){

      this.users = new List<>();
      this.tempBannedUsers = new List<>();
      this.bannedUsers = new List<>();

    }
    public UserList getInstance(){
      if (userList == null){
        userList = new UserList();
      }
      return userList;
    }
    public List<User> getAllUsers(){
        return users;
    }
    public void addUser(User user){
        users.add(user);
    }
}
