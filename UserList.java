import java.util.ArrayList;

public class UserList{
public UserList userList;
public ArrayList<User> users;
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