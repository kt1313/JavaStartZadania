package JavaStartZadania;

public class Elevator_16 {

    //private final int maxWeight = 400;
    private final int maxPersons = 4;
    private int personsInside = 0;
    private final int floorsAmount = 10;
    private int floorNr = 0;

    Person_16[] persons = new Person_16[maxPersons];


    public int personsInside() {
        return personsInside;
    }

    public void setPersonsInside(int personsInside) {
        this.personsInside = personsInside;
    }

    public int add(Person_16 person) {

        if (maxPersons > personsInside()) {
            persons[personsInside()] = person;
            setPersonsInside(++personsInside);
            System.out.println("Piętro: " + floorNr + ". Wsiadła " + personsInside() + " osoba. ");

        } else {
            System.out.println("Winda pełna!");
        }
        return personsInside();
    }


    public void start(Person_16[] persons) {
        this.persons = persons;
        for (int i = 0; i <= (floorsAmount); i++) {
            floorNr = i;
            for (int j = 0; j < personsInside(); j++) {
                int k = persons[j].getFloorAim();
                if (k == i) {
                    substract();
                }
            }
            System.out.println("Piętro: " + floorNr + ". Ruszamy! Ludzi w windzie: " + personsInside() + ".");
        }
    }

    public void substract() {
        personsInside--;
        System.out.println("Piętro: " + floorNr + ". Wysiadła 1 osoba. ");
    }
}