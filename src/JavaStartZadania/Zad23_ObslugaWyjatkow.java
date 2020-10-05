package JavaStartZadania;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Zad23_ObslugaWyjatkow {
    public static void main(String[] args) throws InterruptedException {
           List<Double> numbers = readNumbersFromUser();
           printSum(numbers);
    }

    private static List<Double> readNumbersFromUser() throws InterruptedException {

        List<Double> numbers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Podaj liczbę (liczba ujemna kończy wprowadzanie):");
           try {
               number = input.nextDouble();
               if (number >= 0) {
                   numbers.add(number);
               }
           }catch(InputMismatchException ex){
               System.out.println("To nie jest poprawna liczba. Spróbuj jeszcze raz. Naciśnij Enter");
               Thread.sleep(2000);
               input.nextLine();
           }
        } while(number >= 0);
        return numbers;
    }

    private static void printSum(List<Double> numbers) {
        StringBuilder builder = new StringBuilder();
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            builder.append(numbers.get(i));
            sum += numbers.get(i);
            if(i < (numbers.size()-1))
                builder.append(" + ");
        }
        builder.append(" = ");
        builder.append(sum);
        System.out.println(builder.toString());
    }
}
