package JavaStartZadania;

import java.util.Scanner;

public enum OrderStatus_36 {
    NEW("Zamówione, nie opłacone."),
    PAID(" Opłacone."),
    SHIPPED("Wysłane."),
    DELIVERED("Dostarczone do klienta."),
    CANCELLED("Zamówienie odwołane.");

    public final String description;

    // Konstruktor
    private OrderStatus_36(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


}
