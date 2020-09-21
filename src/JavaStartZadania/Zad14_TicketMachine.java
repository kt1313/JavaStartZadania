package JavaStartZadania;

import java.time.LocalTime;

public class Zad14_TicketMachine {

    public static void buyTicket(Zad14_Passenger passenger, long validity) {

        LocalTime now = LocalTime.now();
        Zad14_Ticket ticket=createTicket(now, validity);
        passenger.setTicket(ticket);

    }

    private static Zad14_Ticket createTicket(LocalTime now, long validity) {
        Zad14_Ticket ticket=null;
        return ticket;
    }

}
