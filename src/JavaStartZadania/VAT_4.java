package JavaStartZadania;

import java.util.Scanner;

public class VAT_4 {
    public static void main(String[] args) {
        final double Vat = 0.23;
        Scanner read = new Scanner(System.in);
        double cenaBrutto, cenaNetto;

        System.out.println("Poodaj cenę: ");
        cenaNetto = read.nextInt();
        System.out.println(cenaNetto);
        cenaBrutto = (Vat*cenaNetto) + cenaNetto;
        System.out.println("VAT wynosi: " + Vat + "\n" + "\nCena netto: " + cenaNetto +  "\nCena brutto: " + cenaBrutto);

    }
}
