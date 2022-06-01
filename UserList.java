import java.util.ArrayList;

public class UserList{
//public static UserList userList = null; //careful for nullpointer exception
public ArrayList<User> users = new ArrayList<User>();
public ArrayList<User> tempBannedUsers;
public ArrayList<User> bannedUsers;
    private UserList(String name){

    }
    public UserList getInstance(){
        return null;
    }
    public ArrayList<User> getAllUsers(){
        return users;
    }
    private void addUser(String name){
        users.add(new User(name));
    }
}