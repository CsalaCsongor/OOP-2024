package  lab4_1;
public class Person {
    String firstName;
    String lastName;
    int birtYear;

    public Person(String firstName, String lastName, int birtYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtYear = birtYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirtYear() {
        return birtYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", birtYear=" + birtYear +
                '}';
    }
}
