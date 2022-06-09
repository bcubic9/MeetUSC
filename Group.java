import java.util.*;

public class Group {

    private ArrayList<Category> categories;
    private ArrayList<UUID> members;
    private ArrayList<UUID> events;
    private String name;
    private String description;
    private int rating;
    private ArrayList<String> chat;
    private String authorContact;
    private UUID id;
    private ArrayList<String> messageList;

    public Group(String name, String description, ArrayList<Category> categories) {

        id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.categories = categories;

    }

    public Group(UUID groupID, String groupName, ArrayList<UUID> groupUpcomingEvent, ArrayList<Category> groupCategories,
                 ArrayList<UUID> groupMemberList, String groupDescription, int groupRating, ArrayList<String> groupMessageList,
                 String groupAuthorContact) {
        this.id = groupID;
        this.name = groupName;
        this.events = groupUpcomingEvent;
        this.categories = groupCategories;
        this.members = groupMemberList;
        this.description = groupDescription;
        this.rating = groupRating;
        this.messageList = groupMessageList;
        this.authorContact = groupAuthorContact;
    }

/*    public Group(UUID id, String name, String description, ArrayList<Category> categories,
            ArrayList<User> members, ArrayList<Event> events) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.categories = categories;
        this.members = members;
        this.events = events;

    }
*/
    public ArrayList<UUID> getEventID()
    {
        return events;
    }

    public void addEventID(UUID eventID)
    {
        events.add(eventID);
    }
    public ArrayList<String> getMessageList()
    {
        return messageList;
    }

    public void addMessage(String message)
    {
        messageList.add(message);
    }

    public String getDescription() {
        return description;
    }

    public String getGroupName() {
        return name;
    }

    public UUID getGroupId() {
        return id;
    }

    public ArrayList<Event> getUpcomingEvents()
    {
        return null;
    }

    public ArrayList<String> getCategoryTypes()
    {
        return null;
    }

    public ArrayList<UUID> getGroupMembers()
    {
        return members;
    }

    public void addMembers(UUID memberID)
    {
        members.add(memberID);
    }

    public int getGroupRating()
    {
        return rating; 
    }

    public String getContact()
    {
        return authorContact;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setGroupName(String name)
    {
        this.name = name;
    }

    public void setGroupId(UUID id)
    {
        this.id = id;
    }

    public void setUpcomingEvents(ArrayList<UUID> events)
    {
        this.events = events;
    }

    public void setCategoryTypes(ArrayList<Category> category)
    {
        this.categories = category;
    }

    public void setGroupRating(int rating)
    {
        this.rating = rating;
    }

    public void setAuthorContact(String authorContact)//Author's email
    {
        this.authorContact = authorContact;
    }

    public void addToAllGroups(Group group){

    }

    public boolean hasCategory(Category category)
    {
        return categories.contains(category);
    }

    public UUID getAuthor() {
        UUID author;
        UserList ul = UserList.getInstance();
        for (User user : ul.getAllUsers()) {
            if(user.getEmailAddress().equals(authorContact)) {
                author = user.userId;
                return author;
            }
        }

        return null;
    }
}
