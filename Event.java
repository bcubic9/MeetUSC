import java.util.ArrayList;
import java.util.UUID;


public class Event {
    private boolean inPerson = true; //default is true
    private ArrayList<Category> categories;
    private ArrayList<User> attendees;
    private String name;
    private String eventAddress; 
    private int eventSize;
    private ArrayList<User> rsvpedUsers;
    private String description = "";
    private ArrayList<Message> messages;
    private UUID id;

private Event(String name, String description, ArrayList<Category> categories){
    this.id = UUID.randomUUID();
    this.name = name;
    this.description = description;
    this.categories = categories;
    this.attendees = new ArrayList<>();
    this.messages = new ArrayList<>();
    this.rsvpedUsers = new ArrayList<>();

}


private Event(UUID id, String name, String description, 
        ArrayList<Category> categories, ArrayList<User> attendees,
        ArrayList<Message> messages, ArrayList<User> rsvpedUsers){
    //constructor we call from the database

    this.id = id;
    this.name = name;
    this.description = description;
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

    public ArrayList<Message> getComments() {
        return messages;
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
