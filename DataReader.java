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
                JSONObject eventJsonObject = (JSONObject) eventJSON.get(i);
                UUID eventID = UUID.fromString((String) eventJsonObject.get(EVENT_ID));
                String eventName = (String) eventJsonObject.get(EVENT_NAME);
                String eventAddress = (String) eventJsonObject.get(EVENT_ADDRESS);
                int eventSize = ((Long) eventJsonObject.get(EVENT_SIZE)).intValue();
                boolean eventInPerson = (Boolean) eventJsonObject.get(EVENT_IN_PERSON);
                String eventDescription = (String) eventJsonObject.get(EVENT_DESCRIPTION);
                JSONArray eventComments = (JSONArray) eventJsonObject.get(EVENT_COMMENTS);
            }

            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public ArrayList<Group> getGroup() {
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray groupJSON = (JSONArray) parser.parse(reader);

            for (int i = 0; i < groupJSON.size(); i++) {
                // Need to make sure that these are not all strings when done.
                JSONObject groupJsonObject = (JSONObject) groupJSON.get(i);
                UUID eventID = UUID.fromString((String) groupJsonObject.get(GROUP_ID));
                String eventName = (String) groupJsonObject.get(GROUP_NAME);
                JSONArray groupUpcomingEvents = (JSONArray) groupJsonObject.get(GROUP_UPCOMING_EVENTS);
                JSONArray groupCategoryTypes = (JSONArray) groupJsonObject.get(GROUP_CATEGORY_TYPES);
                JSONArray groupMembers = (JSONArray) groupJsonObject.get(GROUP_MEMBERS);
                String groupDescription = (String) groupJsonObject.get(GROUP_DESCRIPTION);
                int groupRating = ((Long) groupJsonObject.get(GROUP_RATING)).intValue();
                JSONArray groupMessages = (JSONArray) groupJsonObject.get(GROUP_MESSAGES);
                String groupAuthorContact = (String) groupJsonObject.get(GROUP_AUTHOR_CONTACT);
            }

            return groups;
        } catch (Exception e) {
            e.printStackTrace();
        }

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
