package taskone;


import java.util.ArrayList;
import java.util.Comparator;
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
      if (Objects.equals(event.getEventLocation().toLowerCase(), eventLocation.toLowerCase())) {
        tempEvents.add(event);
      }
    }
    return tempEvents;
  }

  /**
   * Method to return arraylist of events with a specific date.
   * */
  public ArrayList<Event> getEventsByDate(String targetEventDate) {
    ArrayList<Event> tempEvents = new ArrayList<>();
    for (Event event : events) {
      String eventDateString = Long.toString(event.getEventDate());
      if (eventDateString.substring(0, 8).equals(targetEventDate)) {
        tempEvents.add(event);
      }
    }
    return tempEvents;
  }

  /**
   * Method to return Arraylist of events within two dates .
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

  /**
   * Method to sort events based on user input.
   * */
  public ArrayList<Event> getSortedEvents(int userSort) {
    ArrayList<Event> tempEvents = new ArrayList<>(events);
    if (userSort == 1) {
      tempEvents.sort(Comparator.comparing(Event::getEventLocation));
    } else if (userSort == 2) {
      tempEvents.sort(Comparator.comparing(Event::getEventType));
    } else if (userSort == 3) {
      tempEvents.sort((e1, e2) -> Math.toIntExact(
          e1.getEventDate() - e2.getEventDate()));

    }

    return tempEvents;
  }


}
