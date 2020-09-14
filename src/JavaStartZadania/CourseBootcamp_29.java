package JavaStartZadania;

public class CourseBootcamp_29 extends CourseOnline_29 {

    private String coachName;
    private int coachHrs;

    public CourseBootcamp_29(String id, int price, String name, String descrptn, String coachName, int coachHrs) {
        setId(id);
        setPrice(price);
        setName(name);
        setDescrptn(descrptn);
        this.coachName = coachName;
        this.coachHrs = coachHrs;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public int getCoachHrs() {
        return coachHrs;
    }

    public void setCoachHrs(int coachHrs) {
        this.coachHrs = coachHrs;
    }
}
