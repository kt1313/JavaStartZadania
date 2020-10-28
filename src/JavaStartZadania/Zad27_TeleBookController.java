package JavaStartZadania;

import java.util.Scanner;

public class Zad27_TeleBookController {
    private static Scanner sc = new Scanner(System.in);
    private static Zad27_TeleBook teleBook = new Zad27_TeleBook();

    static void mainLoop() {
        int choice = showOptions();
        Zad27_Options option=chooseOption(choice);
        while (option != Zad27_Options.EXIT) {
            Zad27_TeleBook teleBook = new Zad27_TeleBook();
            startOption(option);
            mainLoop();
        }
        System.exit(0);
    }

    static int showOptions() {
        System.out.println("Wybierz opcję działania:");
        for (Zad27_Options s : Zad27_Options.values()) {
            System.out.println(s);
        }
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    static Zad27_Options chooseOption(int choice) {
        return Zad27_Options.changeIntToOption(choice);
    }

    static void startOption(Zad27_Options option) {
        switch (option) {
            case ADD:
                Zad27_Contact contact = getContactData();
                teleBook.addNewContact(contact);
                break;
            case FIND:
                String find = getContactToFindData();
                teleBook.findContact(find);
                break;
            case REMOVE:
                String findToRemove = getContactToFindData();
                teleBook.removeContact(findToRemove);
                teleBook.printBook();
                break;
        }
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
        System.out.println("Podaj nazwę lub jej część, ew. nr kontaktu:");
        String findContact = sc.nextLine();
        return findContact;
    }

}