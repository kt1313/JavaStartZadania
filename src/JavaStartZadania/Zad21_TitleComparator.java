package JavaStartZadania;

import java.util.Comparator;

public class Zad21_TitleComparator implements Comparator<Zad21_Movie> {

    @Override
    public int compare(Zad21_Movie o1, Zad21_Movie o2) {
        return o1.getTitle().compareTo(o2.getTitle());    }
}
