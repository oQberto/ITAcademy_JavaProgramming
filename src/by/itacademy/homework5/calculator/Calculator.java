package by.itacademy.homework5.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Scanner IN = new Scanner(System.in);
    private double firstNum;
    private double secondNum;
    private String operation;

    public void start() {
        while (true) {
            printMessage(Message.SystemMessage.INSTRUCTION);
            String stopMessage = IN.next();

            if (stopMessage.equalsIgnoreCase(Message.SystemMessage.STOP)) {
                break;
            } else if (stopMessage.equalsIgnoreCase(Message.SystemMessage.CONTINUE)) {
                try {
                    printMessage(Message.SystemMessage.WRITE_NUMBER);
                    firstNum = IN.nextDouble();

                    printMessage(Message.SystemMessage.WRITE_OPERATION);
                    operation = IN.next();

                    printMessage(Message.SystemMessage.WRITE_NUMBER);
                    secondNum = IN.nextDouble();

                    printMessage(Message.SystemMessage.RESULT);
                    calculate(operation);
                } catch (InputMismatchException e) {
                    System.err.println("Wrong input");
                }
            } else {
                System.err.println(Message.ErrorMessage.INVALID_INPUT);
            }
        }
    }

    private void calculate(String operation) {
        double result;
        switch (operation) {
            case "+" -> {
                result = firstNum + secondNum;
                System.out.println(result);
            }
            case "-" -> {
                result = firstNum - secondNum;
                System.out.println(result);
            }
            case "/" -> {
                result = firstNum / secondNum;
                System.out.println(result);
            }
            case "*" -> {
                result = firstNum * secondNum;
                System.out.println(result);
            }
            default -> printMessage(Message.SystemMessage.OPERATION_NOT_SUPPORT);
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }
}

interface Message {
    interface SystemMessage {
        String STOP = "stop";
        String CONTINUE = "continue";
        String WRITE_NUMBER = "Write a number: ";
        String WRITE_OPERATION = "Write an operation: ";
        String RESULT = "Result of your expression: ";
        String OPERATION_NOT_SUPPORT = "Operation doesn't support.";
        String INSTRUCTION = "If you want to stop enter \"stop\" or \"continue\" if you want to continue: ";
    }

    interface ErrorMessage {
        String INVALID_INPUT = "What did you enter? Try again.";
    }
}
