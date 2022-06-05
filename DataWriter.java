import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends JsonConstants {

    

    public void saveUsers() {
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

    public JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(USER_ID, user.getUserId().toString());
        userDetails.put(USER_PASSWORD, user.getUserPassword().toString());
        userDetails.put(USER_DISPLAY_NAME, user.getDisplayName().toString());
        userDetails.put(USER_NAME, user.getName().toString());
        userDetails.put(USER_GENDER, user.getUserGender().toString());
        userDetails.put(USER_AGE, user.getUserAge());
        userDetails.put(USER_CREATION_DATE, user.getUserCreationDate().toString());
        userDetails.put(USER_NUMBER_OF_GROUPS, user.getNumberOfGroups());
        userDetails.put(USER_HOBBIES, user.getHobby().toString());
        userDetails.put(USER_EMAIL_ADDRESS, user.getEmailAddress().toString());
        userDetails.put(USER_HAS_AGREED_TO_TERMS, user.getHasAgreedToTerms());
        userDetails.put(USER_PROFILE_IS_PUBLIC, user.getProfileIsPublic());
        userDetails.put(USER_FAVORITE_GROUPS, user.getFavoriteGroups().toString());
        userDetails.put(USER_CATEGORIES_OF_INTEREST, user.getCategoriesOfInterest().toString());
        userDetails.put(USER_ADMIN_PRIVILEGES, user.getAdminPrivileges());
        userDetails.put(USER_AUTHOR_PRIVILEGES, user.getAuthorPrivileges());

        return userDetails;
    }
    

    public boolean saveEvents() {
        return false;
        
    }

    public boolean saveGroups() {
        return false;
    }
}
