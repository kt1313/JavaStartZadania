package JavaStartZadania;

public class Zad17_BasicAirConditioner implements Zad17_ACConditioner{
private static final double COOLDOWN_SPEED=10;
    @Override
    public double cooldownRoom(double temperature, double roomSpace){
        double tempCooled=temperature-(COOLDOWN_SPEED/roomSpace);
        return tempCooled;
    }
    @Override
    public String toString(){
        return"Basic AC";
    }
}
