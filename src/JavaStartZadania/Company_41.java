package JavaStartZadania;

public class Company_41 {

    public static void main(String[] args) {
        CompanyEmployee_41[] employees = createEmployees();
        double totalMonthlySalaries = totalMonthlySalaries(employees);
        double totalYearlySalaries = totalYearlySalaries(employees);

        printEmployees(employees);
        System.out.println("Suma miesięcznych wynagrodzeń: " + totalMonthlySalaries);
        System.out.println("Suma rocznych wynagrodzeń: " + totalYearlySalaries);
    }

    private static void printEmployees(CompanyEmployee_41[] employees) {
        System.out.println("Pracownicy:");
        for (CompanyEmployee_41 employee : employees) {
            System.out.println(employee);
        }
    }

    private static double totalYearlySalaries(CompanyEmployee_41[] employees) {
        double totalYearlySalaries = 0;
        for (CompanyEmployee_41 employee : employees) {
            totalYearlySalaries += employee.yearlySalary();
        }
        return totalYearlySalaries;
    }

    private static double totalMonthlySalaries(CompanyEmployee_41[] employees) {
        double totalMonthlySalaries = 0;
        for (CompanyEmployee_41 employee : employees) {
            totalMonthlySalaries += employee.monthlySalary();
        }
        return totalMonthlySalaries;
    }

    private static CompanyEmployee_41[] createEmployees() {
        CompanyEmployee_41[] employees = new CompanyEmployee_41[2];
        employees[0] = new CompanyEmployeePermanent_41("Jan", "Kowalski", 5000);
        employees[1] = new CompanyEmployeeTemporary_41("Anna", "Borowska", 10, 80);
        return employees;
    }

}
