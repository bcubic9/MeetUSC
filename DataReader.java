import java.util.ArrayList;
import java.util.UUID;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends JsonConstants {
    public static ArrayList<User> users = new ArrayList<User>();
    public static ArrayList<Event> events = new ArrayList<Event>();
    public static ArrayList<Group> groups = new ArrayList<Group>();

    public ArrayList<User> getUsers() {
        // ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray) parser.parse(reader);

            for (int i = 0; i < userJSON.size(); i++) {
                // Need to make sure that these are not all strings when done.
                JSONObject userJsonObject = (JSONObject) userJSON.get(i);
                UUID userID = UUID.fromString((String) userJsonObject.get(USER_ID));
                String userPass = (String) userJsonObject.get(USER_PASSWORD);
                String userDisplayName = (String) userJsonObject.get(USER_DISPLAY_NAME);
                String userName = (String) userJsonObject.get(USER_NAME);
                String userGender = (String) userJsonObject.get(USER_GENDER);
                int userAge = ((Long) userJsonObject.get(USER_AGE)).intValue();
                String userCreationDate = (String) userJsonObject.get(USER_CREATION_DATE);
                int userNumOfGroups = ((Long) userJsonObject.get(USER_NUMBER_OF_GROUPS)).intValue();
                JSONArray userHobbies = (JSONArray) userJsonObject.get(USER_HOBBIES);
                String userEmail = (String) userJsonObject.get(USER_EMAIL_ADDRESS);
                Boolean userAgreedToTerms = (Boolean) userJsonObject.get(USER_HAS_AGREED_TO_TERMS);
                Boolean userProfileIsPublic = (Boolean) userJsonObject.get(USER_PROFILE_IS_PUBLIC);
                JSONArray userFavGroups = (JSONArray) userJsonObject.get(USER_FAVORITE_GROUPS);
                JSONArray userCategoriesOfInterest = (JSONArray) userJsonObject.get(USER_CATEGORIES_OF_INTEREST);
                Boolean userAdminPrivileges = (Boolean) userJsonObject.get(USER_ADMIN_PRIVILEGES);
                JSONArray userAuthorOf = (JSONArray) userJsonObject.get(USER_AUTHOR_OF);
                /*
                 * users.add(new User(userID, userPass, userDisplayName, userName, userGender,
                 * userAge,
                 * userCreationDate, userNumOfGroups, userHobbies, userEmail, userAgreedToTerms,
                 * userProfileIsPublic, userFavGroups, userCategoriesOfInterest,
                 * userAdminPrivileges,
                 * userAuthorPrivileges));
                 */
            }

            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<Event> getEvent() {
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray eventJSON = (JSONArray) parser.parse(reader);

            for (int i = 0; i < eventJSON.size(); i++) {
                // Need to make sure that these are not all strings when done.
                JSONObject eventJsonObject = (JSONObject) eventJSON.get(i);
                UUID eventID = UUID.fromString((String) eventJsonObject.get(USER_ID));
                String userPass = (String) eventJsonObject.get(USER_PASSWORD);
                String userDisplayName = (String) eventJsonObject.get(USER_DISPLAY_NAME);
                String userName = (String) eventJsonObject.get(USER_NAME);
                String userGender = (String) eventJsonObject.get(USER_GENDER);
                int userAge = ((Long) eventJsonObject.get(USER_AGE)).intValue();
                String userCreationDate = (String) eventJsonObject.get(USER_CREATION_DATE);
                int userNumOfGroups = ((Long) eventJsonObject.get(USER_NUMBER_OF_GROUPS)).intValue();
                JSONArray userHobbies = (JSONArray) eventJsonObject.get(USER_HOBBIES);
                String userEmail = (String) eventJsonObject.get(USER_EMAIL_ADDRESS);
                Boolean userAgreedToTerms = (Boolean) eventJsonObject.get(USER_HAS_AGREED_TO_TERMS);
                Boolean userProfileIsPublic = (Boolean) eventJsonObject.get(USER_PROFILE_IS_PUBLIC);
                JSONArray userFavGroups = (JSONArray) eventJsonObject.get(USER_FAVORITE_GROUPS);
                JSONArray userCategoriesOfInterest = (JSONArray) eventJsonObject.get(USER_CATEGORIES_OF_INTEREST);
                Boolean userAdminPrivileges = (Boolean) eventJsonObject.get(USER_ADMIN_PRIVILEGES);
                JSONArray userAuthorOf = (JSONArray) eventJsonObject.get(USER_AUTHOR_OF);
                /*
                 * users.add(new User(userID, userPass, userDisplayName, userName, userGender,
                 * userAge,
                 * userCreationDate, userNumOfGroups, userHobbies, userEmail, userAgreedToTerms,
                 * userProfileIsPublic, userFavGroups, userCategoriesOfInterest,
                 * userAdminPrivileges,
                 * userAuthorPrivileges));
                 */
            }

            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<Group> getGroup() {
        return null;
    }

    /**
     * Method to be deleted at a later time.
     */
    public static void main(String[] args) throws FileNotFoundException {
        DataReader dr = new DataReader();
        ArrayList<User> allusers = new ArrayList<User>();

        System.out.println("Hello, this is a test of the json filereader class");
        allusers = dr.getUsers();
        System.out.println(users.toString());
        // System.out.println(users);
    }
}
