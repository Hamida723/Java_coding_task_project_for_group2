package week_07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week7Tasks_BI {
    public static void main(String[] args) {
        // =================================================== TEST-1 ==================================================
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        int[] array;
        array = new int[] {5};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + minFromIntArray(array));
        System.out.println("\t-----");

        array = new int[] {5, 12};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + minFromIntArray(array));
        System.out.println("\t-----");

        array = new int[] {3, 1, 0, 2, 4};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + minFromIntArray(array));
        System.out.println("\t-----");

        array = new int[] {-100, 50, 2, -35, 0, 66};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + minFromIntArray(array));
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        int[] array2;
        array2 = new int[] {5};
        System.out.println("\tArray: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(sortArrayAscending(array2)));
        System.out.println("\t-----");

        array2 = new int[] {12, 5};
        System.out.println("\tArray: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(sortArrayAscending(array2)));
        System.out.println("\t-----");

        array2 = new int[] {3, -1, 0, 2, 4};
        System.out.println("\tArray: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(sortArrayAscending(array2)));
        System.out.println("\t-----");

        array2 = new int[] {-100, 50, 2, -35, 0, 66};
        System.out.println("\tArray: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(sortArrayAscending(array2)));
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        System.out.println("Task-3 test:");
        System.out.println("=============================================");
        int[] array3;
        array3 = new int[] {5};
        System.out.println("\tArray: " + Arrays.toString(array3));
        System.out.println("\tResult: " + Arrays.toString(sortArrayDescending(array3)));
        System.out.println("\t-----");

        array3 = new int[] {-12, 5};
        System.out.println("\tArray: " + Arrays.toString(array3));
        System.out.println("\tResult: " + Arrays.toString(sortArrayDescending(array3)));
        System.out.println("\t-----");

        array3 = new int[] {3, -1, 0, 2, 4};
        System.out.println("\tArray: " + Arrays.toString(array3));
        System.out.println("\tResult: " + Arrays.toString(sortArrayDescending(array3)));
        System.out.println("\t-----");

        array3 = new int[] {-100, 50, 2, -35, 0, 66};
        System.out.println("\tArray: " + Arrays.toString(array3));
        System.out.println("\tResult: " + Arrays.toString(sortArrayDescending(array3)));
        System.out.println("=============================================\n");
    }

    /**
     * Returns the minimum value from the given array.
     * @param array int array.
     * @return Maximum value.
     */
    private static int minFromIntArray(int[] array) {
        // Handle null case
        if (array == null) {
            throw new IllegalArgumentException("Input array can't be null!");
        }

        // If the array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Input array can't be empty!");
        }

        // If there is only one character just return it
        if (array.length == 1){
            return array[0];
        }

        // Find the max value
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        // Return the max value
        return min;
    }

    /**
     * Sorts the given array in ascending order and returns it.
     * @param array Password to be checked.
     * @return Sorted array.
     */
    private static int[] sortArrayAscending(int[] array) {
        // Handle null case
        if (array == null) {
            throw new IllegalArgumentException("Input array can't be null!");
        }

        // If the array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Input array can't be empty!");
        }

        // Sort the array in ascending order
        int i, j, temp;
        int limit = array.length - 1;
        for (i = 0; i < limit; i++) {
            for (j = 0; j < limit - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Return the result
        return array;
    }


    /**
     * Sorts the given array in descending order and returns it.
     * @param array Password to be checked.
     * @return Sorted array.
     */
    private static int[] sortArrayDescending(int[] array) {
        // Handle null case
        if (array == null) {
            throw new IllegalArgumentException("Input array can't be null!");
        }

        // If the array is empty
        if (array.length == 0) {
            throw new IllegalArgumentException("Input array can't be empty!");
        }

        // Sort the array in descending order
        int i, j, temp;
        int limit = array.length - 1;
        for (i = 0; i < limit; i++) {
            for (j = 0; j < limit - i; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        // Return the result
        return array;
    }
}
