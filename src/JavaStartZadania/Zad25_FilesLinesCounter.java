package JavaStartZadania;

import java.io.*;
import java.lang.reflect.InaccessibleObjectException;
import java.util.Scanner;

public class Zad25_FilesLinesCounter {
    static String baseDir = null;
    static int lines = 0;
    static String path;
    static File file;
    static int linesSum = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        path = readFolderPath();
        checkDirectoryAndStart(file);
        System.out.println("Suma wszystkich linii we wszystkich plikach: " + linesSum);
    }

    private static String readFolderPath() throws InaccessibleObjectException {
        System.out.println();
        System.out.println("Podaj ścieżkę do folderu z plikami:");
        path = sc.nextLine();
        baseDir = path;
        file = new File(path);
        if (fileOrDirectoryExists(file))
            return path;
        else return ("Błędna ścieżka.");
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
        File file1 = new File(path+"/"+"example.txt");

        lines = 0;
        try (fileReader; reader;) {
            while (reader.readLine() != null) {
                lines++;
            }
            if (fileName.equals(file1)) {
              addText(fileName);
            }
            System.out.println(file1.toString()+" "+fileName.toString());
            System.out.println(fileName.equals(file1));
            linesSum += lines;
            String relativeName = file.getAbsolutePath().replace(baseDir, "");
            System.out.println("Ilość wierszy w pliku: " + relativeName + " --> " + lines);
        }
    }
    private static void addText(File fileName) throws IOException {
        var newFile = new FileWriter(fileName, true);
        var bw = new BufferedWriter(newFile);
        String additionalText = "\r\nextra text i ...nic";
        bw.append(additionalText);
        bw.close();
    }
}

