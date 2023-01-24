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
}
