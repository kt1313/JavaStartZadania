package JavaStartZadania;

public class Zad17_BasicAirConditioner implements Zad17_ACConditioner{
private static final double COOLDOWN_SPEED=1;
    @Override
    public double cooldownRoom(double temperature, double roomSpace){
        return temperature-(COOLDOWN_SPEED/roomSpace);
    }
    @Override
    public String toString(){
        return"Basic AC";
    }
}
