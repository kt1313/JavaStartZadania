package JavaStartZadania;

import java.util.Random;

public class Zad17_ACRoom {
    private int roomSpace;
    private Zad17_ACConditioner conditioner;
    private boolean acOn;
    int actualTemperature;
    int reqTemperature;


    public Zad17_ACRoom(int roomSpace, Zad17_ACConditioner conditioner, boolean acOn, int actualTemperature, int reqTemperature) {
        this.roomSpace = roomSpace;
        this.conditioner = conditioner;
        this.acOn = acOn;
        this.actualTemperature = actualTemperature;
        this.reqTemperature=reqTemperature;
    }

    public int getReqTemperature() {
        return reqTemperature;
    }

    public void setReqTemperature(int reqTemperature) {
        this.reqTemperature = reqTemperature;
    }

    public Zad17_ACConditioner getConditioner() {
        Zad17_ACConditioner conditioner=null;
        Random random=new Random();
        int rand= random.nextInt();
        System.out.println(rand);
        if(rand<0.1){return new Zad17_BasicAirConditioner();}
        else{return  new Zad17_ProAirConditioner();}
    }

    public void setConditioner(Zad17_ACConditioner conditioner) {
        this.conditioner = conditioner;
    }

    public int getActualTemperature() {
        return actualTemperature;
    }

    public void setActualTemperature(int actualTemperature) {
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

}
