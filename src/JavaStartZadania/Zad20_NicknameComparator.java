package JavaStartZadania;

import java.util.Comparator;

public class Zad20_NicknameComparator implements Comparator<Zad20_Player> {
    @Override
    public int compare(Zad20_Player p1, Zad20_Player p2) {
        return p1.getNickname().compareTo(p2.getNickname());
    }

}
