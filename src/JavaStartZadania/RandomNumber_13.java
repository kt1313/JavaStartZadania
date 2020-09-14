package JavaStartZadania;

import java.util.Random;

public class RandomNumber_13 {

    public void description(int number) {
        int length = String.valueOf(number).length();
        if (length >= 4) {
            System.out.println("Wylosowana liczba to: " + number);
        } else if (number == 0) {
            System.out.println("Wylosowana liczba wynosi 0");
        } else {

            switch (length = String.valueOf(number).length()) {
                case 4:
                    System.out.println("Liczba 4-cyfrowa wynosi: " + number);
                    break;
                case 3:
                    System.out.println("Uzupełniona do 4 cyfr wynosi: " + number * 10);
                    break;
                case 2:
                    System.out.println("Uzupełniona do 4 cyfr wynosi: " + number * 100);
                    break;
                case 1:
                    System.out.println("Uzupełniona do 4 cyfr wynosi: " + number * 1000);
                    break;
            }

        }
    }

    public int random() {
        Random rand = new Random();
        return (rand.nextInt(9999));
    }

    public void odd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " jest liczbą parzystą.");
        } else {
            System.out.println(number + " nie jest liczbą parzystą.");
        }

    }

    public void compareToNumber(int number, int compareTo) {
        if (number > compareTo) {
            System.out.println(number + " jest wiékszy od " + compareTo);
        } else if (number == compareTo) {
            System.out.println(number + " jest równy " + compareTo);
        } else
            System.out.println(number + " jest mniejszy od " + compareTo);
    }
}
