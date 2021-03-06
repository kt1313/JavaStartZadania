package JavaStartZadania;

import java.util.List;
import java.util.NoSuchElementException;

enum Zad27_Options {
    ADD(0, "dodaj kontakt"), FIND(1, "szukaj kontaktu"),
    REMOVE(2, "usuń kontakt"), PRINT(3, "pokaż kontakty"),
    EXIT(4, "wyjście z programu");
    private int optionNr;
    private String description;

    Zad27_Options(int optionNr, String description) {
        this.description = description;
        this.optionNr = optionNr;
    }

    public int getOptionNr() {
        return optionNr;
    }

    public String getDescription() {
        return description;
    }

    public static Zad27_Options changeIntToOption(int optionNr) {
        if (optionNr >= (values().length) || optionNr < 0) {
            System.out.println(values().length);
            throw new NoSuchElementException("Nie istnieje taka opcja");
                     }
        Zad27_Options[] values = values();
        for (Zad27_Options opt : values
        ) {
            if (opt.getOptionNr() == optionNr) return opt;
        }
        return null;
    }
    @Override
    public String toString() {
        return optionNr + " - " + description;
    }
}
