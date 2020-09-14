package JavaStartZadania;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateTime_71 {
    static int day1, day2;
    static int month1, month2;
    static int year1, year2;
    static LocalDate latestDate;
    static Period timeDifference;

    public static void main(String[] args) {

        LocalDate date1 = readDate();
        LocalDate date2 = readDate();
        System.out.println("Późniejsza data to: " + latestDate(date1, date2));
        timeDifference(date1,date2);
    }



    private static void timeDifference(LocalDate date1, LocalDate date2) {
        Period difference = Period.between(date1, date2);
        int years = Math.abs(difference.getYears());
        int months = Math.abs(difference.getMonths());
        int days = Math.abs(difference.getDays());
        System.out.print("Różnica pomiędzy datami wynosi: " + years + " lat, "
        + months+ " miesięcy i "+ days +" dni.");
    }

    private static LocalDate latestDate(LocalDate date1, LocalDate date2) {
        LocalDate latestDate = date1.isAfter(date2) ? date1 : date2;
        return latestDate;
    }

    private static LocalDate readDate() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj dzień: ");
        day1 = sc.nextInt();
        System.out.print("Podaj miesiąc: ");
        month1 = sc.nextInt();
        System.out.print("Podaj rok: ");
        year1 = sc.nextInt();
        return LocalDate.of(year1, month1, day1);

    }

}

