package JavaStartZadania;

import java.util.Queue;

public class Hospital_20 {
    private int actualPatients = 0;
    final int maxPatients = 10;
    public Patient_20[] patientQueue = new Patient_20[10];

    public void addPatient(Patient_20 patient) {
        if(actualPatients < maxPatients){
            patientQueue[actualPatients] = patient;
            actualPatients++;
        }else{
            System.out.println("Przykro mi, kolejka zamknięta.");
        }

    }
    public void printQueue() {
        System.out.println("Pacjenci ustawieni w kolejce: ");
        for (int i = 0; i < actualPatients; i++) {
            System.out.println(patientQueue[i].getFirstName() + " " + patientQueue[i].getLastName() +
                    " " + patientQueue[i].getNrPESEL());
        }
    }


}
