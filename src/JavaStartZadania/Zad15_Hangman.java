package JavaStartZadania;

import java.util.Random;

public class Zad15_Hangman {

    private static final int MAX_MISTAKES = 8;

    private String codeWord;
    private String codeWordShown = "";
    private char letter;
    private char[] usedLetters;
    private int mistakes;
    private int attempts;

    public String getCodeWord() {
        return codeWord;
    }

    public void setCodeWord(String codeWord) {
        this.codeWord = codeWord;
    }

    public String getCodeWordShown() {
        return codeWordShown;
    }

    public String setCodeWordShown(String codeWord, char letter, char[] usedLetters) {
        if (codeWordShown == "") {
            for (int i = 0; i < codeWord.length(); i++) {
                if (codeWord.charAt(i) == letter) {
                    codeWordShown += letter;
                } else if (codeWord.charAt(i) == ' ') {
                    codeWordShown += ' ';
                } else {
                    codeWordShown += '*';
                }
            }
        } else {
            for (int i = 0; i < codeWord.length(); i++) {
                if (codeWord.charAt(i) == letter) {
                    char[] codeWordShownChars = codeWordShown.toCharArray();
                    codeWordShownChars[i] = letter;
                    codeWordShown = String.valueOf(codeWordShownChars);
               /* } else if (codeWord.charAt(i) == ' ') {
                    char[] codeWordShownChars = codeWordShown.toCharArray();
                    codeWordShownChars[i] = ' ';
                    codeWordShown = String.valueOf(codeWordShownChars);
                } else {
                    char[] codeWordShownChars = codeWordShown.toCharArray();
                    codeWordShownChars[i] = '*';
                    codeWordShown = String.valueOf(codeWordShownChars);  */
                }
            }
        }
        System.out.println(codeWordShown);
        return codeWordShown;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public char[] getUsedLetters() {
        return usedLetters;
    }

    public void setUsedLetters(char[] usedLetters, char letter) {
        usedLetters[attempts] = letter;
        attempts++;
    }

    public int getMistakes() {
        return mistakes;
    }

    public void setMistakes(int mistakes) {
        this.mistakes = mistakes;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public Zad15_Hangman(String codeWord) {
        this.codeWord = codeWord;
        usedLetters = new char[32];
    }

    public static String createWord() {
        Random rand = new Random();
        int randomInt = rand.nextInt(Zad15_WordsDataBase.wordsDB.length);
        String codeWord = Zad15_WordsDataBase.wordsDB[randomInt];
        return codeWord;
    }

    public static boolean playerLost(int mistakes) {
        if (mistakes >= MAX_MISTAKES) {
            return true;
        }
        return false;
    }

    public static boolean playerWon(String codeWord, String codeWordShown) {
        if (codeWord.equals(codeWordShown)) {
            return true;
        }
        return false;
    }

    public  void clearForNewGame() {
        setMistakes(0);
        java.util.Arrays.fill(usedLetters,' ');
        codeWordShown="";
        setAttempts(0);
    }
}