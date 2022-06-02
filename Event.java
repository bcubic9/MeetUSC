import java.util.ArrayList;

public class Event {
    private boolean inPerson = true; //default is true
    private ArrayList<Category> categories;
    private ArrayList <User> attendees;
    private String name;
    private String location; 
    private int eventSize;
    private ArrayList<User> rsvpedUsers;
    private String shortDescription;
    private String longDescription = "";
    private ArrayList<Message> messages;
    private UUID id;

public Event event(UUID id, String name, String shortDescription, ArrayList<Category> categories){
    this.id = id;
    this.name = name;
    this.shortDescription = shortDescription;
    this.categories = categories;
    this.attendees = new ArrayList<>();
    this.messages = new ArrayList<>();
    this.rsvpedUsers = new ArrayList<>();
}


public Event event(UUID id, String name, String shortDescription, String longDescription, 
ArrayList<Category> categories, ArrayList<User> attendees, ArrayList<Message> messages){
    this.id = id;
    this.name = name;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
    this.categories = categories;
    this.attendees = attendees;
    this.messages = messages;
    this.rsvpedUsers = new ArrayList<>();
}
    public String toString(){
      // double check this
        return name;
    }
}
