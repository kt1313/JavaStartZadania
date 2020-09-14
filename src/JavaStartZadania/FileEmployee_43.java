package JavaStartZadania;

import java.io.Serializable;

public class FileEmployee_43 extends FilePerson_43  {
    double salary;

    public FileEmployee_43(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " salary: " + getSalary();
    }


}
