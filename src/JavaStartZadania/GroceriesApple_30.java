package JavaStartZadania;

public class GroceriesApple_30 extends GroceriesFruit_30 {

    public static final String TYPE = "jabłkowate";
    private String kind;

    public GroceriesApple_30(int weight, String kind) {
        super(TYPE, weight);
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
    @Override
    String getInfo(){
        return super.getInfo() + ", odmiana: " + kind;
    }

}
