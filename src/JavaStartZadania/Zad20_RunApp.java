package JavaStartZadania;

import java.util.*;

public class Zad20_RunApp {
    public static void main(String[] args) {

        Zad20_Player[] players = new Zad20_Player[5];
        players[0] = new Zad20_Player("Guilermo", 331);
        players[1] = new Zad20_Player("Domingo", 1322);
        players[2] = new Zad20_Player("Bo", 430);
        players[3] = new Zad20_Player("Daniel", 123);
        players[4] = new Zad20_Player("Mickey", 1323);

        Zad20_PlayersResults.byNickname(players);
        Zad20_PlayersResults.byPoints(players);

        Arrays.sort(players);
        System.out.println("Posortowane po punktach (malejąco)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, (p1, p2) -> Integer.compare(p2.getPoints(), p1.getPoints()));
        System.out.println("Posortowane po punktach (rosnąco)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing(Zad20_Player::getNickname));
        System.out.println("Posortowane alfabetycznie (rosnąco)");
        System.out.println(Arrays.toString(players));

        Arrays.sort(players, Comparator.comparing(Zad20_Player::getNickname).reversed());
        System.out.println("Posortowane alfabetycznie (malejąco)");
        System.out.println(Arrays.toString(players));
    }
}
