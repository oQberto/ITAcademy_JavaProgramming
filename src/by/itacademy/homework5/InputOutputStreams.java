package by.itacademy.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputStreams {
    private static final String STOP = "stop";
    private static final String INVALID_INPUT = "Invalid input, try again.";
    private static final BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    private String userInput;

    @SuppressWarnings("InfiniteLoopStatement")
    public void infinityInput() throws IOException {
        while (true) {
            userInput = BF.readLine();
            System.out.println(userInput);
        }
    }

    public void calculateAverageBeforeStopInput() throws IOException {
        int count = 1;
        double average = 0.0;

        while (true) {
            userInput = BF.readLine();
            if (userInput.equalsIgnoreCase(STOP)) {
                System.out.println(average);
                break;
            }
            try {
                average += (double) Integer.parseInt(userInput) / count;
            } catch (NumberFormatException e) {
                System.out.println(INVALID_INPUT);
            }
        }
    }
}
