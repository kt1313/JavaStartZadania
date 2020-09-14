package pl.javastart.application;

import pl.javastart.logic.Charger_12;
import pl.javastart.model.Telphone_12;

public class PhoneTest_12 {
    public static void main(String[] args) {

        Telphone_12 telephone = new Telphone_12("Samsung", "Galaxy S10", 3400, 75);
        Charger_12 charger = new Charger_12();

        System.out.println(telephone.getBrand()
                + " " + telephone.getModel()
                + ", bateria: " + telephone.getBatteryCapacity() + "mAh"
                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");

        charger.charge(telephone);
        System.out.println(telephone.getBrand()
                + " " + telephone.getModel()
                + ", bateria: " + telephone.getBatteryCapacity() + "mAh"
                + ", poziom naładowania: " + telephone.getChargeLevel() + "%");


    }
}
