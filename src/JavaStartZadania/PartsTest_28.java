package JavaStartZadania;

public class PartsTest_28 {
    public static void main(String[] args) {
        Tire_28 tire = new Tire_28(2323, "Hankook", "WinterBolt", "WB2323", 19, 36);
        Exhaust_28 exhaust = new Exhaust_28(1313, "KIKE", "LoudBastard", "LB1313", false);
        System.out.println(tire.getNumber() + " " + tire.getManufacturer() + " " + tire.getModel());
        System.out.println(exhaust.getModel() + " " + exhaust.getManufacturer());

    }
}
