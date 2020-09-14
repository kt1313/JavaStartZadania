package JavaStartZadania;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class FileNamesTreeSet_55 {
    public static void main(String[] args) {
        final String fileName = "C:\\Users\\Dell\\IdeaProjects\\JavaStart\\src\\namespl.txt";
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -(s1.compareTo(s2));
            }
        });
//jak łatwo odczytać plik i obsłuzyć błędy!!!
        try (Scanner sc = new Scanner(new File(fileName))) {
            while (sc.hasNextLine()) {
                names.add(sc.nextLine());
            }
            System.out.println("Liczba imion w zbiorze: " + names.size());
            System.out.println("Pierwsze imię: " + names.first());
            System.out.println("Ostatnie imię: " + names.last());
            for (String n : names
            ) {
                System.out.println(n);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku " + fileName);
        }
    }
    /*
     * Do odczytu imion z pliku posłużymy się obiektem typu Scanner, a do przechowywania danych
     * skorzystamy ze zbioru typu TreeSet. Gwarantuje on nam zarówno unikalność obiektów jak i
     * możliwość ich automatycznego sortowania w trakcie dodawania. W konstruktorze obiektu
     * TreeSet przekazujemy obiekt anonimowej klasy reprezentującej komparator. W celu zapewnienia
     * odwrotnej kolejności niż alfabetyczna posłużyliśmy się trikiem, który wykorzystywaliśmy już
     * we wcześniejszych zadaniach - zwracamy wartość zwróconą przez domyślną metodę compareTo()
     * klasy String, ale ze zmienionym znakiem (znak minus). Korzystamy z konstrukcji try-with-resources,
     * więc ręczne zamknięcie Scannera nie będzie konieczne. W pętli sprawdzamy, czy nie doszliśmy do
     * końca pliku, wczytujemy kolejne imię i dodajemy je do zbioru. Na końcu wyświetlamy dane
     * wymagane w zadaniu. Pierwszy i ostatni element pobieramy dzięki metodom first() i last() klasy
     * TreeSet. Rozmiar zbioru, czyli ilość unikalnych imion pobieramy wywołując metodę size().*/
}