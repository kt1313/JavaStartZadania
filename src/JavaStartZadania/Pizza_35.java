package JavaStartZadania;

import java.util.Arrays;

enum Pizza_35 {
    MARGHERITA(true, true, false, true ),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, true, true);

    private final boolean sosPomidorowy;
    private final boolean ser;
    private final boolean pieczarki;
    private final boolean szynka;

    Pizza_35(boolean sosPomidorowy, boolean ser, boolean pieczarki, boolean szynka){
        this.sosPomidorowy = sosPomidorowy;
        this.ser =ser;
        this.pieczarki = pieczarki;
        this.szynka = szynka;
    }
    private static final int INGREDIENTS_NUMBER = 4;

    @Override
    public String toString() {
        String result = name() + " (";
        if (sosPomidorowy) {
            result += "sos pomidorowy";
        }
        if (ser) {
            result += ", ser";
        }
        if (pieczarki) {
            result += ", pieczarki";
        }
        if (szynka) {
            result += ", szynka";
        }
        result += ")";
        return result;
    }
}
