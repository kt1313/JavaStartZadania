package JavaStartZadania;

import java.util.ArrayList;
import java.util.Scanner;

class Numbers_54 {
    private static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);
    private static double sum = 0;

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        addToList(numbers);
        System.out.println("Ilość poprawnych liczb: " + numbers.size());
        System.out.println("Suma wszystkich liczb: " + sum(numbers));
        double average = ((double) sum(numbers)) / numbers.size();
        System.out.println("Srednia wszystkich liczb: " + average);
        printData(numbers);

    }

    static void addToList(ArrayList<Integer> numbers) {
        System.out.println("Podaj kolejną liczbę nieujemną i podzielną przez 5.");
        Integer number = sc.nextInt();
        if ((number < 0) || (number % 5 != 0)) {
            System.out.println("Liczba ujemna lub niepodzielna przez zero");
            return;
        }
        try {
            numbers.add(number);
        } catch (NumberFormatException e) {
            System.out.println("Liczba w nieodpowiednim formacie");
        }
        addToList(numbers);
    }

    static int sum(ArrayList<Integer> numbers) {
        int sum = 0;
        for (Integer integer : numbers
        ) {
            sum += integer;
        }
        return sum;
    }

    static void printData(ArrayList<Integer> numbers) {
        if (!numbers.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (double d : numbers) {
                sb.append(d);
                sb.append('+');
                sum += d;
            }
            sb.replace(sb.length() - 1, sb.length(), "=");
            sb.append(sum);
            System.out.println(sb.toString());
        }
    }
}