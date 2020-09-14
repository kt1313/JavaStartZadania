package JavaStartZadania;

import java.io.Serializable;

public class FilePerson_43 implements Serializable {
    private static final long serialVersionUID = 3812017177088226528L;
    private String firstName;
    private String lastName;

    public FilePerson_43(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

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

    @Override
    public String toString() {
        return "" + firstName + " " + lastName ;
    }
}
