package JavaStartZadania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Zad26_Lottery {
    static List<String> numbersArray = new ArrayList<>();
    static List<String> megaballArray = new ArrayList<>();

    public static void main(String[] args) {
        final String fileName = "C:\\Users\\Dell\\IdeaProjects\\JavaStartZadania\\src\\Lottery.csv";

//        {
//            @Override
//            public int compare(Integer s1, Integer s2) {
//                return -(s1.compareTo(s2));
//            }
//        });

        try (Scanner sc = new Scanner(new File(fileName))) {
            sc.nextLine();
            //int megaIndex = 0;
            int i = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] splittedLine = line.split(" ");
                //ależ koślawo... z tablicy pojedynczo wrzucamy numery do numbersArray zaczynajac od 2go miejsca,
                // bo data
                for (int j = 1; j < splittedLine.length - 1; j++) {
                    System.out.println(splittedLine[j]);
                    numbersArray.add(splittedLine[j]);
                    //a megaball do osobnej tabl
                  //
                }
                i++;
                //klasa Collections ma metodę frequency, ktora zlicza liczbe wystapien danego elementu
            }

            for (String n : numbersArray
            ) {
                System.out.println(n);
            }
            for (String n : megaballArray
            ) {
                System.out.println(n);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku " + fileName);
        }
    }
//    private static String addNumbers(String[] additArray){
//        String[] splittedNumbers=null;
//        splittedNumbers=line.split(" ");
//        Arrays.stream(numbersArray).toArray()=splittedNumbers[1].
//        return splittedNumbers;
}

