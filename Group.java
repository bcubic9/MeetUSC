import java.util.*;

public class Group {

    private ArrayList<Category> category;
    private ArrayList<User> members;
    private ArrayList<Event> events;
    private String name;
    private String description;
    private int rating;
    private Author author;
    private ArrayList<String> chat;
    private String authorContact;
    private UUID id;

    public Group(String name, String description, ArrayList<Category> category) {

        id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.category = category;

    }

    public Group(UUID id, String name, String description, ArrayList<Category> category,
            ArrayList<User> members, ArrayList<Event> events) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.category = category;
        this.members = members;
        this.events = events;

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

    public ArrayList<User> getGroupMembers()
    {
        return null;
    }

    public int getGroupRating()
    {
        return rating; 
    }

    public Author getAuthor()
    {
        return null;
    }

    public ArrayList<String> getMessages()
    {
        return chat; 
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

    public void setUpcomingEvents(ArrayList<Event> events)
    {
        this.events = events;
    }

    public void setCategoryTypes(ArrayList<Category> category)
    {
        this.category = category;
    }

    public void setGroupRating(int rating)
    {
        this.rating = rating;
    }

    public void setAuthor(Author author)
    {
        this.author = author;
    }

    public void addMessages(String message)
    {
        chat.add(message);
    }

    public void setAuthorContact(String authorContact)//Author's email
    {
        this.authorContact = authorContact;
    }

    public void addToAllGroups(Group group){
        
    }
}
