package oop.labor08;

public class Contact {
    int id;
    String firstName;
    String lastName;
    long birthDate;
    String Adress;
    String phoneNr;
    String Email;
    String webPage;


    public Contact(int id, String firstName, String lastName, long birthDate, String adress, String phoneNr, String email, String webPage) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        Adress = adress;
        this.phoneNr = phoneNr;
        Email = email;
        this.webPage = webPage;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public String getAdress() {
        return Adress;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public String getEmail() {
        return Email;
    }

    public String getWebPage() {
        return webPage;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", Adress='" + Adress + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                ", Email='" + Email + '\'' +
                ", webPage='" + webPage + '\'' +
                "}\n";
    }
}
