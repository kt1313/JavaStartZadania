package JavaStartZadania;

public class ElevatorStarts_16 {
    public static void main(String[] args) {

        Person_16 person1 = new Person_16(89, 01, 1);
        Person_16 person2 = new Person_16(156, 02, 8);
        Person_16 person3 = new Person_16(102, 03, 1);
        Person_16 person4 = new Person_16(91, 04, 1);
        Person_16 person5 = new Person_16(78, 05, 4);


        Elevator_16 elevator1 = new Elevator_16();
        elevator1.persons = new Person_16[]{person1, person2, person3, person4, person5};
        elevator1.add(person1);
        elevator1.add(person2);
        elevator1.add(person3);
        elevator1.add(person4);
        elevator1.add(person5);


        elevator1.start(elevator1.persons);

        //elevator1.substract();


    }
}
