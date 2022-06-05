import java.util.ArrayList;
import java.util.UUID;


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

public Event(String name, String shortDescription, ArrayList<Category> categories){
    this.id = UUID.randomUUID();
    this.name = name;
    this.shortDescription = shortDescription;
    this.categories = categories;
    this.attendees = new ArrayList<>();
    this.messages = new ArrayList<>();
    this.rsvpedUsers = new ArrayList<>();

}


public Event(UUID id, String name, String shortDescription, String longDescription, 
ArrayList<Category> categories, ArrayList<User> attendees, ArrayList<Message> messages, ArrayList<User> rsvpedUsers){
    //constructor we call from the database

    this.id = id;
    this.name = name;
    this.shortDescription = shortDescription;
    this.longDescription = longDescription;
    this.categories = categories;
    this.attendees = attendees;
    this.messages = messages;
    this.rsvpedUsers = rsvpedUsers;
}
    public void joinGroup(User attendee){
        //attendee.acceptAttendees(attendee); //acceptattendees() hasn't been made in User.java yet
    }

    public void leaveGroup(User attendee){
        //attendee.removeAttendees(attendee, true); //removeattendees() hasn't been made in User.java yet
         

    }

    public void displayMessage(User attendee){


    }
    public boolean hasCategory(Category category){
        return categories.contains(category);
    }
    public void displayShortDescription(String shortDescription){

    }
    public String getEventName() {
        return this.name;
    }
    public void displayLongDescription(String longDescription){



    }

    public void displayGroupMember(ArrayList<User> attendees){

        System.out.println(attendees);

    }

    public void displayTypesOfCategories(ArrayList<Category> typesOfCategories){

        System.out.println(typesOfCategories);
        

    }

    public UUID getEventId() {
        return id;
    }

    public void displayInPerson(Boolean inPerson){
        if(inPerson == true){
        
        }

        

    }

    public void addToAllGroups(Group group){

        //group.addToAllGroups(group); //addtoallgroups() hasn't been made in Group.java yet.
    }   




    public String toString(){
      // double check this
        return name;
    }
}
