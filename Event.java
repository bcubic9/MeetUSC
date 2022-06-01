
import java.util.ArrayList;

public class Event{
    public boolean inPerson;
    public ArrayList<Category> categories;
    public ArrayList <User> attendees;
    public String name;
    public String location; 
    public int eventSize;
    public ArrayList<User> rsvpedUsers;
    public String shortDescription;
    public String longDescription;
    public ArrayList<Message> messages;

public Event event(String name, String shortDescription, ArrayList<Category> categories){
    this.name = name;
    this.shortDescription = shortDescription;
    ArrayList<Category> categories = new ArrayList<>();
}
public Event event(UUID id, String name, String shortDescription, String longDescription, 
ArrayList<Category> categories, ArrayList<User> attendees, ArrayList<Message> messages){
    this.id = id; //id isn't declared
    this.name = name;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
    ArrayList<Category> categories = new ArrayList<>(); //try making the variables class variables instead of method variabels
    ArrayList<User> attendees = new ArrayList<>();      //so you dont get an error message for them.
    ArrayList<Message> messages = new ArrayList<>();

}
    public String toString(){
        return "";
    }
}
