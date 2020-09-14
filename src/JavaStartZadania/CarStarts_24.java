package JavaStartZadania;

class CarStart_24 {
    public static void main(String[] args) {
        Car_24 car = new Car_24(10, true, true, false, false);
        System.out.println("Uruchomienie samochodu z paliwem, sprawnym silnikiem i wszystkim zamkniętym");
        car.start();
        System.out.println(car.status());
        System.out.println();

        System.out.println("Otwarcie drzwi");
        car.setDoorsOpen(true);
        System.out.println(car.status());
        System.out.println();

        System.out.println("Kończy się paliwo");
        car.setFuel(0);
        System.out.println(car.status());
    }
}
