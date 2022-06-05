import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends JsonConstants {

    

    public static void saveUsers() {
        UserList users = UserList.getInstance(); //may need to switch form UserList to User
        ArrayList<User> userList = users.getUsers();
        JSONArray jsonUsers = new JSONArray();

        //creating all the json objects
        for(int i = 0; i < userList.size(); i++) {
            jsonUsers.add(getUserJSON(userList.get(i)));
        }

        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            
            file.write(jsonUsers.toJSONString());
            file.flush();

        } catch (IOException e) { //could get rid of IOException
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getUserId().toString());
        userDetails.put(USER_PASSWORD, user.getUserId().toString());
        userDetails.put(USER_DISPLAY_NAME, user.getUserId().toString());
        userDetails.put(USER_NAME, user.getUserId().toString());
        userDetails.put(USER_GENDER, user.getUserId().toString());
        userDetails.put(USER_AGE, user.getUserId().toString());
        userDetails.put(USER_CREATION_DATE, user.getUserId().toString());
        userDetails.put(USER_NUMBER_OF_GROUPS, user.getUserId().toString());
        userDetails.put(USER_HOBBIES, user.getUserId().toString());
        userDetails.put(USER_EMAIL_ADDRESS, user.getUserId().toString());
        userDetails.put(USER_HAS_AGREED_TO_TERMS, user.getUserId().toString());
        userDetails.put(USER_PROFILE_IS_PUBLIC, user.getUserId().toString());
        userDetails.put(USER_FAVORITE_GROUPS, user.getUserId().toString());
        userDetails.put(USER_CATEGORIES_OF_INTEREST, user.getUserId().toString());
        userDetails.put(USER_ADMIN_PRIVILEGES, user.getUserId().toString());
        userDetails.put(USER_AUTHOR_PRIVILEGES, user.getUserId().toString());

        return userDetails;
    }
    

    public boolean saveEvents() {
        return false;
        
    }

    public boolean saveGroups() {
        return false;
    }
}
