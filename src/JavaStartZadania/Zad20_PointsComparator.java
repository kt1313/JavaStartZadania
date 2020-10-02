package JavaStartZadania;

import java.util.Comparator;

public class Zad20_PointsComparator implements Comparator<Zad20_Player> {
    @Override
    public int compare(Zad20_Player p1, Zad20_Player p2) {
        return Integer.compare(p1.getPoints(),p2.getPoints());
    }
}
