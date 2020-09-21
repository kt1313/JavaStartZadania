package JavaStartZadania;

import java.time.Duration;
import java.time.LocalTime;

public class Zad14_TicketController {
    public static void main(String[] args) {

        LocalTime time1 = LocalTime.of(10, 15, 45);
        Zad14_Ticket ticket1 = new Zad14_Ticket(time1, 240);
        Zad14_Passenger passenger1 = new Zad14_Passenger("Tomek", "Romek", ticket1);

        Zad14_Ticket ticket2 = null;
        Zad14_Passenger passenger2 = new Zad14_Passenger("Daro", "Jaro", ticket2);

        LocalTime time3 = LocalTime.of(02, 11, 15);
        Zad14_Ticket ticket3 = new Zad14_Ticket(time3, 30);
        Zad14_Passenger passenger3 = new Zad14_Passenger("Jaco", "Placo", ticket3);

        Zad14_Passenger[] passengers = {passenger1, passenger2, passenger3};

        ticketController(passengers);
    }

    public static void ticketController(Zad14_Passenger[] passengers) {

        System.out.println();

        for (Zad14_Passenger pass : passengers) {

            LocalTime now = LocalTime.now();
            if (pass.getTicket() == null) {
                System.out.println(pass.toString() + " nie ma biletu! On nie ma wcale biletu!!! ");
            } else {
                boolean ticketNotValid = timeCompare(pass.getTicket().getStartTicket(), pass.getTicket().getTicketValidity());
                if(ticketNotValid){
                    System.out.println("Pasażer "+pass.toString()+" nie ma ważnego biletu.");
                }

            }
        }
    }

    public static boolean timeCompare(LocalTime startTicket, long ticketValidity) {

        LocalTime now=LocalTime.now();
        LocalTime timeOfValidity=startTicket.plusMinutes(ticketValidity)  ;
        boolean notvalid=now.isAfter(timeOfValidity);

        return notvalid;
    }
}



