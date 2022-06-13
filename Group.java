import java.util.*;

public class Group {

    private ArrayList<Category> categories;
    private ArrayList<UUID> members;
    private ArrayList<UUID> events;
    private String name;
    private String description;
    private int rating;
    //private ArrayList<String> chat; //believe it is a duplicate of the messageList variable
    private String authorContact;
    private UUID id;
    private ArrayList<String> messageList;

    public Group(String name, String description, ArrayList<Category> categories2) {

        id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.categories = categories2;

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
 
/*
@param getEventID returns an arrayList of the events UUID
*/
    public ArrayList<UUID> getEventID()
    {
        return events;
    }
/*
@param addEventID takes in eventID as a parameter and adds the eventID to the array of events
*/
    public void addEventID(UUID eventID)
    {
        events.add(eventID);
    }
    /*
    @parram getMessageList is an arrayList of strings that will return the messageList
    */
    public ArrayList<String> getMessageList()
    {
        return messageList;
    }
/*
@param addMessage takes in message as a parameter and adds it to the string arraylist of messages.
*/
    public void addMessage(String message)
    {
        messageList.add(message);
    }
/*
@param getDescription returns description
*/
    public String getDescription() {
        return description;
    }
/*
@param getGroupName returns name
*/
    public String getGroupName() {
        return name;
    }
/*
@param getGroupID returns id
*/
    public UUID getGroupId() {
        return id;
    }
/*
@param getUpcomingEvents returns description
*/
    public ArrayList<Event> getUpcomingEvents()
    {
        return null;
    }
/*
@param getDescription returns description
*/
    public ArrayList<String> getCategoryTypes()
    {
        return null;
    }
/*
@param getGroupMembers returns members
*/
    public ArrayList<UUID> getGroupMembers()
    {
        return members;
    }
/*
@param addMembers takes in memberID as parameter and then adds it to the arrayList of members.
*/
    public void addMembers(UUID memberID)
    {
        members.add(memberID);
    }
/*
@param getGroupRating returns the integer rating
*/
    public int getGroupRating()
    {
        return rating; 
    }
/*
@param getDescription returns the string authorContact
*/
    public String getContact()
    {
        return authorContact;
    }
/*
@param setDescription  sets the descirption for the group
*/
    public void setDescription(String description)
    {
        this.description = description;
    }
/*
@param setGroupName sets the name for the group
*/
    public void setGroupName(String name)
    {
        this.name = name;
    }
/*
@param setDescription  sets the id for the group
*/
    public void setGroupId(UUID id)
    {
        this.id = id;
    }
/*
@param setUpcomingEvents  sets the events for the group
*/
    public void setUpcomingEvents(ArrayList<UUID> events)
    {
        this.events = events;
    }
/*
@param setCategoryTypes  sets the categories for the group
*/
    public void setCategoryTypes(ArrayList<Category> category)
    {
        this.categories = category;
    }
/*
@param setDescription  sets the descirption for the group
*/
    public void setGroupRating(int rating)
    {
        this.rating = rating;
    }
/*
@param setDescription  sets the descirption for the group
*/
    public void setAuthorContact(String authorContact)//Author's email
    {
        this.authorContact = authorContact;
    }
/*
@param addToAllGroups  sets the descirption for the group
*/
    public void addToAllGroups(Group group){

    }
/*
@param hasCategory  returns whether or not it is true that a group is part of a category.
*/
    public boolean hasCategory(Category category)
    {
        return categories.contains(category);
    }
/*
@param UUID getAuthor will return an authors UUID
*/
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
