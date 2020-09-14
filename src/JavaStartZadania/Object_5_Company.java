package JavaStartZadania;

public class Object_5_Company {
    public static void main(String[] args) {
        Object_5_Employee employee1 = new Object_5_Employee();
        Object_5_Employee employee2 = new Object_5_Employee();
        Object_5_Employee employee3 = new Object_5_Employee();

        employee1.imie = "Ed";
        employee1.nazwisko = "Trump";
        employee1.rokUrodzenia = 1970;
        employee1.stazPracy = 23;

        employee2.imie = "Barr";
        employee2.nazwisko = "Obama";
        employee2.rokUrodzenia = 1971;
        employee2.stazPracy = 21;

        employee3.imie = "Ron";
        employee3.nazwisko = "Reagan";
        employee3.rokUrodzenia = 1956;
        employee3.stazPracy = 47;

        System.out.println("Pracownik 1: " + employee1.imie + " " + employee1.nazwisko + ", " + employee1.rokUrodzenia + ", " + employee1.stazPracy);
        System.out.println("Pracownik 2: " + employee2.imie + " " + employee2.nazwisko + ", " + employee2.rokUrodzenia + ", " + employee2.stazPracy);
        System.out.println("Pracownik 3: " + employee3.imie + " " + employee3.nazwisko + ", " + employee3.rokUrodzenia + ", " + employee3.stazPracy);

    }
}
