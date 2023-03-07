package by.itacademy.homework5.task6;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Matrices {
    private static final String FILE_PATH = "D:\\Java Projects\\ITAcademy_JavaProgramming\\src\\by\\itacademy\\homework5\\task6\\matrices";
    private static final File file = new File(FILE_PATH);
    private int rowsCount;
    private int columnsCount;
    private int[][] result;
    private List<Integer> numbersFromFile;

    public void start() throws IOException, InvalidMatrixInFile {
        readFile();

        printMessage(Message.SystemMessage.SUM);
        printMatrix(sumOfMatrices());

        printMessage(Message.SystemMessage.DIFFERENCE);
        printMatrix(differenceOfMatrices());
    }

    private void readFile() throws IOException, InvalidMatrixInFile {
        Scanner READER = new Scanner(file);
        numbersFromFile = new LinkedList<>();

        while (READER.hasNextLine()) {
            numbersFromFile.add(READER.nextInt());
        }

        rowsCount = numbersFromFile.get(0);
        columnsCount = numbersFromFile.get(1);
        result = new int[rowsCount][columnsCount];
        validateFile();
    }

    private int[][] sumOfMatrices() {
        int count = 2;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = numbersFromFile.get(count) + numbersFromFile.get((rowsCount * columnsCount) + count);
                count++;
            }
        }
        return result;
    }

    private int[][] differenceOfMatrices() {
        int count = 2;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = numbersFromFile.get(count) - numbersFromFile.get((rowsCount * columnsCount) + count);
                count++;
            }
        }
        return result;
    }

    private void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private void printMessage(String message) {
        System.out.println(message);
    }

    /**
     * Returns InvalidMatrixInFile exception if one of two matrices
     * has a wrong view.
     * @throws InvalidMatrixInFile - matrices have a wrong view.
     */
    private void validateFile() throws InvalidMatrixInFile {
        if (numbersFromFile.size() != (rowsCount * columnsCount) * 2 + 2) {
            throw new InvalidMatrixInFile(
                    Message.ErrorMessage.INVALID_MATRIX, file
            );
        }
    }
}

interface Message {
    interface SystemMessage {
        String SUM = "The sum of two matrices from the file: ";
        String DIFFERENCE = "The difference of two matrices from the file: ";
    }
    interface ErrorMessage {
        String INVALID_MATRIX = "Invalid matrix in the file: ";
    }

}
