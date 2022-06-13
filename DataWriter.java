import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.util.UUID;

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
        userDetails.put(USER_USERNAME, user.getUserName().toString());
        userDetails.put(USER_FIRST_NAME, user.getFirstName().toString());
        userDetails.put(USER_LAST_NAME, user.getLastName().toString());
        userDetails.put(USER_GENDER, user.getUserGender().toString());
        userDetails.put(USER_AGE, user.getUserAge());
        GroupList gl = GroupList.getInstance();
        for(Group group : gl.getGroups()) {
            for(String g : user.getJoinedGroups())
            if(group.getGroupName().equals(g)) {
                userDetails.put(USER_GROUPS_JOINED, g);
            }
        }
        //userDetails.put(USER_GROUPS_JOINED, user.getJoinedGroups());
        //userDetails.put(USER_HOBBIES, user.getHobby().toString());
        for(String hobby : user.getHobby()) {
            userDetails.put(USER_HOBBIES, hobby);
        }

        userDetails.put(USER_EMAIL_ADDRESS, user.getEmailAddress().toString());
        userDetails.put(USER_HAS_AGREED_TO_TERMS, user.getHasAgreedToTerms());
        userDetails.put(USER_PROFILE_IS_PUBLIC, user.getProfileIsPublic());
        userDetails.put(USER_CATEGORIES_OF_INTEREST, user.getCategoriesOfInterest().toString());
        userDetails.put(USER_ADMIN_PRIVILEGES, user.getAdminPrivileges());
        userDetails.put(USER_AUTHOR_OF, user.getGroupsCreated());

        return userDetails;
    }

    public void saveEvents() {
        EventList events = EventList.getInstance();
        ArrayList<Event> eventList = events.getEvents();
        JSONArray jsonEvents = new JSONArray();

        for (int i = 0; i < eventList.size(); i++) {
            jsonEvents.add(getEventJSON(eventList.get(i)));
        }
    }

    public JSONObject getEventJSON(Event event) {
        JSONObject eventDetails = new JSONObject();

        eventDetails.put(EVENT_ID, event.getEventId());
        eventDetails.put(EVENT_NAME, event.getEventName());
        eventDetails.put(EVENT_ADDRESS, event.getEventAddress());
        eventDetails.put(EVENT_SIZE, event.getEventSize());
        eventDetails.put(EVENT_IN_PERSON, event.getInPerson());
        eventDetails.put(EVENT_DESCRIPTION, event.getDescription());
        eventDetails.put(EVENT_COMMENTS, event.getComments());
        /*
         * "EVENT_ID":"840b1734-dd18-11ec-9d64-0242ac120002",
         * "EVENT_NAME":"Axe Throwing ",
         * "EVENT_ADDRESS":"700 Gervais St b2, Columbia, SC 29201",
         * "EVENT_SIZE": 10,
         * "EVENT_IN_PERSON": true,
         * "EVENT_DESCRIPTION": "Aim for the head!",
         * "EVENT_COMMENTS" :
         * ["Dude you should have seen the target from our last axe throwing event",
         * "Yeah, man. I wish I was able to go."]
         */
        return eventDetails;
    }

    public void saveGroups() {
        GroupList groups = GroupList.getInstance();
        ArrayList<Group> groupList = groups.getGroups();
        JSONArray jsonGroups = new JSONArray();
        for (int i = 0; i < groupList.size(); i++) {
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

    public JSONObject getGroupJSON(Group group) {
        JSONObject groupDetails = new JSONObject();
        JSONArray groupMembers = new JSONArray(); //RELATED TO TESTING CODE
        groupDetails.put(GROUP_ID, group.getGroupId().toString());
        groupDetails.put(GROUP_NAME, group.getGroupName().toString());
        groupDetails.put(GROUP_UPCOMING_EVENTS, group.getUpcomingEvents().toString());
        groupDetails.put(GROUP_CATEGORY_TYPES, group.getCategoryTypes().toString());
        /* CODE MADE JUST IN CASE IT DOESN'T WORK DURING TESTING.
        if(group.getGroupMembers() != null) {
            for(UUID member : group.getGroupMembers()) {
                groupMembers.put(GROUP_MEMBERS, member.toString()); //need to change the parameters.
            }
            for(int i = 0; i < group.getGroupMembers().size(); i++) {
                groupMembers.put(i);
            }
        }
        */
        groupDetails.put(GROUP_MEMBERS, group.getGroupMembers().toString());
        groupDetails.put(GROUP_DESCRIPTION, group.getDescription().toString());
        groupDetails.put(GROUP_RATING, group.getGroupRating());
        groupDetails.put(GROUP_AUTHOR, group.getAuthor().toString()); // may need a review
        groupDetails.put(GROUP_MESSAGES, group.getMessageList().toString());
        groupDetails.put(GROUP_AUTHOR_CONTACT, group.getContact().toString());

        return groupDetails;
    }
}
