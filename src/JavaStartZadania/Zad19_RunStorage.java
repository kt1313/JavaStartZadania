package JavaStartZadania;

import java.io.IOException;

public class Zad19_RunStorage {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Zad19_Storage products=new Zad19_Storage();
        String storage=products.getFileName();
        products.readNumberOfLines();
        System.out.println(products.readFile());
    }
}
