import java.util.ArrayList;

public class Event{
    public boolean inPerson;
    public ArrayList <Category> categories;
    public ArrayList <User> attendees;
    public String name;
    public String location; 
    public int eventSize;
    public ArrayList<User> rsvpedUsers;
    public String shortDescription;
    public String longDescription;
    public ArrayList<Message> messages;
public Event event(String name, String shortDescription, ArrayList<Category> categories){

}
public Event event(UUID id, String name, String shortDescription, String longDescription, 
ArrayList<Category> categories, String ArrayList<User> attendees, 
ArrayList<Message> messages){
    
}
    public String toString(){
        return "";
    }
}
