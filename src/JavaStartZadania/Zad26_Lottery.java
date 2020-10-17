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
                String line = sc.nextLine();
                String[] splittedLine = line.split(",");
                //ależ koślawo... z tablicy pojedynczo wrzucamy numery do numbersArray zaczynajac od 2go miejsca,
                int posOfNumbers = 1;
                System.out.println(splittedLine[posOfNumbers]);
                numbersAsStringsArray.add(splittedLine[posOfNumbers]);
                System.out.println(splittedLine[posOfNumbers+1]);
                megaballAsStringArray.add(splittedLine[posOfNumbers+1]);
            }
            numbersArray = splitAndChangeStringArrayToInteger(numbersAsStringsArray);
            megaballArray = splitAndChangeStringArrayToInteger(megaballAsStringArray);
            //klasa Collections ma metodę frequency, ktora zlicza liczbe wystapien danego elementu
        } catch(
                FileNotFoundException e)

        {
            System.err.println("Brak pliku " + fileName);
        }
        for (String n : numbersAsStringsArray
        ) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (String n : megaballAsStringArray
        ) {
            System.out.print(n + " ");
        }
    }



    static List<Integer> splitAndChangeStringArrayToInteger(List<String> stringArray) {

        List<Integer> numbersArray = new ArrayList<>();
        Integer[] singleNumbers;
        System.out.println("długość " + stringArray + " to " + stringArray.size());
        for (String s : stringArray
        ) {
            singleNumbers = new Integer[s.length()];
            for (int i = 0; i < s.length(); i++) {
                String[] line = s.split(" ");
                numbersArray.add(Integer.parseInt(line[i]));
            }
        }
        return numbersArray;
    }
}
//    private static String addNumbers(String[] additArray){
//        String[] splittedNumbers=null;
//        splittedNumbers=line.split(" ");
//        Arrays.stream(numbersArray).toArray()=splittedNumbers[1].
//        return splittedNumbers;


