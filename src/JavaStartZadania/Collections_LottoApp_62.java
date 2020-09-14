package JavaStartZadania;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collections_LottoApp_62 {
    public static void main(String[] args) {
        System.out.println("Start!");
        Collections_Lotto_62 newGame = new Collections_Lotto_62();
        List<Integer> customerNrs = getCustomerNrs();
        int shot = newGame.compareResult(customerNrs);
        System.out.println("Trafionych jest " + shot + " liczb");
        System.out.println(newGame);

    }

    private static ArrayList<Integer> getCustomerNrs() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> customersNrs = new ArrayList<>();
        while (customersNrs.size() < 6) {
            System.out.print(" Podaj liczbę: ");
            customersNrs.add(sc.nextInt());
        }
        sc.close();
        return customersNrs;
    }


}

