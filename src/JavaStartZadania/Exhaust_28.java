package JavaStartZadania;

public class Exhaust_28 extends Part_28{
    private boolean euroCert;

    public Exhaust_28(int number, String Manufacturer, String Model, String sn,boolean euroCert){
        setNumber(number);
        setManufacturer(Manufacturer);
        setModel(Model);
        setSn(sn);
        this.euroCert = euroCert;

    }
    public boolean isEuroCert() {
        return euroCert;
    }

    public void setEuroCert(boolean euroCert) {
        this.euroCert = euroCert;
    }
}
