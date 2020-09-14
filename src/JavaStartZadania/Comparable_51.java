package JavaStartZadania;

import java.util.Arrays;
import java.util.Comparator;

class Comparable_51 implements Comparable<Integer> {
    public static void main(String[] args) {
        Integer[] intArray = {2, 34, 42, 45, 1, 76, 32, 88, 97, 65, 43, 12, 13, 1, 5, 7, 9, 100, 19, 36};
        System.out.println("Nieposortowana: ");
        for (Integer i : intArray) {
            System.out.print(i + ", ");
        }
        System.out.println();

        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray);
        System.out.println("Posortowane rosnąco: ");
        System.out.println(Arrays.toString(intArray));

        Arrays.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        });
        System.out.println("Posortowana malejąco: ");
        System.out.println(Arrays.toString(intArray));
    }


    @Override
    public int compareTo(Integer o) {
        return 0;
    }
}

