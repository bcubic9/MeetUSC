import java.util.Date;
import java.util.ArrayList;
public class OnlineEvent {
private Location location;
private Date eDate;
private int numOfAttendees;

private ArrayList<User> eventAttendees = new ArrayList<User>();
    private ArrayList<User> getAttendees(){
        return eventAttendees;
    }
    private void addAttendee(User attendee){
        
    }
    public String toString(){
        return "";
    }
}