package JavaStartZadania;

import java.util.Scanner;

public class Calculator_18 {

    private double firstNr;
    private double secondNr;
    private char character;
    private double result;

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Da mi primero numero: ");
        firstNr = scanner.nextDouble();
        System.out.println("Que hacemos? (+, -, *, /): ");
        character = scanner.next().charAt(0);
        System.out.println("Da mi secundo numero: ");
        secondNr = scanner.nextDouble();

        switch (character) {
            case '+':
                result = firstNr + secondNr;
                System.out.println(" Resultado: " + result);
                break;
            case '-':
                result = firstNr - secondNr;
                System.out.println(" Resultado -: " + result);
                break;
            case '*':
                result = firstNr * secondNr;
                System.out.println(" Resultado *: " + result);
                break;
            case '/':
                result = firstNr / secondNr;
                System.out.println(" Resultado /: " + result);
                break;
            default:
                System.out.println("Wybierz odpowiednie działanie!");
                break;

        }
    }
}
