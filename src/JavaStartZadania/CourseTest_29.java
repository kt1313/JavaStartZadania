package JavaStartZadania;

public class CourseTest_29 {

    public static void main(String[] args) {
        CourseBootcamp_29 bootcamp = new CourseBootcamp_29("BCC_123", 274,
                "Java_Bootcamp_12", " Kurs online z trenerem prowadzącym", "John Wayne", 20 );
        System.out.println(" Szczegóły kursu: " + bootcamp.getId() + " " + bootcamp.getPrice() + " "
                + bootcamp.getName() + " " + bootcamp.getDescrptn() + "  " + bootcamp.getCoachName() + " " + bootcamp.getCoachHrs() + "hrs");
    }
}
