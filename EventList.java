import java.util.ArrayList;
import java.util.UUID;

public class EventList {

  private static EventList eventList = null;

  public ArrayList<Event> events;

  private EventList() {
    // this.events = DataReader.getEvents();

  }

  public static EventList getInstance() {
    if (eventList == null) {
      eventList = new EventList();
    }
    return eventList;
  }

  public ArrayList<Event> getEvents() {
    return events;
  }

  public Event addEvent(String name, String shortDescription, ArrayList<Category> categories) {// Change in lucid Chart
    Event event = new Event(name, shortDescription, categories);
    events.add(event);
    return event;
  }

  public ArrayList<Event> removeEvent(Event event) {
    events.remove(event);
    return events;
  }

  public ArrayList<Event> searchByCategory(Category categories) {
    ArrayList<Event> relevantEvents = new ArrayList<>();
    for (Event e : events) {
      if (e.hasCategory(categories)) {
        relevantEvents.add(e);
      }
    }
    return relevantEvents;
  }

  public ArrayList<Event> searchByName(String name) {

    ArrayList<Event> relevantEventsName = new ArrayList<>();
    for (Event e : events) {
      if (e.getEventName().toLowerCase().contains(name.toLowerCase()))
        ;
      {
        relevantEventsName.add(e);
      }
    }
    return relevantEventsName;
  }

  public Event getEventByUUID(UUID ID) {
    for (Event e : events) {
      if (e.getEventId().equals(ID)) {
        return e;
      }
    }
    return null;
  }

  public void logout() {
    // DataWriter.saveEvents();
  }
}
