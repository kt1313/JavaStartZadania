package JavaStartZadania;

import java.io.*;
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
                System.out.println(splittedLine[posOfNumbers + 1]);
                megaballAsStringArray.add(splittedLine[posOfNumbers + 1]);
            }
            //zamienia na Integery
            numbersArray = splitAndChangeStringArrayToInteger(numbersAsStringsArray);
            megaballArray = splitAndChangeStringArrayToInteger(megaballAsStringArray);
            convertToHashTree(numbersArray);
            System.out.println("tablica numerow malejaco: "+ sortedset.stream().limit(10).collect(Collectors.toList()));
            convertToHashTree(megaballArray);
            System.out.println("tablica megaballi malejaco"+sortedset.stream().limit(3).collect(Collectors.toList()));
        } catch (
                FileNotFoundException e) {
            System.err.println("Brak pliku " + fileName);
        }

    }

    static ArrayList<Integer> splitAndChangeStringArrayToInteger(List<String> stringArray) {
        int iterationLimit = 5;
        if (stringArray.equals(megaballAsStringArray)) {
            iterationLimit = 1;
        }
        ArrayList<Integer> numbersArray = new ArrayList<>();
        Integer[] singleNumbers;

        for (String s : stringArray
        ) {
            singleNumbers = new Integer[iterationLimit];

            for (int i = 0; i < iterationLimit; i++) {
                String[] line = s.split(" ");
                singleNumbers[i] = (Integer.parseInt(line[i]));
                //tu tworzy numbersArray
                numbersArray.add(singleNumbers[i]);
            }
        }
        return numbersArray;
    }

    private static void convertToHashTree(List<Integer> integerArray) {
            SortedMap<Integer, Integer> numbersTreeMap = new TreeMap<Integer, Integer>();
        if (integerArray.equals(megaballArray)) {
            numbersTreeMap.clear();
            sortedset.clear();
          }
        for (Integer number : integerArray
        ) {
            int v = Collections.frequency(integerArray, number);
            if (numbersTreeMap != null && !numbersTreeMap.containsKey(number)) {
                numbersTreeMap.put(number, v);
            }else if(numbersTreeMap == null){numbersTreeMap.put(number, v);
                }
        }
        sortedset.addAll(numbersTreeMap.entrySet());

    }
}
//    Można by tutaj wykorzystać także bardziej współczesne podejście w oparciu o strumienie.
//        W takim przypadku moglibyśmy wykorzystać BufferedReadera.

//    List<Result> readResultsFromFile(String fileName) throws IOException {
//        List<Result> results = new ArrayList<>();
//        var fileReader = new FileReader(fileName);
//        var bufferedReader = new BufferedReader(fileReader);
//        bufferedReader.readLine(); //pomijamy nagłówek pliku
//        return bufferedReader.lines()
//                .map(Result::fromCsv)
//                .collect(Collectors.toList());
//    }



