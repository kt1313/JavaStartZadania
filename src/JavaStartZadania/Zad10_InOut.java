package JavaStartZadania;

import java.math.BigDecimal;
import java.util.Scanner;

public class Zad10_InOut {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Podaj liczbę całkowitą z zakrseu od -10 do 10:");
        double digit= sc.nextDouble();
        sc.close();
        if (digit%1!=0){
            System.out.println("Podaj liczbe cakowitą!");
        }else{
            if(digit<0){
                for(double i=digit ; i<=0; i=i+0.1){
                    System.out.printf("%.1f, ", i);
                }
            }else {
                for(double i=digit ; i>=0; i=i-0.1){
                    System.out.printf("%.1f, ", i);
                }
            }
        }
    }
}
