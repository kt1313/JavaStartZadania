package JavaStartZadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad25_FilesLinesCounter {
    static String directoryPath;
    static String filePath;
    static String[] filesArray;
    static int linesSum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        directoryPath = readFolderPath();
        fileExists(directoryPath);
        //sprawdz czy istnieje File i wtedy odpal readLines
        checkDirectoryAndStart(directoryPath);
        //a wewnatrz sumuj linie
        System.out.println(linesSum);
    }

    private static String readFolderPath() throws InaccessibleObjectException {
        System.out.println("Podaj ścieżkę do folderu z plikami:");
        directoryPath = sc.nextLine();
        File file = new File(directoryPath);
        if (file.isDirectory())
            return directoryPath;
        else return ("Wrong file path.");
    }

    public static boolean fileExists(String folderPath) {
        File file = new File(folderPath);
        return file.exists();
    }


    public static void checkDirectoryAndStart(String directoryPath) throws IOException {
        File file = new File(directoryPath);
        filesArray = file.list();
        try {
            for (String f : filesArray
            ) {
                File f1 = new File(f);
                if (f1.isFile()) {
                    openFileAndCountLines(f1);
                } else directoryPath = f1.toPath().toString();
                checkDirectoryAndStart(directoryPath);

            }
        } catch (Exception ex) {
        }
        ;
    }

    private static void openFileAndCountLines(File fileName) throws IOException {
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);

        try (
                fileReader;
                reader;
        ) {
            String nextLine = null;
            int lines = 0;
            while ((nextLine = reader.readLine()) != null) {
                lines++;
                linesSum += lines;
            }
            System.out.println("Ilość wierszy w pliku: " + fileName + " to " + lines);
        }
    }
//    File dir = new File(directoryLocation);
//if(dir.exists()) {
//        processDirectory(dir);
//    } else {
//        System.out.println("Wskazany folder nie istnieje");
//    }
//private int countLinesForFile(File file) throws IOException {
//    BufferedReader reader = new BufferedReader(new FileReader(file));
//    int counter = 0;
//    while (reader.readLine() != null) {
//        counter++;
//    }
//    return counter;
//}
//private void processDirectory(File dir) throws IOException {
//    for (File file : dir.listFiles()) {
//        if (file.isDirectory()) {
//            processDirectory(file);
//        } else {
//            int lines = countLinesForFile(file);
//            totalCounter += lines;
//            System.out.println(file.getAbsolutePath() + " --> " + lines );
//        }
//    }
//}
}

