package JavaStartZadania;

class HospDoctor_31 extends HospPerson_31{

private int extras;

public HospDoctor_31(String firstName, String lastName, int salary, int extras){
super(firstName, lastName, salary);
this.extras = extras;
}

    public int getExtras() {
        return extras;
    }

    public void setExtras(int extras) {
        this.extras = extras;
    }
    public String getInfo(){
    return super.getInfo() + "extras: " + extras;
    }

}
