package JavaStartZadania;

import java.util.Scanner;

class BoxingType_48 {
    static int numberOfDigits = 0;
    static int numberOfLetters = 0;
    static int maxNumber = 0;

    public static void main(String[] args) {
        String text = readText();
        countDigits(text);
        countLetters(text);
    }

    public static String readText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj napis: ");
        String text = sc.nextLine();
        return text;
    }

    public static void countDigits(String text) {
        char[] textArray = text.toCharArray();
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            if (isInt(textArray[i])) {
                numberOfDigits++;
                if (textArray[i] > maxNumber) {
                    maxNumber = textArray[i];
                }
            }

        }
        System.out.println("Liczba cyfr w tekscie to: " + numberOfDigits);
        System.out.println("Największa cyfra w tekscie to: " + (maxNumber-48));
    }

    static void countLetters(String text) {
        char[] textArray = text.toCharArray();
        int textLength = text.length();
        for (int i = 0; i < textLength; i++) {
            if (isLetter(textArray[i])) {
                numberOfLetters++;
            }

        }
        System.out.println("Liczba liter w tekscie to: " + numberOfLetters);
    }

    static boolean isInt(char myChar) {
        boolean Status = Character.isDigit(myChar);
        return Status;
    }

    static boolean isLetter(char myChar) {
        boolean Status = Character.isLetter(myChar);
        return Status;
    }

}
