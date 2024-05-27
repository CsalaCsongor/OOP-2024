package oop.labor14;

public class Person {
    private  String firstName;
    private  String lastName;
    private  int birthDate;


    public Person(String firstName, String lastName, int birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public int compareTo(Person o) {
        return this.firstName.compareTo(o.getFirstName());
    }

    public int compareTo2(Person o) {
        return this.lastName.compareTo(o.getLastName());
    }

    public int compareTo3(Person o) {
        return this.birthDate-o.birthDate;
    }
}


