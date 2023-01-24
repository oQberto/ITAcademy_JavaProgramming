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
}
