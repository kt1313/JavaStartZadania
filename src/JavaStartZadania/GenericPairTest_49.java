package JavaStartZadania;

import javax.print.DocFlavor;
import javax.xml.crypto.dom.DOMCryptoContext;
import java.awt.*;
import java.io.File;

public class GenericPairTest_49 {
    public static void main(String[] args) {
        GenericPair_49<String, Integer> example1 = new GenericPair_49<>("Gutek", 2345);
        GenericPair_49<Double, Double> example2 = new GenericPair_49<>(23.45, 234.5);
        GenericPair_49<String, String> example3 = new GenericPair_49<>("Gutek", "2345");

        printData(example1);
        printData(example2);
        printData(example3);


    }

   static void printData(GenericPair_49 pair) {
       System.out.println("" + pair.getT() + " " + pair.getV());

    }
}