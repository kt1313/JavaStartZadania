package JavaStartZadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zad26_Lottery {
    static List<String> numbersAsStringsArray = new ArrayList<>();
    static List<Integer> numbersArray = new ArrayList<>();
    static List<String> megaballAsStringArray = new ArrayList<>();
    static List<Integer> megaballArray = new ArrayList<>();

    public static void main(String[] args) {
        final String fileName = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\Lottery.csv";

        try (Scanner sc = new Scanner(new File(fileName))) {
            sc.nextLine();
            while (sc.hasNextLine()) {
                //trpochę koślawo
                //czyta plik dopoki nie napotka pustej linii
                //dzieli zczytana linie na czesci i wstawia je odpowiednio do tablicy numerow i megaball
                String line = sc.nextLine();
                String[] splittedLine = line.split(",");
                int posOfNumbers = 1;
                System.out.println(splittedLine[posOfNumbers]);
                numbersAsStringsArray.add(splittedLine[posOfNumbers]);
                System.out.println(splittedLine[posOfNumbers + 1]);
                megaballAsStringArray.add(splittedLine[posOfNumbers + 1]);
            }
            //zamienia na Integery
            numbersArray = splitAndChangeStringArrayToInteger(numbersAsStringsArray);
            megaballArray = splitAndChangeStringArrayToInteger(megaballAsStringArray);
            //klasa Collections ma metodę frequency, ktora zlicza liczbe wystapien danego elementu
        } catch (
                FileNotFoundException e) {
            System.err.println("Brak pliku " + fileName);
        }
        convertToHashTree(numbersArray);
    }

    static ArrayList<Integer> splitAndChangeStringArrayToInteger(List<String> stringArray) {
        int iterationLimit = 5;
        if (stringArray.equals(megaballAsStringArray)) {
            iterationLimit = 1;
        }
        ArrayList<Integer> numbersArray = new ArrayList<>();
        Integer[] singleNumbers;
        int j = 1;

        for (String s : stringArray
        ) {

            singleNumbers = new Integer[iterationLimit];

            for (int i = 0; i < iterationLimit; i++) {
                String[] line = s.split(" ");
                singleNumbers[i] = (Integer.parseInt(line[i]));
                System.out.println(singleNumbers[i]);
                //tu tworzy numbersArray
                numbersArray.add(singleNumbers[i]);
            }
            System.out.println("To byl wydruk linii: " + j);
            j++;
        }
        return numbersArray;
    }

    private static void convertToHashTree(List<Integer> integerArray) {
        SortedMap<Integer, Integer> numbersTreeMap = new TreeMap<Integer, Integer>();

        for (Integer number : integerArray
        ) {
            int v = Collections.frequency(integerArray, number);
            if (numbersTreeMap != null && !numbersTreeMap.containsKey(number)) {
                System.out.println(!numbersTreeMap.containsKey(number));
                numbersTreeMap.put(number, v);
                System.out.println();
            }
        }

    }
}
//    SortedMap<String, Double> myMap = new TreeMap<String, Double>();
//    myMap.put("a", 10.0);
//    myMap.put("b", 9.0);
//    myMap.put("c", 11.0);
//    myMap.put("d", 2.0);
//    sortedset.addAll(myMap.entrySet());
//    System.out.println(sortedset);
//    Output:
//
//            [d=2.0, b=9.0, a=10.0, c=11.0]



