package JavaStartZadania;

public class Zad13_Playlist {


    public static int addSongsTimes(Zad13_Song... song) {
        int sum = 0;
        for (Zad13_Song s : song) {
            sum += s.getTime();
        }
        return sum;
    }

    public static int secsToHours(int secs){
        int hours=0;
        hours=secs/3600;
        return hours;
    }
    public static int secsToMins(int secs){
        int mins=0;
        mins=(secs%3600)/60;
        return mins;
    }
    public static int secsLeft(int secs){
        int seconds=0;
        seconds=(secs%3600)%60;
        return seconds;
    }
}


