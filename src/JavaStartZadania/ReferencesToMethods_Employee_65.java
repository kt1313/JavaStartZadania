package JavaStartZadania;

import java.lang.ref.Reference;

class ReferencesToMethods_Employee_65 {
    private String firstName;
    private String lastName;
    private double salary;
    private ReferencesToMethods_Employment_65 employment;

    public ReferencesToMethods_Employee_65(String firstName, String lastName, double salary, ReferencesToMethods_Employment_65 employment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employment = employment;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ReferencesToMethods_Employment_65 getEmployment() {
        return employment;
    }

    public void setEmployment(ReferencesToMethods_Employment_65 employment) {
        this.employment = employment;
    }

    void bonusToFullTimeSalary() {
        salary *= 1.1;
    }

    boolean filterFullTime() {
        return (getEmployment() == ReferencesToMethods_Employment_65.FULL_TIME);
    }

     String combineEmployeesName() {
        return getFirstName() + " " + getLastName();
    }

    Integer printNameLength() {
        String nameLength = getFirstName() + " " + getLastName();
        return nameLength.length();

    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employment=" + employment +
                '}';
    }
}