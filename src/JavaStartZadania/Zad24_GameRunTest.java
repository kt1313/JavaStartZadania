package JavaStartZadania;

import java.util.List;

public class Zad24_GameRunTest {
    public static void main(String[] args) throws Zad24_NotEnoughMoneyException, Zad24_NoSuchGameException {

        List<Zad24_Game> gamesList = Zad24_GameMachine.gamesListCreator();
        String gameName = Zad24_GameController.readUserChoice();
        int payment = Zad24_GameController.userPayment();
        Zad24_Game game = Zad24_GameMachine.lookForGame(gameName);
        if (game != null) Zad24_GameController.checkPayment(game, payment);
        if (game != null && ((payment - game.getPrice()) > 0)) {
            Zad24_GameController.sellTheGame(gameName);
        }
    }
}