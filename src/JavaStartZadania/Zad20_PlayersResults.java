package JavaStartZadania;

import java.util.*;

public class Zad20_PlayersResults {


    public static void byNickname(Zad20_Player[] listFirst) {
        Arrays.sort(listFirst, new Zad20_NicknameComparator());
        System.out.println("Sortowanie po 'nickname', (Comparator): ");
        for (Zad20_Player p : listFirst
        ) {
            System.out.print(p);
        }
        System.out.println();
    }

    public static void byPoints(Zad20_Player[] listFirst) {
        Arrays.sort(listFirst, new Zad20_PointsComparator());
        System.out.println("Sortowanie po 'points', (Comparator): ");
        for (Zad20_Player p : listFirst
        ) {
            System.out.print(p);
        }
        System.out.println();

    }

}


