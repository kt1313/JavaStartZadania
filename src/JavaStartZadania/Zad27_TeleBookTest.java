package JavaStartZadania;

import java.io.IOException;

public class Zad27_TeleBookTest {
    public static void main(String[] args) throws IOException {
        Zad27_TeleBookController teleBookController = new Zad27_TeleBookController();
        Zad27_FileReader.createOrFindFile();
        teleBookController.addContactFromFile(Zad27_FileReader.openFileAndSendData());
        teleBookController.mainLoop();
    }
}
