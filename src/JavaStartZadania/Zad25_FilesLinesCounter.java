package JavaStartZadania;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Zad25_FilesLinesCounter {
    static int lines = 0;
    static String directoryPath;
    static String filePath;
    static String[] filesArray;
    static File file;
    static int linesSum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        directoryPath = readFolderPath();
        // fileOrDirectoryExists(directoryPath);
        //sprawdz czy istnieje File i wtedy odpal readLines
        checkDirectoryAndStart(file);
        //a wewnatrz sumuj linie
        System.out.println(linesSum);
    }

    private static String readFolderPath() throws InaccessibleObjectException {
        System.out.println();
        System.out.println("Podaj ścieżkę do folderu z plikami:");
        directoryPath = sc.nextLine();
        file = new File(directoryPath);
        if (fileOrDirectoryExists(file))
            return directoryPath;
        else return ("Wrong file path.");
    }

    public static boolean fileOrDirectoryExists(File file) {
        return (file.isFile() || file.isDirectory());
    }

    public static void checkDirectoryAndStart(File file ) throws IOException {
        try {
            for (File f : file.listFiles()
            ) {
                if (f.isDirectory()) {
                    System.out.println(f.isDirectory());
                    checkDirectoryAndStart(f);
                } else
                    openFileAndCountLines(f);
            }
        } catch (Exception ex) {
        }
    }

    private static void openFileAndCountLines(File fileName) throws IOException {
        var fileReader = new FileReader(fileName);
        var reader = new BufferedReader(fileReader);
        try (fileReader; reader;) {
            while (reader.readLine() != null) {lines++;;
                System.out.println(linesSum);}
            linesSum += lines;
            System.out.println("Ilość wierszy w pliku: " + fileName + " to " + lines);
        }
    }
}

