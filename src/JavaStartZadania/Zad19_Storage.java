package JavaStartZadania;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad19_Storage {
    List<Zad19_Product> products = new ArrayList<>();
     static String fileName;
     static int numberOfLines;
    Scanner sc = new Scanner(System.in);

    public void getCompanyName(){
        System.out.println("Podaj nazwę pliku");
     fileName= sc.nextLine();
    }


    public  void readNumberOfLines(String fileName) throws IOException, ClassNotFoundException {
        try {
            Scanner sc = new Scanner(new File(fileName));
            sc.nextLine();
            while ((sc.nextLine()) != null) {
                numberOfLines++;
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Zad19_Product readFile()throws IOException, ClassNotFoundException {
        List<Zad19_Product> products = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new File(fileName));
            sc.nextLine();
            for (int i = 1; i < numberOfLines; i++) {
                String line = sc.nextLine();
                clients[i] = addClient(line);
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clients;
    public void printProduct(){

    }
}
