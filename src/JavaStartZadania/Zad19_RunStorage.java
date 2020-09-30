package JavaStartZadania;

import java.io.IOException;
import java.util.List;

public class Zad19_RunStorage {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Zad19_Storage products=new Zad19_Storage();
       String storage=products.getFileName();
        List<String> allLines= Zad19_Storage.readFile(storage);
        Zad19_Storage.addProduct(allLines);
    }

}
