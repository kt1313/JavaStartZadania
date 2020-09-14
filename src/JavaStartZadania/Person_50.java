package JavaStartZadania;

import java.util.Objects;

public class Person_50 {
    String firstName;
    String lastName;
    String pesel;

    public Person_50(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return
                firstName  +
                " "+ lastName + ", pesel:  " + pesel + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person_50 person_50 = (Person_50) o;
        return Objects.equals(firstName, person_50.firstName) &&
                Objects.equals(lastName, person_50.lastName) &&
                Objects.equals(pesel, person_50.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, pesel);
    }
}
