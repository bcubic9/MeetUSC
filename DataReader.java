import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends JsonConstants {
    public static ArrayList<User> users = new ArrayList<User>();

    public ArrayList<User> getUsers() {
        //ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray)parser.parse(reader);

            for(int i = 0; i < userJSON.size(); i++) {
                //Need to make sure that these are not all strings when done.
                JSONObject userJsonObject = (JSONObject)userJSON.get(i);
                String  userID = (String)userJsonObject.get(USER_ID);
                String  userPass = (String)userJsonObject.get(USER_PASSWORD);
                String  userDisplayName = (String)userJsonObject.get(USER_DISPLAY_NAME);
                String  userName = (String)userJsonObject.get(USER_NAME);
                String  userGender = (String)userJsonObject.get(USER_GENDER);
                String  userAge = (String)userJsonObject.get(USER_AGE);
                String  userCreationDate = (String)userJsonObject.get(USER_CREATION_DATE);
                String  userNumOfGroups = (String)userJsonObject.get(USER_NUMBER_OF_GROUPS);
                String  userHobbies = (String)userJsonObject.get(USER_HOBBIES);
                String  userEmail = (String)userJsonObject.get(USER_EMAIL_ADDRESS);
                String  userAgreedToTerms = (String)userJsonObject.get(USER_HAS_AGREED_TO_TERMS);
                String  userProfileIsPublic = (String)userJsonObject.get(USER_PROFILE_IS_PUBLIC);
                String  userFavGroups = (String)userJsonObject.get(USER_FAVORITE_GROUPS);
                String  userCategoriesOfInterest = (String)userJsonObject.get(USER_CATEGORIES_OF_INTEREST);
                String  userAdminPrivileges = (String)userJsonObject.get(USER_ADMIN_PRIVILEGES);
                String  userAuthorPrivileges = (String)userJsonObject.get(USER_AUTHOR_PRIVILEGES);
                
                users.add(new User(userID, userPass, userDisplayName, userName, userGender, userAge, 
                        userCreationDate, userNumOfGroups, userHobbies, userEmail, userAgreedToTerms, 
                        userProfileIsPublic, userFavGroups, userCategoriesOfInterest, userAdminPrivileges,
                        userAuthorPrivileges));
            }

            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<Event> getEvent() {
        return null;
    }

    public ArrayList<Group> getGroup() {
        return null;
    }
    /**
     * Method to be deleted at a later time.
     */
    public static void main(String[] args) throws FileNotFoundException {
       // DataReader dr = new DataReader();
        ArrayList<User> allusers = new ArrayList<User>();
        
        System.out.println("Hello, this is a test of the json filereader class");
      //  allusers = dr.getUsers();
        System.out.println(users.toString());
        //System.out.println(users);
    }
}
