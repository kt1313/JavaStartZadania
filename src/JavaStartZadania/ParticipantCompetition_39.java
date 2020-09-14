package JavaStartZadania;

public class ParticipantCompetition_39 {
    private String name;
    private Participant_39[] participants;
    private int ageLimit;
    private int size;
    private boolean sameId = false;

    public ParticipantCompetition_39(String name, int maxParticipants, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
        this.participants = new Participant_39[maxParticipants];
    }

    boolean checkId(String id) {
        sameId =false;
        for (int i = 0; i < participants.length; i++) {
            if (participants[i] == null) {
                i++;
            } else if (participants[i].getDocumentId().equals(id)) {
                sameId = true;
            }
    }
        return sameId;
}

    void addParticipant(Participant_39 participant) throws ParticipantAgeViolationException_39, ParticipantDuplicateException_39, ParticipantMaxCompetitorsException_39 {
        if (participant.getAge() < ageLimit)
            throw new ParticipantAgeViolationException_39("Masz za mało lat. Przyjdź z mamą.");
        else if (size > participants.length)
            throw new ParticipantMaxCompetitorsException_39("Lista zamknięta. Zapraszamy manana...");
        else if (checkId(participant.getDocumentId()))
            throw new ParticipantDuplicateException_39("Haloo! Już jesteś zapisany, ogarnij się.");
        else
            participants[size] = participant;
        size++;
    }

    boolean hasFreeSpots() {
        return size < participants.length;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Zawody ")
                .append(name)
                .append("\n")
                .append("Liczba uczestników: ").append(size);
        for (int i = 0; i < size; i++) {
            builder.append("\n");
            builder.append(" > ");
            builder.append(participants[i].toString());
        }
        return builder.toString();
    }
}
