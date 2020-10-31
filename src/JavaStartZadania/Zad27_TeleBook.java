package JavaStartZadania;

import javax.naming.NamingException;
import java.util.*;

public class Zad27_TeleBook {

//    TeleBook - klasa reprezentująca książkę adresową. Powinna przechowywać kolekcję kontaktów oraz
//    udostępniać metody do dodawania nowego kontaktu,
//    usuwania istniejącego kontaktu po nazwie oraz wyszukiwania kontaktów po fragmencie nazwy lub numeru telefonu

    private Map<String, Zad27_Contact> contactsMap = new TreeMap<>();

    public Zad27_TeleBook() {
    }

    public Zad27_TeleBook(Map<String, Zad27_Contact> contactsMap) {
        this.contactsMap = contactsMap;
    }

    public void addContacts(List<Zad27_Contact> contactsList) {
        for (Zad27_Contact c : contactsList
        ) {
            contactsMap.put(c.getContactName(), c);
        }
    }

    public void addNewContact(Zad27_Contact contact) throws NamingException {
        if (contact.getContactName() == null || contact.getContactNr() == null || contact.getContactName().isEmpty()
                || contact.getContactNr().isEmpty())
            throw new NullPointerException("Nie zostawiaj pustych danych!");
        try {
            for (Map.Entry<String, Zad27_Contact> e : contactsMap.entrySet()) {
                if (e.getKey().equals(contact.getContactName())) {
                    throw new NamingException("Ta sama nazwa!");
                }
            }
        }catch (Exception e){throw new NamingException("Ta sama nazwa!");}
        contactsMap.put(contact.getContactName(), contact);
    }

    public void removeContact(List<Zad27_Contact> listContactsToRemove) {
        for (Zad27_Contact c : listContactsToRemove
        ) {
            String contactString = c.getContactName();
            contactsMap.remove(contactString);
            printBook();

        }
    }

    public List<Zad27_Contact> findContact(String contactToFind) {
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
        for (Zad27_Contact c : result
        ) {
            System.out.println(c.getContactName() + " " + c.getContactNr());
            System.out.println();
        }
        return result;
    }

    public Map<String, Zad27_Contact> printBook() {
        System.out.println(contactsMap.toString());
        return contactsMap;
    }

}
