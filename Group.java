import java.util.*;
public class Group 
{
    private ArrayList<Category> category = new ArrayList<Category>();
    private ArrayList<User> members = new ArrayList<User>();
    private String name;
    private String shortDescription;
    private String longDescriptiopn;
    private int rating;
    private Author author;
    private String authorContact;
    private ArrayList<Message> messages = new ArrayList<Message>();

    private Group(UUID id, String name, String shortDescription, ArrayList<Category> category, ArrayList<User> members, ArrayList<Event> events)
    {
        
    }

    public void joinGroup(User member)
    {

    }

    public void leaveGroup(User member)
    {

    }

    public void displayMessage(User member)
    {

    }

    public void displayShortDescription(String shortDescription)
    {

    }

    public void displayLongDescription(String longDescription)
    {

    }

    public ArrayList<User> displayGroupMembers()
    {
        return members;
    }
}
