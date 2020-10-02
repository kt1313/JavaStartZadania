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

    public static int chooseSort() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz sposób sortowania:");
        System.out.println("1 - po nickname");
        System.out.println("2 - po punktach");
        int choice = sc.nextInt();
        sc.close();
        if (choice == 1) return 1;
        else if (choice == 2) return 2;
        else {
            System.out.println("Wybierz właściwie!");
            return 0;
        }
    }
}


