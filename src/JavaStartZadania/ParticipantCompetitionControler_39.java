package JavaStartZadania;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class ParticipantCompetitionControler_39 {

    private int age;
    private int ageLimit;
    private int maxParticipants;
    private Scanner scanner = new Scanner(System.in);

    void run() throws ParticipantAgeViolationException_39, ParticipantDuplicateException_39, ParticipantMaxCompetitorsException_39 {
        ParticipantCompetition_39 competition = createCompetition();
        fillParticipantsInfo(competition);
        printCompetition(competition);
    }

    private ParticipantCompetition_39 createCompetition() {
        System.out.println("Podaj nazwę zawodów:");
        String competitionName = scanner.nextLine();
        do {

            System.out.println("Podaj maksymalną liczbę uczestników:");
            maxParticipants = scanner.nextInt();
        } while (maxParticipants < 1);
        do {
            System.out.println("Podaj ograniczenie wiekowe:");

            ageLimit = scanner.nextInt();
            scanner.nextLine();
        } while (ageLimit < 0);
        return new ParticipantCompetition_39(competitionName, maxParticipants, ageLimit);
    }

    private void fillParticipantsInfo(ParticipantCompetition_39 competition) throws ParticipantAgeViolationException_39, ParticipantDuplicateException_39, ParticipantMaxCompetitorsException_39 {
        while (competition.hasFreeSpots()) {
            System.out.println("Dodaj nowego uczestnika");
            Participant_39 participant = createParticipant();
            competition.addParticipant(participant);
        }
    }

    private Participant_39 createParticipant() {
        System.out.println("Podaj imię:");
        String firstName = scanner.nextLine();
        System.out.println("Podaj nazwisko:");
        String lastName = scanner.nextLine();
        System.out.println("Podaj id (np. pesel):");
        String id = scanner.nextLine();
        do {
            System.out.println("Podaj wiek:");
            age = scanner.nextInt();
            scanner.nextLine();
        }while ((age<0) || (age != (int)age));
        return new Participant_39(firstName, lastName, id, age);

    }

    private void printCompetition(ParticipantCompetition_39 competition) {
        System.out.println(competition.toString());
    }
}
