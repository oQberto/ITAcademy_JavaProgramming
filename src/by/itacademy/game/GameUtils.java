package by.itacademy.game;

import java.util.Random;
import java.util.Scanner;

import static by.itacademy.game.Messages.*;

public class GameUtils {
    private static final Random RANDOM = new Random();
    private static final Scanner IN = new Scanner(System.in);

    private GameUtils(){}

    public static boolean validateUserNum(int userNumber) {
        return userNumber >= 1 && userNumber <= 100;
    }

    public static int readUserInput() {
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

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static int generateNum(int from, int to) {
        return RANDOM.nextInt(from, to + 1);
    }
}
