package JavaStartZadania;

import java.util.ArrayList;
import java.util.List;

public class Zad24_GameMachine {
    static List<Zad24_Game> gamesList = gamesListCreator();
    static boolean gameInStore = true;

    public static List<Zad24_Game> gamesListCreator() {
        List<Zad24_Game> gamesList = new ArrayList<>();
        gamesList.add(new Zad24_Game("Game1", 87));
        gamesList.add(new Zad24_Game("Game2", 65));
        gamesList.add(new Zad24_Game("Game3", 72));
        gamesList.add(new Zad24_Game("Game4", 99));
        gamesList.add(new Zad24_Game("Game5", 83));
        return gamesList;
    }

    public static Zad24_Game lookForGame(String gameName) {
        Zad24_Game chosenGame = null;
        for (Zad24_Game g : gamesList
        ) {
            if ((g.getName().equals(gameName))) {
                chosenGame = g;
                gameInStore=true;
                return g;
            } else {
                chosenGame = null;
                gameInStore=false;
            }
        }
        return chosenGame;
    }

}
