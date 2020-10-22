package JavaStartZadania;

public class Zad27_Contact {
    String firstName;
    String surname;
    int contactNr;

    public Zad27_Contact(String firstName, String surname, int contactNr) {
        this.firstName = firstName;
        this.surname = surname;
        this.contactNr = contactNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getContactNr() {
        return contactNr;
    }

    public void setContactNr(int contactNr) {
        this.contactNr = contactNr;
    }
}
