package JavaStartZadania;

import java.util.*;

public class Iterator_Map_60 {
    public static void main(String[] args) {
        Map<String, Iterator_Person_60> persons = new TreeMap<>();
        persons.put("Da Silva", new Iterator_Person_60("Marcus", "Da Silva", 37));
        persons.put("Nalepa", new Iterator_Person_60("Michał", "Nalepa", 22));
        persons.put("Danch", new Iterator_Person_60("Adam", "Danch", 32));
        persons.put("Jankowski", new Iterator_Person_60("Maciej", "Jankowski", 35));

        Collection<Iterator_Person_60> values = persons.values();
        Iterator<Iterator_Person_60> personsIterator = values.iterator();
        while (personsIterator.hasNext()) {
            System.out.println(personsIterator.next());
        }
    }
}
