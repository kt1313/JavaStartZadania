package JavaStartZadania;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad27_FileWriter{
    public static void saveData() throws IOException {
        String fileName = "testFile.txt";
        try (
                var fileWriter = new FileWriter(fileName, true);
                var writer = new BufferedWriter(fileWriter);
        ) {
            //tu ma leciec po contactsMapie i write() do File'a
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }

    public void createContactBookFromFile(File file) {

    }
}

