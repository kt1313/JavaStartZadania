package JavaStartZadania;

import java.util.Scanner;

public class Zad15_Interface {

    public static char getLetter(Zad15_Hangman hangman) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj literę:");
        String line = sc.nextLine();
        char letter = line.charAt(0);
        hangman.setUsedLetters(hangman.getUsedLetters(), letter);
        return letter;
    }

    public static boolean checkIfLetterUsed(char letter, String codeWord) {
        for (int i=0;i<codeWord.length();i++) {
            if (codeWord.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public static void menu(Zad15_Hangman hangman) {
        System.out.println("Wybierz: ");
        System.out.println("1 - Gram.");
        System.out.println("2 - Koniec.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            hangman.clearForNewGame();
            Zad15_MainGameApp.mainLoop();
        } else {
            if (choice == 2) {
                System.exit(0);
            } else {
                System.out.println("Wybierz właściwie");
                menu(hangman);
            }
            sc.close();
        }
    }
}
