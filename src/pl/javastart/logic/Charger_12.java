package pl.javastart.logic;

import pl.javastart.model.Telphone_12;

public class Charger_12 {

    public void charge(Telphone_12 phone){

        phone.setChargeLevel(phone.getChargeLevel() + 1);

    }
}
