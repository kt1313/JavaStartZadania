package JavaStartZadania;

import java.util.ArrayList;
import java.util.Scanner;

class Sum_53 {
    private static final String EXIT = "exit";
    private static Scanner sc = new Scanner(System.in);
    private static double sum = 0;

    public static void main(String[] args) {
        ArrayList<Double> dobs = new ArrayList<>();
        addToList(dobs);
        printData(dobs);
    }

    static void addToList(ArrayList<Double> dobs) {
        System.out.println("Podaj kolejną liczbę lub wyjdź \"exit\"");
        String number = sc.nextLine();
        if (number.equals(Sum_53.EXIT)) {
            return;
        }
        try {
            Double num = Double.valueOf(number);
            dobs.add(num);
        } catch (NumberFormatException e) {
            System.out.println("Liczba w nieodpowiednim formacie");
        }
        addToList(dobs);
    }

    static void printData(ArrayList<Double>dobs){
        if (!dobs.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            double sum = 0;
            for (double d : dobs) {
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