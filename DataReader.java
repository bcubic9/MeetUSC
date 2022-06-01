import java.util.ArrayList;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends JsonConstants {
    
    public ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parse = new JSONParser();
            JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);

            for(int i = 0; i < userJSON.size(); i++) {
                JSONObject userJsonObject = (JSONObject)userJSON.get(i);
                String  userID = (String)userJsonObject.get(USER_ID);
                String  userPass = (String)userJsonObject.get(USER_PASSWORD);
                String  userDisplayName = (String)userJsonObject.get(USER_DISPLAY_NAME);
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
                
                UserList.addUser(new User(userDisplayName));
                /*
                 *  public static final String     USER_ID = "fd2a1d6d-3419-401c-a021-cbd2b444d86c";
                    public static final String     USER_PASSWORD = "qwertyPASS";
                    public static final String     USER_DISPLAY_NAME = "JohnS00";
                    public static final String     USER_GENDER = "Male";
                    public static final int        USER_AGE = 22;
                    public static final String     USER_CREATION_DATE = "05-26-22";
                    public static final int        USER_NUMBER_OF_GROUPS = 2;
                    public static final String[]   USER_HOBBIES = {"Rafting", "Baseball"};
                    public static final String     USER_EMAIL_ADDRESS = "jsmith00@gmail.com";
                    public static final boolean    USER_HAS_AGREED_TO_TERMS = true;
                    public static final boolean    USER_PROFILE_IS_PUBLIC = false;
                    public static final String[]   USER_FAVORITE_GROUPS = {"ColumbiaFireFliesWatchers", "River-Rafters of Columbia"};
                    public static final String[]   USER_CATEGORIES_OF_INTEREST = {"sports", "outdoors"};
                    public static final boolean    USER_ADMIN_PRIVILEGES = false;
                    public static final boolean    USER_AUTHOR_PRIVILEGES = true;
                 */
            }
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
    public static void main(String[] args) {

    }
}
