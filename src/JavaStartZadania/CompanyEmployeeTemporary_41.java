package JavaStartZadania;

public class CompanyEmployeeTemporary_41 extends CompanyEmployee_41 {
    private double hourRate;
    private double hoursWorkedMonthly;

    CompanyEmployeeTemporary_41(String firstName, String lastName, double hourRate, double hoursWorkedMonthly) {
        super(firstName, lastName);
        this.hourRate = hourRate;
        this.hoursWorkedMonthly = hoursWorkedMonthly;
    }

    public double getHourRate() {
        return hourRate;
    }

    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }

    public double getHoursWorkedMonthly() {
        return hoursWorkedMonthly;
    }

    public void setHoursWorkedMonthly(double hoursWorkedMonthly) {
        this.hoursWorkedMonthly = hoursWorkedMonthly;
    }

    @Override
    public double monthlySalary() {
        return getHourRate()*getHoursWorkedMonthly();
    }

    @Override
    public double yearlySalary() {
        return monthlySalary()*MONTHS_NUMBER;
    }
}
