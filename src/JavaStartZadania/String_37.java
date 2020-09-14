package JavaStartZadania;

import java.util.Scanner;

public class String_37 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj napis: ");
        String label = sc.nextLine();
        char firstChar = label.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            label = label.toUpperCase();

        } else if (Character.isLowerCase(firstChar)) {
           label = label.toLowerCase();
        }
        System.out.println(" Pierwsza litera to: " + label.charAt(0));
        System.out.println("Nowy napis to: " + label);
        sc.close();
    }
}

