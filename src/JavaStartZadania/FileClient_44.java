package JavaStartZadania;

import java.io.Serializable;

public class FileClient_44 implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String country;
    private double spendings;

    public FileClient_44(int id, String firstName, String lastName, String country, double spendings) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.spendings = spendings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSpendings() {
        return spendings;
    }

    public void setSpendings(double spendings) {
        this.spendings = spendings;
    }

    @Override
    public String toString() {
        return id + ": " + firstName + " " + lastName + ", " + country + ", " + spendings ;
    }
}
