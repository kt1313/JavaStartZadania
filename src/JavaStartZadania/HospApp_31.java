package JavaStartZadania;

class HospApp_31 {
    public static void main(String[] args) {

        Hospital_31 hospital = new Hospital_31();

        hospital.add(new HospDoctor_31("Maciek", "Prefeska", 7500, 1300));
        hospital.add(new HospNurse_31("Ania", "Dobroszewska", 2200, 6));
        hospital.add(new HospNurse_31("Marta", "Danielska", 2100, 3));

        System.out.println("Osoby pracujące w szpitalu: ");
        System.out.println(hospital.getInfo());
    }
}
