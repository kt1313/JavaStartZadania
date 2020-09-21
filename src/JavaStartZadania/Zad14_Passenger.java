package JavaStartZadania;

public class Zad14_Passenger {
    String name;
    String surname;
    Zad14_Ticket ticket;

    public Zad14_Passenger(String name, String surname, Zad14_Ticket ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Zad14_Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Zad14_Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
