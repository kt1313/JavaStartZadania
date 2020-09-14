package JavaStartZadania;

import java.util.Scanner;

public class Optional_ContactApp_70 {
    public static void main(String[] args) {
      Optional_ContactReader_70.readFile("C:\\Users\\Dell\\IdeaProjects\\JavaStart\\src\\contacts.csv")
    .ifPresentOrElse(Optional_ContactApp_70::findByEmail, Optional_ContactApp_70::contactNotFoundMessage);
    }

    static void findByEmail(Optional_ContactManager_70 contactManager) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
        contactManager.findByEmail(email)
                .ifPresentOrElse(Optional_ContactApp_70::showShortInfo, Optional_ContactApp_70::contactNotFoundMessage);
    }

    private static void showShortInfo(Optional_Contact_70 contact) {
        System.out.println(contact);
    }

    private static void contactNotFoundMessage() {
        System.out.println("Kontakt nie został znaleziony");
    }
}
