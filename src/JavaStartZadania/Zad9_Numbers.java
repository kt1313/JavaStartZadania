package JavaStartZadania;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Zad9_Numbers {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        int[] intArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            intArray[i - 1] = i;
        }
        for (int i : intArray) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print(i + " Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(i + " Buzz ");
            }
        }
        System.out.println();
        System.out.println();
        IntStream.iterate(1, x -> x + 1)
                .limit(100)
                .forEach(number -> {
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.print(number + " FizzBuzz ");
                    } else if (number % 3 == 0) {
                        System.out.print(number + " Fizz ");
                    } else if (number % 5 == 0) {
                        System.out.print(number + " Buzz ");
                    }
                });
    }
}
