package JavaStartZadania;

import java.io.*;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Zad25_FilesLinesCounter {
    static String baseDir = null;
    static int lines = 0;
    static String directoryPath;
    static String filePath;
    static File file;
    static int linesSum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        directoryPath = readFolderPath();
        checkDirectoryAndStart(file);
        //a wewnatrz sumuj linie
        System.out.println("Suma wszystkich linii we wszystkich plikach: " + linesSum);
    }

    private static String readFolderPath() throws InaccessibleObjectException {
        System.out.println();
        System.out.println("Podaj ścieżkę do folderu z plikami:");
        directoryPath = sc.nextLine();
        baseDir = directoryPath;
        file = new File(directoryPath);
        if (fileOrDirectoryExists(file))
            return directoryPath;
        else return ("Wrong file path.");
    }

    public static boolean fileOrDirectoryExists(File file) {
        return (file.isFile() || file.isDirectory());
    }

    public static void checkDirectoryAndStart(File file) throws IOException {
        try {
            for (File f : file.listFiles()
            ) {
                if (f.isDirectory()) {
                    //System.out.println(f.isDirectory());
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
        File file1 = new File(directoryPath+\+"example.txt");

        lines = 0;
        try (fileReader; reader;) {
            while (reader.readLine() != null) {
                lines++;
            }
            if (fileName.equals(file1)) {
                var newFile = new FileWriter(fileName);
                var bw = new BufferedWriter(newFile);
                String additionalText = "extra text";
                bw.write(additionalText);
                bw.close();
            }
            System.out.println(file1.toString()+" "+fileName.toString());
            System.out.println(fileName.equals(file1));
            linesSum += lines;
            String relativeName = file.getAbsolutePath().replace(baseDir, "");
            System.out.println("Ilość wierszy w pliku: " + relativeName + " --> " + lines);
        }
    }
}

