import java.util.ArrayList;
import java.util.Date;

public class InPerson {
    private Location location;
    private Date eDate;
    private int numOfAttendees;
    private ArrayList<User> eventAttendees = new ArrayList<User>();

    private InPerson() {
        
    }
    private ArrayList<User> getAttendees(){
        return eventAttendees;
    }
    private void addAttendee(User  attendee){

    }
    public String toString(){
        return "";
    }
}