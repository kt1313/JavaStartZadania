package JavaStartZadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Zad26_Lottery {
    static List<String> numbersAsStringsArray = new ArrayList<>();
    static List<Integer> numbersArray = new ArrayList<>();
    static List<String> megaballAsStringArray = new ArrayList<>();
    static List<Integer> megaballArray = new ArrayList<>();

    static SortedSet<Map.Entry<Integer, Integer>> sortedset = new TreeSet<Map.Entry<Integer, Integer>>(
            new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> e2,
                                   Map.Entry<Integer, Integer> e1) {
                    return e1.getValue().compareTo(e2.getValue());
                }
            });

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
                //System.out.println(splittedLine[posOfNumbers]);
                numbersAsStringsArray.add(splittedLine[posOfNumbers]);
                //System.out.println(splittedLine[posOfNumbers + 1]);
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
        System.out.println("tablica numerow malejaco: "+ sortedset.stream().limit(10).collect(Collectors.toList()));
        convertToHashTree(megaballArray);
        System.out.println("tablica megaballi malejaco"+sortedset.stream().limit(3).collect(Collectors.toList()));
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
               // System.out.println(singleNumbers[i]);
                //tu tworzy numbersArray
                numbersArray.add(singleNumbers[i]);
            }
           // System.out.println("To byl wydruk linii: " + j);
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
                //System.out.println(!numbersTreeMap.containsKey(number));
                numbersTreeMap.put(number, v);
                sortedset.addAll(numbersTreeMap.entrySet());
            }
        }
    }
}




