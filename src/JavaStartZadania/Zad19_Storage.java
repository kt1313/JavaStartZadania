package JavaStartZadania;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad19_Storage {
    List<Zad19_Product> products = new ArrayList<>();
    private static final String PRODUCT_LIST = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\storage.csv";
    static String fileName;
    static int numberOfLines;
    static Scanner sc = new Scanner(System.in);

    public static String getFileName() {
        System.out.println("Podaj nazwę pliku");
        return sc.nextLine();
    }

    //metody z pakietu New IO (nio):
    public static List<String> readFile(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.err.println("No such file");
        }
        return new ArrayList<>();
    }
//to samo tylko dłużej:
//    public static List<String> readFile(String fileName) {
//        List<String> allLines = new ArrayList<>();
//        try (Scanner scanner = new Scanner(new File(fileName))) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                allLines.add(line);
//            }
//        } catch (FileNotFoundException e) {
//            System.err.println("No such file: " + fileName);
//        }
//        return allLines;
//    }

    //    public  void readNumberOfLines() throws IOException, ClassNotFoundException {
//        try {
//            Scanner sc = new Scanner(new File(PRODUCT_LIST));
//            sc.nextLine();
//            while ((sc.nextLine()) != null) {
//                numberOfLines++;
//            }
//            sc.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//    public  List<Zad19_Product> readFile()throws IOException, ClassNotFoundException {
//
//        List<Zad19_Product> products = new ArrayList<>();
//
//        try {
//            Scanner sc = new Scanner(new File(fileName));
//            sc.nextLine();
//            for (Zad19_Product p : products
//            ) {
//                String line = sc.nextLine();
//                p = addProduct(line);
//            }
//            sc.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return products;
//    }
    public void printProduct() {

    }

    public static void addProduct(List<String> line) {
        String[] splittedLine = null;
        for (String s : line
        ) {

            splittedLine = s.split(";");
            String name = splittedLine[0];
            int amount = Integer.parseInt(splittedLine[1]);
           Zad19_Product product= new Zad19_Product(name, amount);
            System.out.print(product.toString());
            product.printStars(amount);
            System.out.println();
        }
    }
}

