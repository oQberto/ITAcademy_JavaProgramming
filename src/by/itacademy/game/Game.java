package by.itacademy.game;

import static by.itacademy.game.GameUtils.*;
import static by.itacademy.game.Messages.*;

public class Game {
    private int secret;
    private int turnsCount = 0;

    public void start() {
        secret = generateNum(0, 100);
        printMessage(START_MESSAGE);
        game();
    }

    private void game() {
        while (true) {
            int number = readUserInput();
            if (!validateUserNum(number)) {
                printMessage(NOT_NUMBER_MESSAGE);
                continue;
            }
            turnsCount++;
            if (checkNumber(number)) {
                printMessage(String.format(WIN, turnsCount));
                break;
            }
        }
    }

    private boolean checkNumber(int userNumber) {
        if (userNumber < secret) {
            printMessage(SECRET_NUMBER_IS_MORE);
            return false;
        } else if (userNumber > secret) {
            printMessage(SECRET_NUMBER_IS_LESS);
            return false;
        }
        return true;
    }

    private void saveResult() {

    }
}
