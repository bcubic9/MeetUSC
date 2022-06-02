import java.util.ArrayList;


public class EventList{

    private static EventList eventList = null;

    public ArrayList<Event> events;

    private EventList{
      this.events = DataReader.getEvents();
      
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
    public void addEvent(String name, String shortDescription, ArrayList<Category> categories){//Change in lucid Chart
      Event event = new Event(name, shortDesciption, categories);
      events.add(event);
    }
    public ArrayList<Event> removeEvent(Event event) {
      events.remove(event);
      return events;
    }

    public ArrayList<Event> searchByCategory(Category category){
        ArrayList<Event> relevantEvents = new ArrayList<>();
        for (Event e : events) {
          if(e.hasCategory(category)){
            relevantEvents.add(e);
        }
        return relevantEvents;
    }
    public ArrayList<Event> searchByName(String name){
      return null;
    }
    public Event getEventByUUID(UUID ID){
      return null;
    } 
}
public void logout(){
  DataWriter.saveEvents();
}
}
