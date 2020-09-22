package JavaStartZadania;

public class Zad17_ACTest {
    public static void main(String[] args) {
        Zad17_ACRoom[] rooms= new Zad17_ACRoom[4];
        rooms[0] = new Zad17_ACRoom(35, 1, true, 28, 22);
        rooms[1] = new Zad17_ACRoom(50, 1, true, 31, 22);
        rooms[2] = new Zad17_ACRoom(90, 1, true, 22, 18);
        rooms[3] = new Zad17_ACRoom(40, 1, true, 29, 24);

        for (Zad17_ACRoom r:rooms
             ) {r.setTemperature();            
        }
    }
}
