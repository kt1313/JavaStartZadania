package JavaStartZadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Optional;
import java.util.Scanner;

public class Optional_ContactReader_70 {
        static Optional<Optional_ContactManager_70> readFile(String fileName) {
       try (Scanner scanner = new Scanner(new File(fileName))) {
                Optional_ContactManager_70 contactManager = new Optional_ContactManager_70();
                while (scanner.hasNextLine()) {
                    Optional_Contact_70 contact = createContactFromText(scanner.nextLine());
                    contactManager.addContact(contact);
                }
                return Optional.of(contactManager);
            } catch (FileNotFoundException e) {
                return Optional.empty();
            }
        }

        private static Optional_Contact_70 createContactFromText(String text) {
            String[] data = text.split(";");
            return new Optional_Contact_70(data[0], data[1], data[2], data[3]);
        }
    }
