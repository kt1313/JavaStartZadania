package JavaStartZadania;

import java.util.Objects;

public class Zad21_Movie implements Comparable<Zad21_Movie> {
    private String title;
    private String director;
    private int year;
    private double rating;

    public Zad21_Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zad21_Movie that = (Zad21_Movie) o;
        return year == that.year &&
                Double.compare(that.rating, rating) == 0 &&
                Objects.equals(title, that.title) &&
                Objects.equals(director, that.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, director, year, rating);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Zad21_Movie m) {
        return title.compareTo(m.title);
    }


}
