package JavaStartZadania;

import org.w3c.dom.ls.LSOutput;

public class WaterConsumption_6 {
    public static void main(String[] args) {

        Plants_6 plant1 = new Plants_6();
        Plants_6 plant2 = new Plants_6();
        Plants_6 plant3 = new Plants_6();

        plant1.name = "Kaktus";
        plant1.description = "Nie siadać! ";
        plant1.waterPerDay = 0.01;

        plant2.name = "Fikus";
        plant2.description = "Zwisa nad łóżkiem. ";
        plant2.waterPerDay = 0.5;

        plant3.name = "Benjamin";
        plant3.description = "Z nami całe życie ";
        plant3.waterPerDay = 2;

        System.out.println("Dzienne zuzycie wody: " + (plant1.waterPerDay + plant2.waterPerDay + plant3.waterPerDay));
        System.out.println("Tygodniowe zuzycie wody: " + (7*(plant1.waterPerDay + plant2.waterPerDay + plant3.waterPerDay)));
        System.out.println("Roczne zuzycie wody: " + (365*(plant1.waterPerDay + plant2.waterPerDay + plant3.waterPerDay)));

    }
}
