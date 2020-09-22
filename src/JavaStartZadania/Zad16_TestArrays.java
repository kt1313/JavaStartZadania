package JavaStartZadania;

import java.util.Arrays;

public class Zad16_TestArrays {
    public static void main(String[] args) {
        //Zad1
        int[][] multiArr1 = {
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3}
        };
        int[][] multiArr2 = {
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5},
                {6, 6, 6, 6, 6}
        };
        int[][] biggerArray = Zad16_Arrays.compareSumsOfIntArrays(multiArr1, multiArr2);
        System.out.println("Większa tablica to: ");
        for (int[] a : biggerArray
        ) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();

        //Zad2
        String[] strArr1a = {"Ala", "ma", "kota"};
        String[] strArr1b = {"pole", "na", "lewo", "od", "chalupy"};
        String[] strArr1c = {"tam", "siedzi", "Wuj"};
        String[][] strArr1 = {strArr1a, strArr1b, strArr1c};
        String[] strArr2a = {"Ala", "ma", "kota", "i", "psa"};
        String[] strArr2b = {"to", "dwie", "krowy"};
        String[] strArr2c = {"daj", "mi", "spokoj"};
        String[][] strArr2 = {strArr2a, strArr2b, strArr2c};
        String[][] longerStringArray = Zad16_Arrays.compareSumOfStringArray(strArr1, strArr2);
        System.out.println("Dłuższa tablica to: ");
        for (String[] s : longerStringArray
        ) {
            System.out.println(Arrays.toString(s));
        }
        System.out.println();

        //Zad3 i 4
        int[] numbers = {5, 1, 10, 105, 23, 45, 220, 87, 16};
        int biggestInt = Zad16_Arrays.biggestInt(numbers);
        int smallestInt = Zad16_Arrays.smallestInt(numbers);
        System.out.println("Największa cyfra to: " + biggestInt);
        System.out.println("Najmniejsza cyfra to: " + smallestInt);
        System.out.println();

        //Zad5
        int[][] multiArr = {
                {1, 2, 3},
                {8, 9, 10},
                {4, 5, 6},
                {6, 7, 8}
        };
        int[] biggestRow = Zad16_Arrays.biggestSumRow(multiArr);
        System.out.println("Najdłuższy wiersz to: " + Arrays.toString(biggestRow));
    }
}
