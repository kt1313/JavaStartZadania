package JavaStartZadania;

public class GroceriesFruit_30 {
    private int weight;
    private String type;

    public GroceriesFruit_30(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String getInfo(){
        return "typ: " + getType() + ", waga: " + getWeight();
    }
}
