package JavaStartZadania;
import java.util.Locale;

import java.util.Scanner;

public class Calculator_38 {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private String operator;
    private double firstNumber;
    private double secondNumber;
    private double result;
    private Scanner sc = new Scanner(System.in);


    private double add() {
        result = firstNumber + secondNumber;
        return result;
    }

    private double substract() {
        result = firstNumber - secondNumber;
        return result;
    }

    private double multiply() {
        result = firstNumber * secondNumber;
        return result;
    }

    private double divide() {
        try {
            result = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero!");
        }

        return result;
    }

    public boolean isObjectDouble(Object o) {

        return o instanceof Double;
    }

    public void greeting() throws CalculatorUnnknownOperatorException_38 {
        System.out.println("Witaj w kalkulatorze!");
        System.out.println("Podaj pierwszą liczbę: ");
        firstNumber = sc.nextDouble();
        sc.nextLine();
        if (firstNumber == (double) firstNumber) {
            firstNumber = sc.nextDouble();
        } else {System.out.println("Podaj wartość \"double\"");}

        System.out.println("Podaj drugą liczbę: ");
        secondNumber = sc.nextDouble();
        sc.nextLine();
        if (secondNumber == (double) secondNumber) {
            secondNumber = sc.nextDouble();
        } else {System.out.println("Podaj wartość \"double\"");}

        System.out.println("Wybierz działanie: ");
        operator = sc.nextLine();

        boolean error=false;
        while(error)
                    switch (operator) {
                case PLUS:
                    add();
                    break;
                case MINUS:
                    substract();
                    break;
                case MULTIPLY:
                    multiply();
                    break;
                case DIVIDE:
                    divide();
                    break;
                        default:
                            throw  new CalculatorUnnknownOperatorException_38("Wybierz odpowiednie działanie!");
        }
        error = true;
    }
}
