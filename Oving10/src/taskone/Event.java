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

  /**
   * Create a new Event.   *
   *    * @param eventKey unique identifier for the event
   *    * @param eventName human-readable name of the event
   *    * @param eventLocation place where the event takes place
   *    * @param eventHost organizer or host of the event
   *    * @param eventType type/category of the event
   */
  public Event(int eventKey, String eventName, String eventLocation,
      String eventHost, String eventType) {
    this.eventKey = eventKey;
    this.eventName = eventName;
    this.eventLocation = eventLocation;
    this.eventHost = eventHost;
    this.eventType = eventType;


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
}
