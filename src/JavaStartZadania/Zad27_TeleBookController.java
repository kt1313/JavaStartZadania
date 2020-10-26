package JavaStartZadania;

import java.util.Scanner;

public class Zad27_TeleBookController {
    private static Scanner sc = new Scanner(System.in);
    private static Zad27_TeleBook teleBook = new Zad27_TeleBook();

    static String showOptions() {
        System.out.println("Wybierz opcję działania:");
        for (Zad27_Options s : Zad27_Options.values()) {
            System.out.println(s);
        }
        return sc.nextLine();
    }

    static Zad27_Options chooseOption() {
        int choice= sc.nextInt();
        return Zad27_Options.changeIntToOption(choice);
    }

    static Zad27_Contact getContactData() {
        System.out.println("Podaj nazwę nowego kontaktu:");
        String name = sc.nextLine();
        System.out.println("Podaj nr telefonu nowego kontaktu;");
        String contactNr = sc.nextLine();
        Zad27_Contact contact = new Zad27_Contact(name, contactNr);
        return contact;
    }

    static String getContactToFindData() {
        System.out.println("Podaj nazwę lub jej część, ew. nr kontaktu do usunięcia:");
        String findContact = sc.nextLine();
        return findContact;
    }

}