package JavaStartZadania;

import java.util.Random;

 class Dice_10 {

    int number1, number2;

    Dice_10() {
        number1 = roll();
    }

    Dice_10(int top) {
        number2 = top;
    }

    int roll() {
        Random rand = new Random();
        System.out.println(rand.nextInt());
        return (rand.nextInt(5) + 1);

    }

    void showRoll() {
        System.out.println("Liczba oczek na kostce to: " + roll());
    }

    void showSet() {
        System.out.println("Liczba oczek na kostce to: " + number2);
    }

}
