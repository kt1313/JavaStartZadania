package JavaStartZadania;

import java.util.Scanner;

public class AlgorytmTest1_25 {
    public static void main(String[] args) {
        Algorytm1_25 number = new Algorytm1_25();
        System.out.println("Podaj liczbę. Aby zakończyć podaj liczbę większą od 100.");

        do {
            number.add();
            System.out.println(number.suma);

        }while(number.numbers[number.index]<100);
        System.out.println(number.suma);
    }
}
