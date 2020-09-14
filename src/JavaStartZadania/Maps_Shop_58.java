package JavaStartZadania;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Maps_Shop_58 {
    /*W pętli while wczytujemy wiersz tekstu i rozdzielamy go na trzy wyrazy używając metody split().
    Pierwszy element wynikowej tablicy to nazwa kategorii, dalej nazwa produktu i jego cena.
    W instrukcji if-else sprawdzam, czy do danej kategorii jest już przypisany jakiś zbiór.
    Jeżeli tak, to dodajemy do niego kolejny produkt. Jeżeli nie, to najpierw tworzymy zbiór, dodajemy
    do niego produkt i taki zbiór przypisujemy do kategorii w mapie. Metoda readFile() staje się dosyć długa,
    pojawiają się w niej zagnieżdżenia, warto rozważyć jej ewentualny podział na mniejsze części,
    np. wydzielenie logiki związanej ze wstawianiem obiektów do mapy do osobnej metody
    * */
    static Map<String, TreeSet<Maps_Product_58>> readFile(String fileName) throws FileNotFoundException {
        Map<String, TreeSet<Maps_Product_58>> productsMap = new HashMap<>();
        try (Scanner fileReader = new Scanner(new File(fileName))) {
            fileReader.nextLine();
            while (fileReader.hasNextLine()) {
                String[] data = fileReader.nextLine().split(";");
                String category = data[0];
                Maps_Product_58 product = new Maps_Product_58(data[1], Double.parseDouble(data[2]));
                if (productsMap.containsKey(category))
                    productsMap.get(category).add(product);
                else {
                    TreeSet<Maps_Product_58> categorySet = new TreeSet<>();
                    categorySet.add(product);
                    productsMap.put(category, categorySet);
                }
            }
        }
        return productsMap;
    }
}
