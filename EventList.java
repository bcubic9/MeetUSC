import java.util.ArrayList;


public class EventList{

    private static EventList eventList = null;

    public ArrayList<Event> events;

    private EventList(){
      this.events = new ArrayList<Event>();
      
    }

    public EventList getInstance(){
        if (eventList == null) {
          eventList = new EventList();
        }
        return eventList;
    }
    public ArrayList<Event> getEvents(){
        return events;
    }
    public void addEvent(Event event){
      events.add(event);
    }
    public ArrayList<Event> removeEvent(Event event) {
      events.remove(event);
      return events;
    }
    public ArrayList<Event> searchForEvent(Category category){
        ArrayList<Event> relevantEvents = new ArrayList<>();
        for (Event e : events) {
          if(e.categories().contains(category)){
            relevantEvents.add(e);
        }
        return relevantEvents;
    }
}
}
