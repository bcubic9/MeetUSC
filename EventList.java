import java.util.ArrayList;
import java.util.UUID;

public class EventList {

  private static EventList eventList = null;

  public ArrayList<Event> events;

  private EventList() {
    this.events = DataReader.getEvents();

  }
 /**
  *The getInstance method gets the current instance and returns it.
  *Used for the singleton
  * @return the current instance of evenList
  */
  public static EventList getInstance() {
    if (eventList == null) {
      eventList = new EventList();
    }
    return eventList;
  }

  public ArrayList<Event> getEvents() {
    return events;
  }
  /**
   * creates an event object and adds it to the Event List
   * @param name
   * @param shortDescription
   * @param categories
   * @return the event 
   */
  public Event addEvent(String name, String shortDescription, ArrayList<Category> categories) {// Change in lucid Chart
    Event event = new Event(name, shortDescription, categories);
    events.add(event);
    return event;
  }
/**
 * removes a event from the event List
 * @param event
 * @return the event list without the event that was removed
 */
  public ArrayList<Event> removeEvent(Event event) {
    events.remove(event);
    return events;
  }
/**
 * The method allows for an Event to be searched for by the category associated to the event
 * @param categories
 * @return the events associated with the category searched
 */
  public ArrayList<Event> searchByCategory(Category categories) {
    ArrayList<Event> relevantEvents = new ArrayList<>();
    for (Event e : events) {
      if (e.hasCategory(categories)) {
        relevantEvents.add(e);
      }
    }
    return relevantEvents;
  }

  /**
   * The method allows user to search events by specific name
   * @param name
   * @return the relevant events that have the name searched
   */
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

  /**
   * The method assigned a UUID to an event 
   * @param ID
   * @return returns the UUID associated to the event
   */
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
