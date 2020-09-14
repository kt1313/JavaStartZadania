package JavaStartZadania;

import java.util.*;

public class Optional_ContactManager_70 {
        private Set<Optional_Contact_70> contacts = new HashSet<>();

        void addContact(Optional_Contact_70 contact) {
            contacts.add(contact);
        }

    Optional<Optional_Contact_70> findByEmail(String email) {
            if (email == null)
                throw new NullPointerException("email cannot be null");
            for (Optional_Contact_70 contact : contacts) {
                if (email.equals(contact.getEmail()))
                    return Optional.of(contact);
            }
            return Optional.empty();
        }

        List<Optional_Contact_70> findByLastName(String textFragment) {
            if (textFragment == null)
                throw new NullPointerException("search text cannot be null");
            List<Optional_Contact_70> foundContacts = new ArrayList<>();
            for (Optional_Contact_70 contact : contacts) {
                if (contact.getLastName().contains(textFragment))
                    foundContacts.add(contact);
            }
            return foundContacts;
        }
    }