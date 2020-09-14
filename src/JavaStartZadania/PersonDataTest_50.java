package JavaStartZadania;

public class PersonDataTest_50 {

    public static void main(String[] args) {
        PersonDataBase_50 database = new PersonDataBase_50();
        database.addPerson(new Person_50("Jan", "Kowalski", "12345"));
        database.addPerson(new Person_50("Ania", "Zalewska", "234567"));
        database.addPerson(new Person_50("Karol", "Piotrowski", "345678"));
        database.addPerson(new Person_50("Patryk", "Bielecki", "45678"));
        Person_50 person = database.get(1);
        System.out.println(person);
        System.out.println(database);
        database.removePerson(new Person_50("Patryk", "Bielecki", "45678"));
        System.out.println(database);
        database.size();
    }
}

