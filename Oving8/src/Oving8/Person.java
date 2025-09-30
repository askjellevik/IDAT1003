package Oving8;


public class Person {
    private final String firstName, lastName;
    private final int birthdate;

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
