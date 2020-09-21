package JavaStartZadania;

public class Zad15_MainGameApp {
    public static void mainLoop() {

        Zad15_Hangman hangman = new Zad15_Hangman(Zad15_Hangman.createWord());

        do {

            char letter = Zad15_Interface.getLetter(hangman);
            boolean letterUsed = Zad15_Interface.checkIfLetterUsed(letter, hangman.getCodeWord());
            if (!letterUsed) {
                int mistakes = hangman.getMistakes();
                mistakes++;
                hangman.setMistakes(mistakes);
            }

            hangman.setCodeWordShown(hangman.getCodeWord(), letter, hangman.getUsedLetters());
            System.out.println(hangman.getMistakes());
        }
        while (!hangman.playerLost(hangman.getMistakes()) && !hangman.playerWon(hangman.getCodeWord(), hangman.getCodeWordShown()));
        if (hangman.playerLost(hangman.getMistakes())) {
            System.out.println("Ciao! Masz w plecy :((");
        } else if (hangman.playerWon(hangman.getCodeWord(), hangman.getCodeWord())) {
            System.out.println();
            System.out.println("BRAWO!!! Zuch z Ciebie!");
        }
        Zad15_Interface.menu(hangman);
    }
}
