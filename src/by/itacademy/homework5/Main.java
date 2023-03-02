package by.itacademy.homework5;

import by.itacademy.homework5.calculator.Calculator;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputOutputStreams inputOutputStreams = new InputOutputStreams();
        Calculator calculator = new Calculator();
        calculator.calculate();
    }
}