package by.itacademy.homework5.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static by.itacademy.homework5.task5.Message.SystemMessage.*;

public class Matrices {
    private static final BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
    private int[][] result;

    public void start() throws IOException {
        printMessage(MATRIX_ROWS);
        int matrixLength = validateNum();
        printMessage(MATRIX_COLUMNS);
        int matrixHeight = validateNum();
        int[][] firstMatrix = new int[matrixLength][matrixHeight];
        int[][] secondMatrix = new int[matrixLength][matrixHeight];
        result = new int[matrixLength][matrixHeight];

        fillMatrix(firstMatrix);
        printMessage(MATRIX_RESULT);
        printMatrix(firstMatrix);

        fillMatrix(secondMatrix);
        printMessage(MATRIX_RESULT);
        printMatrix(secondMatrix);

        printMessage(MATRICES_SUM);
        printMatrix(sumOfMatrices(firstMatrix, secondMatrix));
        printMessage(MATRICES_DIFFERENCE);
        printMatrix(differenceOfMatrices(firstMatrix, secondMatrix));
        BR.close();
    }

    private void fillMatrix(int[][] matrix) throws IOException {
        printMessage(MATRIX_MESSAGE);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = validateNum();
            }
        }
    }

    private int[][] sumOfMatrices(int[][] first, int[][] second) {
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    private int[][] differenceOfMatrices(int[][] first, int[][] second) {
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                result[i][j] = first[i][j] - second[i][j];
            }
        }
        return result;
    }

    private int validateNum() throws IOException {
        while (true) {
            String num = BR.readLine();
            try {
                return Integer.parseInt(num);
            } catch (NumberFormatException e) {
                printErrorMessage();
            }
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    private void printErrorMessage() {
        System.err.println(Message.ErrorMessage.NOT_A_NUMBER);
    }

    private void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}

interface Message {
    interface SystemMessage {
        String MATRIX_ROWS = "Enter the number of rows of the matrix: ";
        String MATRIX_COLUMNS = "Enter the number of columns of the matrix: ";
        String MATRIX_MESSAGE = "Enter the matrix: ";
        String MATRIX_RESULT = "Your matrix: ";
        String MATRICES_SUM = "The sum of two matrices: ";
        String MATRICES_DIFFERENCE = "The difference of two matrices: ";
    }

    interface ErrorMessage {
        String NOT_A_NUMBER = "Not a number, try again";
    }
}
