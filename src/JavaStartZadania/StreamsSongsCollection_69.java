package JavaStartZadania;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsSongsCollection_69 {

    public static void main(String[] args) {

        List<StreamsSongs_69> songs = List.of(
                new StreamsSongs_69("Nothing Else Matters", 386, "Metallica", StreamsSongs_69.Genre.METAL),
                new StreamsSongs_69("No One", 248, "Alicia Keys", StreamsSongs_69.Genre.POP),
                new StreamsSongs_69("Nothing Else Matters", 386, "Metallica", StreamsSongs_69.Genre.METAL),
                new StreamsSongs_69("Believer", 216, "Imagine Dragons", StreamsSongs_69.Genre.ROCK),
                new StreamsSongs_69("Fear of The Dark", 438, "Iron Maiden", StreamsSongs_69.Genre.METAL),
                new StreamsSongs_69("Enter Sandman", 346, "Metallica", StreamsSongs_69.Genre.METAL),
                new StreamsSongs_69("The Unforgiven", 348, "Metallica", StreamsSongs_69.Genre.METAL),
                new StreamsSongs_69("Girl on Fire", 404, "Alicia Keys", StreamsSongs_69.Genre.POP));

        int totalTime = totalTime(songs, StreamsSongs_69.Genre.METAL);
        System.out.println("Całkowity czas "+ StreamsSongs_69.Genre.METAL + "'u wynosi: "+totalTime + " sekund.");

        long songsNumber = songsNumber(songs, "Metallica");
        System.out.println("Piosenek "+ "Metallica" + " jest: " + songsNumber);

        List<StreamsSongs_69> list = filterSongs(songs, StreamsSongs_69.Genre.METAL);
        list.forEach(System.out::println);
    }

    //TODO
    private static Integer totalTime(List<StreamsSongs_69> songs, StreamsSongs_69.Genre genre) {
        return songs.stream()
                .filter(n -> n.getGenre().equals(genre))
                .mapToInt(n -> n.getLength())
                .sum();
    }

    private static long songsNumber(List<StreamsSongs_69> songs, String artist) {
        return songs.stream()
                .filter(n -> n.getArtist().equals(artist))
                .count();
    }

    private static List<StreamsSongs_69> filterSongs(List<StreamsSongs_69> songs, StreamsSongs_69.Genre genreToRemove) {
        return songs.stream()
                .filter(n -> n.getGenre()!=genreToRemove)
                .distinct()
                .collect(Collectors.toList());
    }
}