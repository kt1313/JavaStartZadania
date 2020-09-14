package JavaStartZadania;

public class CompanyEmployeePermanent_41 extends CompanyEmployee_41 {
    final static double MONTHLY_BONUS = 0.05;
    public double monthlyBasic;

    public CompanyEmployeePermanent_41(String firstName, String lastName, double monthlyBasic) {
        super(firstName, lastName);
        this.monthlyBasic = monthlyBasic;
    }

    @Override
    public double monthlySalary() {
        return monthlyBasic;
    }

    @Override
    public double yearlySalary() {
        double yearlySalaryBasic = monthlyBasic * MONTHS_NUMBER;
        double yearlyBonus = yearlySalaryBasic * MONTHLY_BONUS;
        return yearlyBonus + yearlySalaryBasic;
    }
}
