package JavaStartZadania;

import java.util.Scanner;

public class String_36 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę wyrazów: ");
        int number = sc.nextInt();
        sc.nextLine();
        String[] wordsArray = new String[number];
        char[] result = new char[number];

        for (int i = 0; i < number; i++) {
            String word = sc.nextLine();
            wordsArray[i] = word;
            int length = word.length();
            result[i] = word.charAt(length - 1);
        }
        for (char c : result) {
            System.out.print(c);
        }
        sc.close();
    }

}
