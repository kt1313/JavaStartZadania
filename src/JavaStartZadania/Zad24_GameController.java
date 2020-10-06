package JavaStartZadania;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad24_GameController {
    static Scanner sc = new Scanner(System.in);
    static Zad24_GameMachine gamesList = new Zad24_GameMachine();

    public static String readUserChoice() {
        String gameName = null;

        try {
            gameName = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Wpisz tytuł.");
        }
        return gameName;
    }

    public static int userPayment() {
        int payment = 0;
        System.out.println("Wpłać pieniądze.");
        try {
            payment = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wpisz liczby całkowite!");
        }
        return payment;
    }

    public static Zad24_Game lookForGame(String gameName) {
        for (Zad24_Game g : gamesList
        ) {
            g.getName().equals(gameName) ? return g;
            System.out.println(g.getPrice());:return null;
            System.out.println("Nie znaleziono takiej gry.");
        }
    }

    public static void checkPayment(String gameName, int payment) {
        int paymentDifference;
        lookForGame(gameName);
    }

}
