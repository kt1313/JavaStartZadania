package JavaStartZadania;

public class Zad17_ACTest {
    public static void main(String[] args) throws InterruptedException {
        Zad17_ACRoom[] rooms = new Zad17_ACRoom[4];
        rooms[0] = new Zad17_ACRoom(40, Zad17_ACRoom.findConditioner(),28, 22);
        rooms[1] = new Zad17_ACRoom(35, Zad17_ACRoom.findConditioner(),23, 21);
        rooms[2] = new Zad17_ACRoom(55, Zad17_ACRoom.findConditioner(),29, 23);
        rooms[3] = new Zad17_ACRoom(35, Zad17_ACRoom.findConditioner(),24, 22);

        Zad17_TempController.controlLoop(rooms);
    }
}
