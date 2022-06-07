import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends JsonConstants {

    public void saveUsers() {
        UserList users = UserList.getInstance(); // may need to switch form UserList to User
        ArrayList<User> userList = users.getUsers();
        JSONArray jsonUsers = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < userList.size(); i++) {
            jsonUsers.add(getUserJSON(userList.get(i)));
        }

        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonUsers.toJSONString());
            file.flush();

        } catch (IOException e) { // could get rid of IOException
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
        userDetails.put(USER_AUTHOR_OF, user.getAuthorPrivileges());

        return userDetails;
    }

    public void saveEvents() {
        EventList events = EventList.getInstance();
        ArrayList<Event> eventList = events.getEvents();
        JSONArray jsonEvents = new JSONArray();

        for(int i = 0; i < eventList.size(); i++)
        {
            jsonEvents.add(getEventJSON(eventList.get(i)));
        }
    }

    public JSONObject getEventJSON(Event event) {
        JSONObject eventDetails = new JSONObject();

        eventDetails.put(EVENT_ID, event.getEventId().toString());
        eventDetails.put(EVENT_NAME, event.getEventNametoString());
        eventDetails.put(USER_DISPLAY_NAME, user.getDisplayName().toString());
        eventDetails.put(USER_NAME, user.getName().toString());
        eventDetails.put(USER_GENDER, user.getUserGender().toString());
        eventDetails.put(USER_AGE, user.getUserAge());
        eventDetails.put(USER_CREATION_DATE, user.getUserCreationDate().toString());
        eventDetails.put(USER_NUMBER_OF_GROUPS, user.getNumberOfGroups());
        eventDetails.put(USER_HOBBIES, user.getHobby().toString());
        eventDetails.put(USER_EMAIL_ADDRESS, user.getEmailAddress().toString());
        eventDetails.put(USER_HAS_AGREED_TO_TERMS, user.getHasAgreedToTerms());
        eventDetails.put(USER_PROFILE_IS_PUBLIC, user.getProfileIsPublic());
        eventDetails.put(USER_FAVORITE_GROUPS, user.getFavoriteGroups().toString());
        eventDetails.put(USER_CATEGORIES_OF_INTEREST, user.getCategoriesOfInterest().toString());
        eventDetails.put(USER_ADMIN_PRIVILEGES, user.getAdminPrivileges());
        eventDetails.put(USER_AUTHOR_OF, user.getAuthorPrivileges());
    }

    public boolean saveGroups() {
        GroupList groups = GroupList.getInstance();
        ArrayList<Group> groupList = groups.getGroups();
        JSONArray jsonGroups = new JSONArray();
        for(int i = 0; i < groupList.size(); i++)
        {
            jsonGroups.add(getGroupJSON(groupList.get(i)));
        }

        try (FileWriter file = new FileWriter(GROUP_FILE_NAME)) {

            file.write(jsonGroups.toJSONString());
            file.flush();

        } catch (IOException e) { // could get rid of IOException
            e.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        } 
    }

    public JSONObject getGroupJSON(Group group)
    {
        JSONObject groupDetails = new JSONObject();
        groupDetails.put(GROUP_ID, group.getGroupId().toString());
        groupDetails.put(GROUP_NAME, group.getGroupName().toString());
        groupDetails.put(GROUP_UPCOMING_EVENTS, group.getUpcomingEvents().toString());
        groupDetails.put(GROUP_CATEGORY_TYPES, group.getCategoryTypes().toString());
        groupDetails.put(GROUP_MEMBERS, group.getGroupMembers().toString());
        groupDetails.put(GROUP_DESCRIPTION, group.getDescription().toString());
        groupDetails.put(GROUP_RATING, group.getGroupRating().toString());
        groupDetails.put(GROUP_AUTHOR, group.getAuthor().toString());
        groupDetails.put(GROUP_MESSAGES, group.getMessages().toString());
        groupDetails.put(GROUP_CONTACT, group.getContact().toString());

        return groupDetails;
    }
}
