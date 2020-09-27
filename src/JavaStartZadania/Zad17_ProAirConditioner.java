package JavaStartZadania;

public class Zad17_ProAirConditioner implements Zad17_ACConditioner{

    private static final double COOLDOWN_SPEED=20;
    @Override
    public double cooldownRoom(double temperature, double roomSpace){
        double tempCooled=temperature-(COOLDOWN_SPEED/roomSpace);
        return tempCooled;
    }
    @Override
    public String toString(){
        return"Pro AC";
    }
}
