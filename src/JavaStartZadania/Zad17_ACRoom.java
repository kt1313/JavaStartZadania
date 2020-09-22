package JavaStartZadania;

public class Zad17_ACRoom {
    private int roomSpace;
    private int conditioner;
    private boolean acOn;
    int actualTemperature;
    int reqTemperature;


    public Zad17_ACRoom(int roomSpace, int conditioner, boolean acOn, int actualTemperature, int reqTemperature) {
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

    public int getConditioner() {
        return conditioner;
    }

    public void setConditioner(int conditioner) {
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

    public void setTemperature() {
        int actualTemp = getActualTemperature() - getConditioner() / getRoomSpace();

    }
}
