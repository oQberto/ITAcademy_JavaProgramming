package com.it_academy.homework_1;

public class Homework1 {

    /**
     * Calculates the sum of the elements of an array without a number
     * selected by the user.
     * <p>
     * @param array the array in which to calculate the sum
     * @param notIncludeInArraySum the number that isn't included in the sum
     * @return the sum of array elements
     */
    public static int getArraySum(int[] array, int notIncludeInArraySum) {
        int arraySum = 0;

        for (int element : array) {
            if (element == notIncludeInArraySum) {
                continue;
            }
            arraySum += element;
        }
        return arraySum;
    }

    /**
     * Calculates the sum of all even Fibonacci numbers up to a definite index
     * @param countOfNumbersInSequence the length of the Fibonacci numbers sequence
     * @param amountIndex the number up to which the sum is calculated
     * @return the sum of even numbers
     */
    public static int getSumOfEvenNumbers(int countOfNumbersInSequence, int amountIndex) {
        int[] fibonacciNumbers = makeFibonacciSequence(countOfNumbersInSequence);
        int amountOfNumbersFromSequence = 0;

        for (int i = 0; i < amountIndex; i++) {
            if (fibonacciNumbers[i] % 2 == 0) {
                amountOfNumbersFromSequence += fibonacciNumbers[i];
            }
        }
        return amountOfNumbersFromSequence;
    }

    private static int[] makeFibonacciSequence(int countOfNumbersInSequence) {
        int[] fibonacciSequence = new int[countOfNumbersInSequence];

        for (int i = 0; i < countOfNumbersInSequence; i++) {
            fibonacciSequence[i] = i < 2
                    ? i
                    : fibonacciSequence[i - 1] + fibonacciSequence[i - 2];
        }
        return fibonacciSequence;
    }

    /**
     * Inverts the array
     * @param array user's array for invert
     * @return inverted array
     */
    public static int[] invert(int[] array) {
        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    /**
     * Determines which numbers are greater: positive or negative.
     * <p>
     * @param matrix two-dimensional array to look up positive and negative numbers
     * @return a message which numbers are greater
     */
    public static String findPositiveAndNegative(int[][] matrix) {
        int countOfPositive = 0;
        int countOfNegative = 0;

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt > 0) {
                    countOfPositive++;
                } else {
                    countOfNegative++;
                }
            }
        }
        if (countOfPositive > countOfNegative) {
            return "Positive";
        } else if (countOfNegative > countOfPositive) {
            return "Negative";
        }
        return "Same";
    }

    /**
     * Determines if a matrix is a lower triangular matrix.
     * <p>
     * @param matrix input a matrix for verification
     * @return true if the matrix is a lower triangular matrix
     */
    public static boolean isLowerTriangularMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j <= i && matrix[i][j] == 0) {
                    return false;
                }
                if (j > i && matrix[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Calculates a sum of two matrices. After adding identical elements
     * in two matrices, their sum is written in matrixA.
     * <p>
     * @param matrixA first term
     * @param matrixB second term
     * @return a rewritten matrixA equal to the sum of the original matrices.
     *         If matrices sizes not equals return null.
     */
    public static int[][] findSumOfMatrices(int[][] matrixA, int[][] matrixB) {
        if (!isSameSize(matrixA, matrixB)) {
            return null;
        }
        int intermediateSum;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                intermediateSum = matrixA[i][j] + matrixB[i][j];
                matrixA[i][j] = intermediateSum;
            }
        }
        return matrixA;
    }

    /**
     * Calculates a difference of two matrices. After subtracting the same elements
     * in two matrices, their difference is written in matrixA.
     * <p>
     * @param matrixA minuend
     * @param matrixB subtrahend
     * @return a rewritten matrixA equal to the difference of the original matrices.
     *         If matrices sizes not equals return null.
     */
    public static int[][] findDifferenceOfMatrices(int[][] matrixA, int[][] matrixB) {
        if (!isSameSize(matrixA, matrixB)) {
            return null;
        }
        int intermediateDifference;

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                intermediateDifference = matrixA[i][j] - matrixB[i][j];
                matrixA[i][j] = intermediateDifference;
            }
        }
        return matrixA;
    }

    private static boolean isSameSize(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length) {
            return false;
        }
        for (int i = 0; i < matrixA.length; i++) {
            if (matrixA[i].length != matrixB[i].length) {
                return false;
            }
        }
        return true;
    }
}
