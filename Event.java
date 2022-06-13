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
    private ArrayList<String> eventComments;
    private UUID id;

public Event(String name, String description, ArrayList<Category> categories){
    this.id = UUID.randomUUID();
    this.name = name;
    this.description = description;
    this.categories = categories;
    this.attendees = new ArrayList<>();
}
//Connected to datareader
public Event(UUID eventID, String eventName, String eventAddress, int eventSize, 
             boolean eventInPerson, String eventDescription, ArrayList<String> eComment) {
    this.id = eventID;
    this.name = eventName;
    this.eventAddress = eventAddress;
    this.eventSize = eventSize;
    this.inPerson = eventInPerson;
    this.description = eventDescription;
    this.eventComments = eComment;
    //attendees to be added later on, after other problems are fixed
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
/*
@param String getEventAddress returns the eventAdress as a String
*/
    public String getEventAddress() {
        return eventAddress;
    }
/*
@param getEventSize returns the size of the event as an integer.
*/
    public int getEventSize() {
        return eventSize;
    }
/*
@param getInPerson returns a boolean on whether or not a given event will be in person or not.
*/
    public boolean getInPerson() {
        return inPerson;
    }
/*
@param getDescription returns a discription of the event as a string
*/
    public String getDescription() {
        return description;
    }
/*
@param hasCategory takes in a category as a parameter and returns true or false based on whether or not an event has a category.
*/
    public boolean hasCategory(Category category){
        return categories.contains(category);
    }
    /*
* @param getEventName returns the name of the event
*/
    public String getEventName() {
        return this.name;
    }

/*
@param getEventID returns the events id
*/
    public UUID getEventId() {
        return id;
    }
/*
@param toString
*/
    public String toString(){
      // double check this
        return name;
    }
/*
@param getcomments returns the eventComments
*/
    public ArrayList<String> getComments() {
        return eventComments;
    }
}
