package JavaStartZadania;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Zad16_Arrays {

    private int[] arrayInt;
    private int[][] arrayInt1;
    private int[][] arrayInt2;
    private String[][] arrayString1;
    private String[][] arrayString2;

    public int[] getArrayInt() {
        return arrayInt;
    }

    public void setArrayInt(int[] arrayInt) {
        this.arrayInt = arrayInt;
    }

    public int[][] getArrayInt1() {
        return arrayInt1;
    }

    public void setArrayInt1(int[][] arrayInt1) {
        this.arrayInt1 = arrayInt1;
    }

    public int[][] getArrayInt2() {
        return arrayInt2;
    }

    public void setArrayInt2(int[][] arrayInt2) {
        this.arrayInt2 = arrayInt2;
    }

    public String[][] getArrayString1() {
        return arrayString1;
    }

    public void setArrayString1(String[][] arrayString1) {
        this.arrayString1 = arrayString1;
    }

    public String[][] getArrayString2() {
        return arrayString2;
    }

    public void setArrayString2(String[][] arrayString2) {
        this.arrayString2 = arrayString2;
    }

    public static int[][] compareSumsOfIntArrays(int[][] arrayInt1, int[][] arrayInt2) {
        int[][] biggerIntSumArray;
        int sum1 = sumArrayContent(arrayInt1);
        int sum2 = sumArrayContent(arrayInt2);
        if (sum1 > sum2) {
            biggerIntSumArray = arrayInt1;
        } else {
            biggerIntSumArray = arrayInt2;
        }
        ;
        return biggerIntSumArray;
    }

    public static int sumArrayContent(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    public static String[][] compareSumOfStringArray(String[][] arrayString1, String[][] arrayString2) {
        String[][] longerStringsArray;
        int sum1 = sumOfCharsInArray(arrayString1);
        int sum2 = sumOfCharsInArray(arrayString2);
        if (sum1 > sum2) {
            longerStringsArray = arrayString1;
        } else {
            longerStringsArray = arrayString2;
        }
        ;
        return longerStringsArray;
    }

    public static int sumOfCharsInArray(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j].length();
            }
        }
         return  sum;
    }
//    static int sumChars(String[] array) {
//        return Arrays.stream(array)
//                .mapToInt(String::length)
//                .sum();
//    }

    public static int biggestInt(int[] arrayInt) {
        int biggestInt = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (biggestInt < arrayInt[i]) {
                biggestInt = arrayInt[i];
            }
        }
        return biggestInt;
    }

    public static int smallestInt(int[] arrayInt) {
        int smallestInt = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (smallestInt > arrayInt[i]) {
                smallestInt = arrayInt[i];
            }
        }
        return smallestInt;
    }

    public static int[] biggestSumRow(int[][] arrayInt) {
        int[] rowArray = null;
        int sumOfElems = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            if (sumOfElems < sumOfRow(arrayInt[i])) {
                rowArray = arrayInt[i];
                sumOfElems = sumOfRow(arrayInt[i]);
            }
        }
        return rowArray;
    }

    public static int sumOfRow(int[] arrayRow) {
        int sum = 0;
        for (int i = 0; i < arrayRow.length; i++) {
            sum += arrayRow[i];
        }
        return sum;
    }

}
