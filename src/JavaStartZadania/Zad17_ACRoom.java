package JavaStartZadania;

import java.util.Random;

public class Zad17_ACRoom {
    private int roomSpace;
    private Zad17_ACConditioner conditioner;
    private boolean acOn;
    double actualTemperature;
    double reqTemperature;
    int roomNr;


    public Zad17_ACRoom(int roomSpace, Zad17_ACConditioner conditioner,  double actualTemperature, double reqTemperature) {
        this.roomSpace = roomSpace;
        this.conditioner = conditioner;
       // this.acOn = acOn;
        this.actualTemperature = actualTemperature;
        this.reqTemperature = reqTemperature;
    }

    public double getReqTemperature() {
        return reqTemperature;
    }

    public void setReqTemperature(int reqTemperature) {
        this.reqTemperature = reqTemperature;
    }

    public Zad17_ACConditioner getConditioner() {
        return conditioner;
    }

    public static Zad17_ACConditioner findConditioner() {
        Random random = new Random();
        int rand = random.nextInt();
        System.out.println(rand);
        if (rand < 0.1) {
            return new Zad17_BasicAirConditioner();
        } else {
            return new Zad17_ProAirConditioner();
        }
    }

    public void setConditioner(Zad17_ACConditioner conditioner) {
        this.conditioner = conditioner;
    }

    public double getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(double actualTemperature) {
        this.actualTemperature = actualTemperature;
    }

    public int getRoomSpace() {
        return roomSpace;
    }

    public void setRoomSpace(int roomSpace) {
        this.roomSpace = roomSpace;
    }

    public boolean isAcOn() {
        return acOn;
    }

    public void setAcOn(boolean acOn) {
        this.acOn = acOn;
    }

    public void setReqTemperature(double reqTemperature) {
        this.reqTemperature = reqTemperature;
    }

    public int getRoomNr() {
        return roomNr;
    }

    public void setRoomNr(int roomNr) {
        this.roomNr = roomNr;
    }

    public boolean isTemperatureSetUp() {
        if (getReqTemperature() > getActualTemperature()) {
            return true;
        } else {
            return false;
        }
    }
    public  void printOut(Zad17_ACRoom room){
        //System.out.println();
        //for (int i=0;i< rooms.length;i++) {
            System.out.printf("Room %d, temperatura zadana: %.2f, temperatura aktualna: %.2f, klimatyzator: %s.\n", room.getRoomNr(),
                    room.getReqTemperature(),
                    +room.getActualTemperature(),room.getConditioner());
        }

    public double coolRoom(){
        if(!isTemperatureSetUp()){
        return getConditioner().cooldownRoom(getActualTemperature(),getRoomSpace());}
        return getActualTemperature();
    }
}
