package JavaStartZadania;

public class Tire_28 extends Part_28 {
    private int size;
    private int width;

    public Tire_28(int number, String Manufacturer, String Model, String sn, int size, int width) {
        setNumber(number);
        setManufacturer(Manufacturer);
        setModel(Model);
        setSn(sn);
        this.size = size;
        this.width = width;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
