import java.util.ArrayList;
import java.util.UUID;


public class Event {
    private boolean inPerson = true; //default is true
    private ArrayList<Category> categories;
    private ArrayList<User> attendees;
    private String name;
    private String eventAddress; 
    private int eventSize;
    private String description = "";
    private ArrayList<String> eventComments = new ArrayList<String>();
    private UUID id;

public Event(String name, String description, ArrayList<Category> categories){
    this.id = UUID.randomUUID();
    this.name = name;
    this.description = description;
    this.categories = categories;
    this.attendees = new ArrayList<>();
}


private Event(UUID id, String name, String description, 
        ArrayList<Category> categories, ArrayList<User> attendees){
    //constructor we call from the database

    this.id = id;
    this.name = name;
    this.description = description;
    this.categories = categories;
    this.attendees = attendees;
}
    public void joinGroup(User attendee){
        //attendee.acceptAttendees(attendee); //acceptattendees() hasn't been made in User.java yet
    }

    public void leaveGroup(User attendee){
        //attendee.removeAttendees(attendee, true); //removeattendees() hasn't been made in User.java yet
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public int getEventSize() {
        return eventSize;
    }

    public boolean getInPerson() {
        return inPerson;
    }

    public String getDescription() {
        return description;
    }

    public boolean hasCategory(Category category){
        return categories.contains(category);
    }
    public String getEventName() {
        return this.name;
    }


    public UUID getEventId() {
        return id;
    }
     
    public String toString(){
      // double check this
        return name;
    }

    public ArrayList<String> getComments() {
        return eventComments;
    }
}
