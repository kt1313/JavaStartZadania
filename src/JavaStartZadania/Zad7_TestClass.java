package JavaStartZadania;

public class Zad7_TestClass {
    public static void main(String[] args) {

        Zad7_Employee employee = new Zad7_Employee("Marcin", "Wór", 3000);
        double nettoYearIncome, bruttoYearIncome ;
        nettoYearIncome=Zad7_PaymentCalculator.nettoYearPayment(employee);
        bruttoYearIncome=Zad7_PaymentCalculator.bruttoYearPayment(employee);

        System.out.printf("\nPracownik: %s %s, zarabia miesięcznie: %.0fzł.\nRocznie netto: %.0fzł.\nRocznie brutto: %.0fzł.\n",
                employee.getName(), employee.getSurname(),employee.getSalary(), nettoYearIncome, bruttoYearIncome);
    }
}
