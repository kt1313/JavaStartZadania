package JavaStartZadania;

import java.time.LocalTime;

public class Zad14_Ticket {

    private LocalTime startTicket;
    private long ticketValidity;

    public Zad14_Ticket(LocalTime startTicket, long ticketValidity){
        this.startTicket=startTicket;
        this.ticketValidity=ticketValidity;
    }

    public LocalTime getStartTicket() {
        return startTicket;
    }

    public void setStartTicket(LocalTime startTicket) {
        this.startTicket = startTicket;
    }

    public long getTicketValidity() {
        return ticketValidity;
    }

    public void setTicketValidity(long ticketValidity) {
        this.ticketValidity = ticketValidity;
    }
}
