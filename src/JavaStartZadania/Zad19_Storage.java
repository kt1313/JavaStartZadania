package JavaStartZadania;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad19_Storage {
    List<Zad19_Product> products = new ArrayList<>();
    private static final String PRODUCT_LIST = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\storage.csv";
    static String fileName;
     static int numberOfLines;
    Scanner sc = new Scanner(System.in);

    public String getFileName(){
        System.out.println("Podaj nazwę pliku");
     return  sc.nextLine();
    }


    public  void readNumberOfLines() throws IOException, ClassNotFoundException {
        try {
            Scanner sc = new Scanner(new File(PRODUCT_LIST));
            sc.nextLine();
            while ((sc.nextLine()) != null) {
                numberOfLines++;
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public  List<Zad19_Product> readFile()throws IOException, ClassNotFoundException {

        List<Zad19_Product> products = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(fileName));
            sc.nextLine();
            for (Zad19_Product p : products
            ) {
                String line = sc.nextLine();
                p = addProduct(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
    public void printProduct(){

    }
        public  Zad19_Product addProduct(String line) {
            String[] splittedLine = null;
            splittedLine = line.split(";");
            String name = splittedLine[0];
            int amount = Integer.parseInt(splittedLine[1]);
            return new Zad19_Product(name, amount);
        }
}
