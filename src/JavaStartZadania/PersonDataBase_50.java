package JavaStartZadania;

import java.util.Arrays;

public class PersonDataBase_50 {
    private int arraySize = 1;
    private int personsNumber = 0;
    private int realSize = 0;

    public Person_50[] persons = new Person_50[arraySize];


    public void addPerson(Person_50 person) {
        if (person == null)
            throw new NullPointerException("person nie może być null");
        if (personsNumber < arraySize) {
            persons[personsNumber] = person;
            personsNumber++;

        } else {
            increaseArraySize();
            addPerson(person);
        }
    }

    void removePerson(Person_50 person) {
        if (person == null)
            throw new NullPointerException("person nie może być null");
        for (int i = 0; i < arraySize; i++) {
            if (persons[i].equals(person)) {
                persons[i] = null;
                shiftPersonsDown();
            }
        }
    }

    private void shiftPersonsDown() {
        for (int i = 0; i < (arraySize - 1); i++) {
            if (persons[i] == null) {
                persons[i] = persons[i + 1];
                persons[i + 1] = null;
            }
        }
    }

    Person_50 get(int index) {
        Person_50 person = persons[index];
        return person;
    }

    int size() {
        for (Person_50 p : persons) {
            if (p != null) {
                realSize++;
            }
        }
        System.out.println("Tablica wypełniona w " + realSize + " miejscach.");
        return realSize;
    }

    public void increaseArraySize() {
        int newSize = getArraySize() * 2;
        setArraySize(newSize);
        persons = Arrays.copyOf(persons, getArraySize());
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    @Override
    public String toString() {
        return Arrays.toString(persons);
    }
}
