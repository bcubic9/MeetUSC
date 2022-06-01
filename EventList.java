import java.util.ArrayList;


public class EventList{

    public ArrayList<Event> events;
    public ArrayList<EventList> eventList;


    public Event getInstance(){
        return events.get(0);
    }
    public ArrayList<Event> getEvents(){
        return events;
    }
    public void addEvent(Event event){

    }
    public Event editEvent(Event event) {
        return events.get(0);
        
    }
    public Event removeEvent(Event event){
   
        return events.get(0);
    }
    public Event searchForEvent(Event Event){
        return events.get(0);
    }
    public ArrayList<Event> getFavoriteEvent(){
        return events;
    }
    public void addFavoriteEvent(Event event){
        
    }
}
