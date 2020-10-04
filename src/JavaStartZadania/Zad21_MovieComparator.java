package JavaStartZadania;

import java.util.Comparator;

public enum Zad21_MovieComparator {
    TITLE("Title", Comparator.comparing(Zad21_Movie::getTitle)),
    RATING("Rating", Comparator.comparing(Zad21_Movie::getRating).reversed()),
    YEAR("Year", Comparator.comparing(Zad21_Movie::getYear).reversed());

    private final String criteria;
    private final Comparator<Zad21_Movie> comparator;

    Zad21_MovieComparator(String criteria, Comparator<Zad21_Movie> comparator) {
        this.criteria = criteria;
        this.comparator = comparator;
    }

    public String getCriteria() {
        return criteria;
    }

    public Comparator<Zad21_Movie> getComparator() {
        return comparator;
    }

    public static Zad21_MovieComparator convert(String criteria) {
        Zad21_MovieComparator[] values = Zad21_MovieComparator.values();
        for (Zad21_MovieComparator value : values) {
            if(value.getCriteria().toLowerCase().equals(criteria.toLowerCase()))
                return value;
        }
        throw new IllegalArgumentException("Nieprawidłowe kryterium sortowania " + criteria);
    }
}
