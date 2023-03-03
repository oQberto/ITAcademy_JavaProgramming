package by.itacademy.game;

import java.util.Random;
import java.util.Scanner;
import static by.itacademy.game.Messages.*;

public class Game {
    private static final Random RANDOM = new Random();
    private static final Scanner IN = new Scanner(System.in);
    private int secret;
    private int turnsAmount = 0;

    public void start() {
        generateNum();
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
            increaseTurnsAmount();
            if (checkNumber(number)) {
                printMessage(String.format(WIN, turnsAmount));
                break;
            }
        }
    }

    private void increaseTurnsAmount() {
        turnsAmount++;
    }

    private boolean validateUserNum(int userNumber) {
        return userNumber >= 1 && userNumber <= 100;
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

    private int readUserInput() {
        while (true) {
            if (IN.hasNext()) {
                if (IN.hasNextInt()) {
                    return IN.nextInt();
                }
            }
            IN.next();
            printMessage(NOT_NUMBER_MESSAGE);
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void generateNum() {
        secret = RANDOM.nextInt(100) + 1;
    }
}
