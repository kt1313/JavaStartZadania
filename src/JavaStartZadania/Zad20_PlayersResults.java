package JavaStartZadania;

import java.util.*;

public class Zad20_PlayersResults {


    public static void byNickname(Zad20_Player[] listFirst) {
        Arrays.parallelSort(listFirst, new Zad20_NicknameComparator());
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

//    TreeMap<String, Zad20_Player> listByNickname=new TreeMap<>();
//    TreeMap<Integer, Zad20_Player> listByPoints=new TreeMap<>();

//    class NotebookStore {
//        public static void main(String[] args) {
//            Map<String, Notebook> notebooks = new HashMap<>();
//            notebooks.put("B590", new Notebook("Lenovo", "B590"));
//            notebooks.put("Inspiron0211A", new Notebook("Dell", "Inspiron0211A"));
//            notebooks.put("G2A33EA", new Notebook("HP", "G2A33EA"));
//            notebooks.put("XPS0091V", new Notebook("Dell", "XPS0091V"));
//
//            // wyświetlamy zbiór kluczy
//            System.out.println("Modele laptopów: ");
//            Set<String> keys = notebooks.keySet();
//            for (String key : keys) {
//                System.out.println(key);
//            }
//
//            // wyświetlamy informację o laptopach na podstawie kluczy
//            String key = "G2A33EA";
//            System.out.println("Znaleziono laptop o kodzie G2A33EA: ");
//            Notebook foundNotebook = notebooks.get(key);
//            System.out.println(foundNotebook);
//
//            // usuwamy obiekt na podstawie klucza
//            notebooks.remove("XPS0091V");
//
//            System.out.println("Ilość produktów w sklepie: " + notebooks.size());
//        }
}


