package JavaStartZadania;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Zad27_FileWriter {
    public static void saveData(Map<String, Zad27_Contact> contactsMap) throws IOException {
        final  String filePath = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\ContactBook.csv";
        try (
                var fileWriter = new FileWriter(filePath);
                var writer = new BufferedWriter(fileWriter);
        ) {
            //tu ma leciec po contactsMapie i write() do File'a
            for (Map.Entry<String, Zad27_Contact> e : contactsMap.entrySet()){
                String key = e.getKey();
                String value = e.getValue().getContactNr();
                writer.write(key + value);
                writer.newLine();
                System.out.println(key + " => " + value);
            }

        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + filePath);
        }
    }

    public void createContactBookFromFile(File file) {

    }
}

