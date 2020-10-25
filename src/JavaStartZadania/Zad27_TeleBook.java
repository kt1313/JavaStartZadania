package JavaStartZadania;

import java.util.*;

public class Zad27_TeleBook {

//    TeleBook - klasa reprezentująca książkę adresową. Powinna przechowywać kolekcję kontaktów oraz
//    udostępniać metody do dodawania nowego kontaktu,
//    usuwania istniejącego kontaktu po nazwie oraz wyszukiwania kontaktów po fragmencie nazwy lub numeru telefonu

    private Map<String, Zad27_Contact> contactsMap = new TreeMap<>();
    public List<Zad27_Contact> contacts = new ArrayList<>();
    //tworzymy dwie listy: nazw i numerow, aby latwiej szukac
    List<String> contactNames = new ArrayList<String>();
    List<String> contactNumbers = new ArrayList<String>();

    public Zad27_TeleBook() {
    }

    ;

    public Zad27_TeleBook(Map<String, Zad27_Contact> contactsMap) {
        this.contactsMap = contactsMap;
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

    public void addNewContact(Zad27_Contact contact) {
        if (contact.getContactName() == null || contact.getContactNr() == null || contact.getContactName().isEmpty()
                || contact.getContactNr().isEmpty())
            throw new NullPointerException("Nie zostawiaj pustych danych!");
        contacts.add(contact);
    }

    public void removeContact(Zad27_Contact contact) {
        contacts.remove(contact);
    }

    public List<Zad27_Contact> findContact(String contactToFind) {
        //uzyc Collections.sort, potem tolowercase i zachowac cala liste z boku: List<> result
        List<Zad27_Contact> result = new ArrayList<Zad27_Contact>();
        for (String str : contactsMap.keySet()) {
            if (str.toLowerCase().contains(contactToFind.toLowerCase())) {
                result.add(contactsMap.get(str));
            }
        }
        for (Zad27_Contact c : contactsMap.values()) {
            if (c.getContactNr().contains(contactToFind.toLowerCase())) {
                result.add(c);
            }
        }
        return result;
    }
}
