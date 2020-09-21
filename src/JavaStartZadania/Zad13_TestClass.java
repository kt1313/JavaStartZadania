package JavaStartZadania;

import jdk.jfr.Timespan;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Zad13_TestClass {
    public static void main(String[] args) {

        Zad13_Song song1 = new Zad13_Song("Tududu", 4521);
        Zad13_Song song2 = new Zad13_Song("Lalala", 1998);
        int playListLength = Zad13_Playlist.addSongsTimes(song1, song2);
        int hh = Zad13_Playlist.secsToHours(playListLength);
        int mm = Zad13_Playlist.secsToMins(playListLength);
        int ss = Zad13_Playlist.secsLeft(playListLength);

        System.out.printf("\nŁączna długość utworów to: %d sekund, czyli %d hrs: %d min: %d sec.\n",playListLength,hh,mm,ss);
    }

}
