package JavaStartZadania;

class HospNurse_31 extends HospPerson_31 {
    private int overtime;

    public HospNurse_31(String firstName, String lastName, int salary, int overtime){
        super(firstName, lastName, salary);
        this.overtime = overtime;
    }
    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public String getInfo(){
        return super.getInfo() + " overtime: " + overtime;
    }
}
