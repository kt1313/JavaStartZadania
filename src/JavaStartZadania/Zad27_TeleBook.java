package JavaStartZadania;

import java.util.*;

public class Zad27_TeleBook {
    public Scanner sc = new Scanner(System.in);

//    TeleBook - klasa reprezentująca książkę adresową. Powinna przechowywać kolekcję kontaktów oraz
//    udostępniać metody do dodawania nowego kontaktu,
//    usuwania istniejącego kontaktu po nazwie oraz wyszukiwania kontaktów po fragmencie nazwy lub numeru telefonu

    private Map<String,Zad27_Contact> contactsMap=new TreeMap<>();
    public List<Zad27_Contact> contacts = new ArrayList<>();
    //tworzymy dwie listy: nazw i numerow, aby latwiej szukac
    List<String> contactNames = new ArrayList<String>();
    List<String> contactNumbers = new ArrayList<String>();

    public Zad27_TeleBook(Map<String, Zad27_Contact> contactsMap){
        this.contactsMap=contactsMap;
    }
    private void createStringArrayForNamesAndNumbers() {
        for (Zad27_Contact c : contacts
        ) {
            contactNames.add(c.contactName);
        }
        for (Zad27_Contact c : contacts
        ) {
            contactNumbers.add(c.contactNr);
        }
    }

    public void addNewContact() {
        System.out.println("Podaj nazwę kontaktu (imię i nazwisko lub ksywkę): ");
        String contactName = sc.nextLine();
        System.out.println("Podaj numer kontaktu: ");
        String number = sc.nextLine();
        contacts.add(new Zad27_Contact(contactName, number));
    }

    public void removeContact(Zad27_Contact contact) {
        contacts.remove(contact);
    }

    public List<String> findContact() {
        //uzyc Collections.sort, potem tolowercase i zachowac cala liste z boku: List<> result

        System.out.println("Podaj kontakt do wyszukania (cały, fragment nazwy lub numeru): ");
        String contactToFind = sc.nextLine();
        List<String> result = new ArrayList<String>();
        for (String str : contactNames) {
            if (str.toLowerCase().contains(contactToFind.toLowerCase())) {
                result.add(str);
            }
        }
        for (String str : contactNumbers) {
            if (str.toLowerCase().contains(contactToFind.toLowerCase())) {
                result.add(str);
            }
        }
        return result;
    }
}
