package by.itacademy.homework5.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private static final BufferedReader BF = new BufferedReader(new InputStreamReader(System.in));
    private static final String STOP = "stop";
    private String operation;
    private double firstNum;
    private double secondNum;

    public void calculate() throws IOException {
        while (true) {
            String userExpression = BF.readLine();
            if (userExpression.equalsIgnoreCase(STOP)) {
                break;
            }
            getCharsFromUserExpression(userExpression);
            calculate(operation);
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
            default -> System.out.println("Not support");
        }
    }

    private void getCharsFromUserExpression(String userExpression) {
        Pattern pattern = Pattern.compile("(\\d*.?\\d*)([*+/-])(\\d*.?\\d*)");
        Matcher matcher = pattern.matcher(userExpression);
        if (matcher.find()) {
            firstNum = Double.parseDouble(matcher.group(1));
            operation = matcher.group(2);
            secondNum = Double.parseDouble(matcher.group(3));
        } else {
            throw new NullPointerException();
        }
    }
}
