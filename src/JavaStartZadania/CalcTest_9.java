package JavaStartZadania;

public class CalcTest_9 {
    public static void main(String[] args) {

        Calculator_9 dodawanie = new Calculator_9();
        System.out.println(dodawanie.add(3.5, 5.4, 5.7));
        System.out.println(dodawanie.add(3.4, 5.7));

        Calculator_9 odejmowanie = new Calculator_9();
        System.out.println(odejmowanie.substract(5.3, 3.1, 2.1));
        System.out.println(odejmowanie.substract(5.3, 3.1));

    }
}
