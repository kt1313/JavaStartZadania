package JavaStartZadania;

import pl.javastart.model.Movie;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Zad21_MovieDatabase {

    public static void main(String[] args) {
        List<Zad21_Movie> moviesList = createMoviesList();
        Comparator<Zad21_Movie> sortAlgorithm = getSortAlgorithm(moviesList);
        moviesList.sort(sortAlgorithm);
        print(moviesList);
    }

    private static List<Zad21_Movie> createMoviesList() {
        List<Zad21_Movie> movies = new ArrayList<>();
        movies.add(new Zad21_Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movies.add(new Zad21_Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movies.add(new Zad21_Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movies.add(new Zad21_Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movies.add(new Zad21_Movie("Transformers", "Bay Michael", 2007, 7.3));
        movies.add(new Zad21_Movie("Alien", "Scott Ridley", 1979, 7.8));
        movies.add(new Zad21_Movie("Home Alone", "Columbus Chris", 1979, 7.1));
        return movies;
    }

    private static Comparator<Zad21_Movie> getSortAlgorithm(List<Zad21_Movie> movies) {
        System.out.println("Wybierz kryterium sortowania:");
        printSortingAlgorithms();
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        Zad21_MovieComparator algorithm = null;
        try {
            algorithm = Zad21_MovieComparator.convert(userInput);
        } catch(IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        //jezeli podany przez uzytkownika algorytm jest poprawny "?" to uzywamy
        //odpowiedni komparator, a jesli nie to rzucamy wyjatek i algorytm pozostaje nullem
        return algorithm != null ? algorithm.getComparator() : null;
    }
    private static void printSortingAlgorithms() {
        Zad21_MovieComparator[] comparators = Zad21_MovieComparator.values();
        for (Zad21_MovieComparator comparator : comparators) {
            //tu drukuje z odstepem tabulatora
            System.out.printf("\t>%s\n", comparator.getCriteria());
        }
    }

    private static void print(List<Zad21_Movie> movies) {
        System.out.println("Lista filmów:");
        movies.forEach(System.out::println);
    }

}



