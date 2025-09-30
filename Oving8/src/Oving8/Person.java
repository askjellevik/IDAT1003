package Oving8;


public class Person {
    private final String firstName, lastName, birthdate;

    public Person(String firstName, String lastName, String birthdate) {
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
    public String getBirthdate() {
        return birthdate;
    }


}
