package JavaStartZadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad27_FileReader {
    final static String filePath = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\ContactBook.csv";
    static File file = new File(filePath);

    public static void createOrFindFile( ) throws IOException {
        if (fileExists(file)) {
            openFileAndSendData();

        } else {
            createFile();
            createOrFindFile();
        }
    }

    public static boolean fileExists(File file) {
        return (file.isFile());
    }

    public static List<Zad27_Contact> openFileAndSendData()
            throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        List<Zad27_Contact> contactsList = new ArrayList<>();
        try {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] splittedLine = line.split(",");
                String name = splittedLine[0];
                String contactNr = splittedLine[1];
                //teraz utworz kontakt i potem go wyslij do TeleBooka
                Zad27_Contact contact = new Zad27_Contact(name, contactNr);
                contactsList.add(contact);
            }
        } catch (Exception e) {
            System.out.println("nie udało się wczytać pliku");
            e.printStackTrace();
        }
        sc.close();
        return contactsList;
    }

    public static boolean createFile() throws IOException {
        File file = new File(filePath);
        boolean fileExists = file.exists();
        try {
            fileExists = file.createNewFile();
        } catch (IOException e) {
            System.out.println("Nie udało się utworzyć pliku");
        }
        return fileExists;
    }

}
