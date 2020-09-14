package pl.javastart.model;

public class Ticket {

    private int id;
    private Movie movie;
    private Person person;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ticket(int id, Movie movie, Person person) {
        this.id = id;
        this.movie = movie;
        this.person = person;
    }
}
