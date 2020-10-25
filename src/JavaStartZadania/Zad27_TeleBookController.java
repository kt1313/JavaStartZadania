package JavaStartZadania;

import java.util.Scanner;

public class Zad27_TeleBookController {
    private static Scanner sc = new Scanner(System.in);
    private static Zad27_TeleBook teleBook=new Zad27_TeleBook();

    public static void main(String[] args) {
        showOptions();
    }

    static String showOptions() {
        System.out.println("Wybierz opcję działania:");
        for (Zad27_Options s : Zad27_Options.values()) {
            System.out.println(s.toString());
        }
        return sc.nextLine();
    }

    static void chooseOption(String choice) {

        switch (choice) {
            case "0":
                break;
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            default:
                break;
        }
    }

    static Zad27_Contact getContactData() {
        System.out.println("Podaj nazwę nowego kontaktu:");
        String name = sc.nextLine();
        System.out.println("Podaj nr telefonu nowego kontaktu;");
        String contactNr = sc.nextLine();
        Zad27_Contact contact=new Zad27_Contact(name, contactNr);
    return contact;
    }

    static String getContactToDeleteData() {
        System.out.println("Podaj nazwę lub jej część, ew. nr kontaktu do usunięcia:");
        String deleteContact = sc.nextLine();
        return deleteContact;
    }

    static void getContactToFindData() {

    }

}