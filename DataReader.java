import java.util.ArrayList;
import java.util.UUID;
import java.io.FileNotFoundException;
import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataReader extends JsonConstants {

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray userJSON = (JSONArray) parser.parse(reader);
            ArrayList<String> hobbies = new ArrayList<String>();
            ArrayList<Category> interestCat = new ArrayList<Category>();
            ArrayList<UUID> groupsJoined = new ArrayList<UUID>();
            ArrayList<UUID> groupsAuthored = new ArrayList<UUID>();
            for (int i = 0; i < userJSON.size(); i++) {
                // Need to make sure that these are not all strings when done.
                JSONObject userJsonObject = (JSONObject) userJSON.get(i);
                UUID userID = UUID.fromString((String) userJsonObject.get(USER_ID));
                String userPass = (String) userJsonObject.get(USER_PASSWORD);
                String userUserName = (String) userJsonObject.get(USER_USERNAME);
                String userFirstName = (String) userJsonObject.get(USER_FIRST_NAME);
                String userLastName = (String) userJsonObject.get(USER_LAST_NAME);
                String userGender = (String) userJsonObject.get(USER_GENDER);
                int userAge = ((Long) userJsonObject.get(USER_AGE)).intValue();
                /*
                 * 
                 */
                JSONArray userHobbies = (JSONArray) userJsonObject.get(USER_HOBBIES);
                if (userHobbies != null) {
                    for (int j = 0; (j < userHobbies.size() - 1); j++) {
                        hobbies.add((String) userHobbies.get(i));
                    }
                }
                String userEmail = (String) userJsonObject.get(USER_EMAIL_ADDRESS);
                Boolean userAgreedToTerms = (Boolean) userJsonObject.get(USER_HAS_AGREED_TO_TERMS);
                Boolean userProfileIsPublic = (Boolean) userJsonObject.get(USER_PROFILE_IS_PUBLIC);
                JSONArray userCategoriesOfInterest = (JSONArray) userJsonObject.get(USER_CATEGORIES_OF_INTEREST);
                if (userCategoriesOfInterest != null) {
                    for (int k = 0; k < userCategoriesOfInterest.size(); k++) {
                        for (Category cat : Category.values()) {
                            if (!interestCat.contains(cat) && userCategoriesOfInterest.contains(cat.toString())) {
                                interestCat.add(cat);// loop through category enum.
                            }
                        }
                        // interestCat.add((Category)userCategoriesOfInterest.get(k));// loop through
                        // category enum.
                    }
                }
                JSONArray userGroupsJoined = (JSONArray) userJsonObject.get(USER_GROUPS_JOINED);
                if (userGroupsJoined != null) {
                    for (int m = 0; m < userGroupsJoined.size(); m++) {
                        groupsJoined.add(UUID.fromString(userGroupsJoined.get(m).toString()));
                    }
                }
                Boolean userAdminPrivileges = (Boolean) userJsonObject.get(USER_ADMIN_PRIVILEGES);
                JSONArray userAuthorOf = (JSONArray) userJsonObject.get(USER_AUTHOR_OF);
                if (userAuthorOf != null) {
                    for (int m = 0; m < userAuthorOf.size(); m++) {
                        groupsAuthored.add(UUID.fromString(userAuthorOf.get(m).toString())); // convert to group uuid
                                                                                             // and change json
                    }
                }

                users.add(new User(userID, userPass, userUserName, userFirstName, userLastName, userGender, userAge,
                        hobbies, userEmail, userAgreedToTerms, userProfileIsPublic,
                        interestCat, groupsJoined, userAdminPrivileges, groupsAuthored));
            }

            return users;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Event> getEvents() {
        ArrayList<Event> events = new ArrayList<Event>();
        try {
            FileReader reader = new FileReader(EVENT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray eventJSON = (JSONArray) parser.parse(reader);
            ArrayList<String> eComment = new ArrayList<String>();

            for (int i = 0; i < eventJSON.size(); i++) {
                JSONObject eventJsonObject = (JSONObject) eventJSON.get(i);
                UUID eventID = UUID.fromString((String) eventJsonObject.get(EVENT_ID));
                String eventName = (String) eventJsonObject.get(EVENT_NAME);
                String eventAddress = (String) eventJsonObject.get(EVENT_ADDRESS);
                int eventSize = ((Long) eventJsonObject.get(EVENT_SIZE)).intValue();
                boolean eventInPerson = (Boolean) eventJsonObject.get(EVENT_IN_PERSON);
                String eventDescription = (String) eventJsonObject.get(EVENT_DESCRIPTION);
                JSONArray eventComments = (JSONArray) eventJsonObject.get(EVENT_COMMENTS);
                if (eventComments != null) {
                    for (int n = 0; n < eventComments.size(); n++) {
                        eComment.add((String) eventComments.get(n));
                    }
                }
                events.add(new Event(eventID, eventName, eventAddress, eventSize,
                        eventInPerson, eventDescription, eComment));
            }

            return events;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static ArrayList<Group> getGroups() {
        ArrayList<Group> groups = new ArrayList<Group>();
        try {
            FileReader reader = new FileReader(GROUP_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray groupJSON = (JSONArray) parser.parse(reader);
            ArrayList<String> groupUpcomingEvent = new ArrayList<String>();
            ArrayList<Category> groupCategories = new ArrayList<Category>();
            ArrayList<UUID> groupMemberList = new ArrayList<UUID>();
            ArrayList<String> groupMessageList = new ArrayList<String>();

            for (int i = 0; i < groupJSON.size(); i++) {
                // Need to make sure that these are not all strings when done.
                JSONObject groupJsonObject = (JSONObject) groupJSON.get(i);
                UUID groupID = UUID.fromString((String) groupJsonObject.get(GROUP_ID));
                String groupName = (String) groupJsonObject.get(GROUP_NAME);
                JSONArray groupUpcomingEvents = (JSONArray) groupJsonObject.get(GROUP_UPCOMING_EVENTS);
                if (groupUpcomingEvents != null) {
                    for (int j = 0; j < groupUpcomingEvents.size(); j++) {
                        groupUpcomingEvent.add(groupUpcomingEvents.get(j).toString());
                    }
                }
                JSONArray groupCategoryTypes = (JSONArray) groupJsonObject.get(GROUP_CATEGORY_TYPES);
                if (groupCategoryTypes != null) {
                    for (int j = 0; j < groupCategoryTypes.size(); j++) {
                        for (Category cat : Category.values()) {
                            if (cat.toString().equals(groupCategoryTypes.toString())) {
                                groupCategories.add(cat);// loop through category enum.
                            }
                        }
                        // groupCategories.add((Category)groupCategoryTypes.get(j));
                    }
                }
                JSONArray groupMembers = (JSONArray) groupJsonObject.get(GROUP_MEMBERS);
                if (groupMembers != null) {
                    for (int j = 0; j < groupMembers.size(); j++) {
                        groupMemberList.add(UUID.fromString((String) groupMembers.get(j)));
                    }
                }
                String groupDescription = (String) groupJsonObject.get(GROUP_DESCRIPTION);
                int groupRating = ((Long) groupJsonObject.get(GROUP_RATING)).intValue();
                String groupAuthor = (String) groupJsonObject.get(GROUP_AUTHOR);
                JSONArray groupMessages = (JSONArray) groupJsonObject.get(GROUP_MESSAGES);
                if (groupMessages != null) {
                    for (int j = 0; j < groupMessages.size(); j++) {
                        groupMessageList.add((String) groupMessages.get(j));
                    }
                }
                String groupAuthorContact = (String) groupJsonObject.get(GROUP_AUTHOR_CONTACT);

                groups.add(new Group(groupID, groupName, groupUpcomingEvent, groupCategories,
                        groupMemberList, groupDescription, groupRating, groupAuthor, groupMessageList,
                        groupAuthorContact));
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
        ArrayList<User> allusers = new ArrayList<User>();

        System.out.println("Hello, this is a test of the json filereader class");
        allusers = DataReader.getUsers();
        for (User user : allusers) {
            System.out.println(user.firstName + " " + user.lastName);
            System.out.println(user.email);
            System.out.println(user.groupsJoined);
            System.out.println(); // to make look cleaner
            System.out.println(user.categoriesOfInterest);
            System.out.println();
            System.out.println(user.authorOf);
            System.out.println();
            System.out.println();
        }
        // System.out.println(users.toString());
        // System.out.println(users);

        System.out.println("This is a test of the event information.");
        ArrayList<Event> allevents;
        allevents = DataReader.getEvents();
        for (Event event : allevents) {
            System.out.println(event.getEventName() + " ");
            System.out.println(event.getEventAddress());
        }

        System.out.println("This is a test of the group information.");
        ArrayList<Group> allGroups;
        allGroups = DataReader.getGroups();
        for (Group group : allGroups) {
            System.out.println("Group Name: " + group.getGroupName());
            System.out.println("Group Description: " + group.getDescription());
        }
    }
}
