package JavaStartZadania;
import java.util.Random;

public class RandomNumberTest_13 {
    public static void main(String[] args) {

        RandomNumber_13 rand = new RandomNumber_13();
        int number = rand.random();
        System.out.println("Wylosowana liczba to: " + number);



        rand.compareToNumber(number, 5000);
        rand.odd(number);
        rand.description(number);
    }
}
