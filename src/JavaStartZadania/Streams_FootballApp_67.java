package JavaStartZadania;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams_FootballApp_67 {

    public static void main(String[] args) {
        //#1
        System.out.println(" ");
        System.out.println("Turniej:");
        Stream<Streams_FootballResults_67> games = createStream();
        printSortedResults(games);
        //#2
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj drużynę: ");
        String team = sc.nextLine();
        games = createStream();
        System.out.println(findTeam(games, team));
        //#3
        System.out.println(" ");
        System.out.println("Ilość zespołów:");
        games = createStream();
        System.out.println(countTeams(games));
        //#4
        System.out.println();
        System.out.println("Suma wszystkich goli:");
        games = createStream();
        System.out.println(countGoals(games));
    }

    private static Stream<Streams_FootballResults_67> createStream() {
        Stream<Streams_FootballResults_67> games;
        games = Stream.of(
                new Streams_FootballResults_67("England", "Polska", 1, 3),
                new Streams_FootballResults_67("Kamerun", "England", 1, 1),
                new Streams_FootballResults_67("Polska", "Meksyk", 3, 1),
                new Streams_FootballResults_67("Argentina", "England", 3, 0),
                new Streams_FootballResults_67("Włochy", "Kamerun", 2, 2),
                new Streams_FootballResults_67("Włochy", "Argentina", 0, 2),
                new Streams_FootballResults_67("Polska", "Kamerun", 8, 8));
        return games;
    }

        private static void printSortedResults (Stream < Streams_FootballResults_67 > games) {

            games.sorted(Comparator.comparing(Streams_FootballResults_67::result))
            .forEach(System.out::println);
        }

        private static List<Streams_FootballResults_67> findTeam (Stream < Streams_FootballResults_67 > games, String
        team){
            return games.filter(n -> n.findTeam(team))
                    .collect(Collectors.toList());
        }
        private static long countTeams (Stream < Streams_FootballResults_67 > games) {
            return games.map(Streams_FootballResults_67::teamsNames)
                    .flatMap(Arrays::stream)
                    .distinct()
                    .count();
        }
        private static int countGoals(Stream < Streams_FootballResults_67 > games){
        return games.mapToInt(Streams_FootballResults_67::countGoals)
                .sum();
        }
    }
