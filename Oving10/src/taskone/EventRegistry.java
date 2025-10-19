package taskone;


import java.util.ArrayList;
import java.util.Objects;

/**
 * Class to register events.
 * */
public class EventRegistry {

  public ArrayList<Event> events;


  /**
   * Constructor for event registry.
   * */
  public EventRegistry() {
    events = new ArrayList<Event>();
  }


  /**
   * Method to register new events.
   * */
  public void registerNewEvent(String eventName, String eventLocation,
      String eventHost, String eventType, long eventDate) {
    int eventKey = events.size();
    events.add(new Event(eventKey, eventName, eventLocation, eventHost, eventType, eventDate));
  }

  /**
   * Method to get events by location.
   * */
  public ArrayList<Event> getEventsByLocation(String eventLocation) {
    ArrayList<Event> tempEvents = new ArrayList<>();
    for (Event event : events) {
      if (Objects.equals(event.getEventLocation(), eventLocation)) {
        tempEvents.add(event);
      }
    }
    return tempEvents;
  }

  /**
   * Method.
   * */
  public ArrayList<Event> getEventsByDate(String targetEventDate) {
    ArrayList<Event> tempEvents = new ArrayList<>();
    for (Event event : events) {
      String eventDateString = Long.toString(event.getEventDate());
      if (eventDateString.substring(0, 7).equals(targetEventDate)) {
        tempEvents.add(event);
      }
    }
    return tempEvents;
  }

  /**
   * Method.
   * */
  public ArrayList<Event> getEventsWithinDates(long startIntervalEventDate,
      long endIntervalEventDate) {
    ArrayList<Event> tempEvents = new ArrayList<>();
    for (Event event : events) {
      if (startIntervalEventDate < event.getEventDate()
          && event.getEventDate() < endIntervalEventDate) {
        tempEvents.add(event);
      }
    }
    return tempEvents;
  }

}
