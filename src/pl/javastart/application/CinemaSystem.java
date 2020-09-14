package pl.javastart.application;

import pl.javastart.model.Movie;
import pl.javastart.model.Person;
import pl.javastart.model.Ticket;

public class CinemaSystem {

    public static void main(String[] args) {

        Movie movie1 = new Movie("Omen", "horror", 120, 16, 72, 72);
        Movie movie2 = new Movie("Va Banque", "komedia", 95, 12, 48, 48);

        Person person1 = new Person("Jan", "Kowalski", 17);
        Person person2 = new Person("Anna", "Zalewska", 18);

        Ticket ticket = null;

        int ticketCounter = 0;

        if (movie1.getFreeSeats()==0){
            System.out.println("Sorry, brak miejsc");
        }else if(movie1.getAgeRequired()>person1.getAge()){
            System.out.println("Sorry, przyjdź z mamą.");
            }else {
            ticketCounter = ticketCounter + 1;
            ticket = new Ticket(ticketCounter, movie1, person1);
            ticket.setId(ticketCounter);
            movie1.setFreeSeats(movie1.getFreeSeats()-1);
            System.out.println(" Bilet sprzedany! ID biletu: " + ticket.getId() + " \nFilm: "
                    + movie1.getMovieTitle() + "\nNabywca: " + person1.PersonData());

            System.out.println("Zostało " + movie1.setFreeSeats(movie1.getMaxSeats() - ticketCounter) + " wolnych miejsc.");
// tutaj powinno byc to samo co wyżej ale dla Person2
        }
    }
}
