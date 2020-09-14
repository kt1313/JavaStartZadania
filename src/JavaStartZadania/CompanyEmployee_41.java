package JavaStartZadania;

abstract class CompanyEmployee_41 {
    public static final int MONTHS_NUMBER = 12;
    private String firstName;
    private String lastName;

    public CompanyEmployee_41(String firstName, String lastName) {
        this.firstName  =firstName;
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
        return "CompanyEmployee: " +
                 firstName + '\'' +
                 lastName + '\'' +
                ", miesięczny dochód: " + monthlySalary() + "roczny dochód: "
                + yearlySalary();
    }


    abstract double monthlySalary();

    abstract double yearlySalary();

}
