package JavaStartZadania;

import java.util.Scanner;

public class TemperatureControl_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj żądaną temperaturę: ");
        double reqTemp = scanner.nextInt();
        System.out.println("Podaj aktualna temperaturę: ");
        double actTemp = scanner.nextInt();
        System.out.println("actTemp= " + actTemp);
        System.out.println("reqTemp= " + reqTemp);

        while (actTemp != reqTemp)
        {
            if(actTemp < reqTemp){
                actTemp = actTemp + 0.5;
            }else{
                actTemp = actTemp - 0.5;
            }
            System.out.println("Aktualna temperatura wynosi: " + actTemp);
        }
        System.out.println("Osiagnięto docelową temperaturę: " + actTemp);
    }
}

