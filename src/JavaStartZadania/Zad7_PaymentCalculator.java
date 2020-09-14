package JavaStartZadania;
public class Zad7_PaymentCalculator {
    private static final double ZUSmonthly=1000;

    public static double nettoYearPayment(Zad7_Employee employee) {
        double nettoYearPayment = employee.getSalary()*12;
        return nettoYearPayment;
    }

    public static double bruttoYearPayment(Zad7_Employee employee) {
        double bruttoYearPayment = 12*ZUSmonthly+12*(employee.getSalary()+0.2* employee.getSalary());
        return bruttoYearPayment;
    }
}
