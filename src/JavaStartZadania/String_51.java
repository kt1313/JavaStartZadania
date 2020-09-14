package JavaStartZadania;

import java.util.Arrays;
import java.util.Scanner;

public class String_51 {
    private static String napis1;
    private static String napis2;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Podaj napis 1: ");
        napis1 = sc.nextLine();
        char[] napis1Array = createArray(napis1);
        System.out.println("Podaj napis 2: ");
        napis2 = sc.nextLine();
        createArray(napis2);
        char[] napis2Array = createArray(napis2);
        System.out.println("Czy te dwie tablice są równe?: " + compareArrays(napis1, napis2));

    }

    private static char[] createArray(String napis) {
        char[] resultArray = napis.toCharArray();
        return resultArray;
    }

    private static boolean compareArrays(String napis1, String napis2) {
        char[] arrayOfChars1 = new char[napis1.length()];
        char[] arrayOfChars2 = new char[napis2.length()];
        boolean result = true;

        if (napis1 == null || napis2 == null) {
            System.out.println("Puste tablice!");
        } else if (napis1.length() != napis2.length()) {
            System.out.println("Tablice są różne.");
        }

        //jeśli tablice nie są puste i nie są różnej długości to:
        else {
            napis1 = napis1.toLowerCase();
            napis2 = napis2.toLowerCase();
            char[] nap1 = napis1.toCharArray();
            char[] nap2 = napis2.toCharArray();
            Arrays.sort(nap1);
            Arrays.sort(nap2);

            //dla każdego char w napis1 sprawdza każde char w napis2
            for (int i = 0; i < napis1.length(); i++) {
                if (nap1[i] != nap2[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;

    }
}






