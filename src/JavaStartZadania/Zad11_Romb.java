package JavaStartZadania;

import java.util.Scanner;

public class Zad11_Romb {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Podaj długość boku rombu:");
        int side = sc.nextInt();
        sc.close();
        for (int i=1;i<=side;i++){
            for (int j=1;j<=(side-i);j++){System.out.print(" ");}for (int k=1;k<=side;k++){System.out.print("*");}
            System.out.println();
        }
    }
}
