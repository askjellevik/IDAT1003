package ovingeight;

/**
 * Person class.
 */
public class Person {

  private final String firstName;
  private final String lastName;
  private final int birthdate;

  /**
   * Person constructor.
   */
  public Person(String firstName, String lastName, int birthdate) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.birthdate = birthdate;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getBirthdate() {
    return birthdate;
  }


}
