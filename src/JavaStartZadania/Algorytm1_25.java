package JavaStartZadania;

import java.util.Scanner;

public class Algorytm1_25 {
    int numbers[];
    int index = 0;
    int suma = 0;

    public void add() {
        Scanner read = new Scanner(System.in);
        if(read.nextInt()<100) {
            numbers[index] = read.nextInt();
            index++;
        }
    }

    public int sum() {
        for (int i = 0; i <= index; i++) {

        }
        return suma;
    }
}
