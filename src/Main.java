import com.it_academy.homework_1.Homework1;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        int[][] matrixA = new int[][]{
                {1, 3, 0, 2},
                {4, 1, 3, 1}};
        int[][] matrixB = new int[][]{
                {4, -3, 2, -2},
                {-3, 0, 4, 0}};
        try {
            printMatrix((Objects.requireNonNull(Homework1.findDifferenceOfMatrices(matrixA, matrixB))));
        } catch (NullPointerException e) {
            System.out.println("Error");
        }

    }

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}