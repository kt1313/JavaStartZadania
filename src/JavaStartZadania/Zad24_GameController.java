package JavaStartZadania;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Zad24_GameController {
    static Scanner sc = new Scanner(System.in);

    public static String readUserChoice() {
        String gameName = null;
        System.out.println("Give a game's name.");
        try {
            gameName = sc.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Give a game's name");
        }
        return gameName;
    }

    public static int userPayment() {
        int payment = 0;
        System.out.println("Send your money.");
        try {
            payment = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Give proper numbers!");
        }
        return payment;
    }

    public static void checkPayment(Zad24_Game game, int payment) throws Zad24_NotEnoughMoneyException{
        int paymentDifference=0;
        Zad24_Game chosenGame = game;
         paymentDifference=(payment - chosenGame.getPrice()) ;
        if (paymentDifference > 0) {
            System.out.println("Take your change " + paymentDifference + " zł.");
        } else {
            throw new Zad24_NotEnoughMoneyException("The Game cost is :" + game.getPrice()+
                    " and you paid only "+payment);
        }
    }

    public static void sellTheGame(String gameName) {
        System.out.println("Here you have "+gameName+".");
    }

}
