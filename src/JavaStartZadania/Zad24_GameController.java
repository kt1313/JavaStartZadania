package JavaStartZadania;
//
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//public class Zad24_GameController {
//    static Scanner sc = new Scanner(System.in);
//
//    public static String readUserChoice() {
//        String gameName = null;
//        try {
//            gameName = sc.nextLine();
//        } catch (InputMismatchException e) {
//            System.out.println("Wpisz tytuł.");
//        }
//        return gameName;
//    }
//
//    public static int userPayment() {
//        int payment = 0;
//        System.out.println("Wpłać pieniądze.");
//        try {
//            payment = sc.nextInt();
//        } catch (InputMismatchException e) {
//            System.out.println("Wpisz liczby całkowite!");
//        }
//        return payment;
//    }
//
//    public static void checkPayment(String gameName, int payment) {
//        int paymentDifference=0;
//        Zad24_Game chosenGame = lookForGame(gameName);
//         paymentDifference=(payment - chosenGame.getPrice()) ;
//        if (paymentDifference > 0) {
//            System.out.println("Odbierz resztę " + paymentDifference + "");
//        } else {
//            System.out.println("Dopłać " + paymentDifference + ".");
//        }
//    }
//
//    public static void sellTheGame(String gameName) {
//        System.out.println("Odbierz grę "+gameName+".");
//    }
//
//}
