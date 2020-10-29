package JavaStartZadania;

import java.io.*;

public class Zad27_FileWriter {
    final String filePath = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\ContactBook.csv";

    public void createOrFindFile() throws IOException {
        File file = new File(filePath);
        if (fileExists(file)) {
            openFile();
        } else {
            createFile();
            FileWriter fw = new FileWriter(filePath);
            BufferedWriter bw = new BufferedWriter(fw);

        }
    }

    public static boolean fileExists(File file) {
        return (file.isFile());
    }

    public void openFile() throws FileNotFoundException {
        var fileReader = new FileReader(filePath);
        var reader = new BufferedReader(fileReader);

    }

    public void createFile() {

    }
}
