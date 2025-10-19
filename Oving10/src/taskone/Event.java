package taskone;


/**
 * Represents an event with a key, name, location, host and type.
 *
 * @author askjellevik
 * @since 2025-10-19
 */
public class Event {

  private final int eventKey;
  private final String eventName;
  private final String eventLocation;
  private final String eventHost;
  private final String eventType;
  private final long eventDate;

  /**
   * Create a new Event.   *
   *    * @param eventKey unique identifier for the event
   *    * @param eventName human-readable name of the event
   *    * @param eventLocation place where the event takes place
   *    * @param eventHost organizer or host of the event
   *    * @param eventType type/category of the event
   *    * @param eventDate date of the event as YYYY-MM-DD HH:MI
   */
  public Event(int eventKey, String eventName, String eventLocation,
      String eventHost, String eventType, long eventDate) {
    this.eventKey = eventKey;
    this.eventName = eventName;
    this.eventLocation = eventLocation;
    this.eventHost = eventHost;
    this.eventType = eventType;
    this.eventDate = eventDate;


  }

  public int getEventKey() {
    return eventKey;
  }

  public String getEventName() {
    return eventName;
  }

  public String getEventLocation() {
    return eventLocation;
  }

  public String getEventHost() {
    return eventHost;
  }

  public String getEventType() {
    return eventType;
  }

  public long getEventDate() {
    return eventDate;
  }
}
