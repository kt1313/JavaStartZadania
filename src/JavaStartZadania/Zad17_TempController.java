package JavaStartZadania;

public class Zad17_TempController {
    Zad17_ACRoom[] rooms;

    public Zad17_TempController(Zad17_ACRoom[] rooms) {
        this.rooms = rooms;
    }

    public static boolean allRoomsCooled(Zad17_ACRoom[] rooms) {
        for (Zad17_ACRoom r : rooms
        ) {
            if (!r.isTemperatureSetUp()) {
                return false;
            }
        }
        return true;
    }

    public static void controlLoop(Zad17_ACRoom[] rooms) throws InterruptedException {
        while (!allRoomsCooled(rooms)) {
            for(int i=0;i< rooms.length;i++) {
                rooms[i].setRoomNr(i);
                rooms[i].printOut(rooms[i]);
                rooms[i].setActualTemperature(rooms[i].coolRoom());
            }
            waitSecond();
            System.out.println();

        }
        System.out.println("Schłodzono wszystkie pomieszczenia.");
    }


    public static void waitSecond() throws InterruptedException {
        Thread.sleep(1000);
    }
}
