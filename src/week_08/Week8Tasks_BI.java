package week_08;

import java.util.Arrays;

public class Week8Tasks_BI {
    public static void main(String[] args) {
        // =================================================== TEST-1 ==================================================
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        int[] result1 = randomIntArray(2);
        System.out.println("\tArray[2]: " + Arrays.toString(result1));
        System.out.println("\tSum: " + Arrays.stream(result1).sum());
        System.out.println("\t-----");

        int[] result2 = randomIntArray(3);
        System.out.println("\tArray[3]: " + Arrays.toString(result2));
        System.out.println("\tSum: " + Arrays.stream(result2).sum());
        System.out.println("\t-----");

        int[] result3 = randomIntArray(4);
        System.out.println("\tArray[4]: " + Arrays.toString(result3));
        System.out.println("\tSum: " + Arrays.stream(result3).sum());
        System.out.println("\t-----");

        int[] result4 = randomIntArray(15);
        System.out.println("\tArray[15]: " + Arrays.toString(result4));
        System.out.println("\tSum: " + Arrays.stream(result4).sum());
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        int[] array;

        array = new int[] {};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + Arrays.toString(moveZeroToEnd(array)));
        System.out.println("\t-----");

        array = new int[] {0, -1};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + Arrays.toString(moveZeroToEnd(array)));
        System.out.println("\t-----");

        array = new int[] {12, 5, 0, 10, 0, -1};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + Arrays.toString(moveZeroToEnd(array)));
        System.out.println("\t-----");

        array = new int[] {-100, 0, 0, -35, 0, 66};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + Arrays.toString(moveZeroToEnd(array)));
        System.out.println("=============================================\n");

        array = new int[] {0, 0, 0, 0, 25, 0, -1, 0, 0};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + Arrays.toString(moveZeroToEnd(array)));
        System.out.println("=============================================\n");
    }

    /**
     * Returns an array with the specified length, the elements of which are unique and sum up to 0.
     * @param n Number of elements. Must be 1 < n < 100.
     * @return Resulting array.
     */
    private static int[] randomIntArray(int n) {
        // Array has to be bigger than 1 and less than 100
        if (n <= 1 || n >= 100) {
            throw new IllegalArgumentException("n has to be bigger than 1 and less than 100!");
        }

        // Fist element is 0 if n is odd
        int i;
        if (n % 2 == 0) {
            i = 0;
        }
        else {
            i = 1;
        }

        // Place unique numbers for the rest of the array and return
        int[] result = new int[n];
        int num = 1;
        for (; i < result.length; i++) {
            result[i] = num;
            if (num > 0) {
                num = -num;
            }
            else {
                num = -num + 1;
            }
        }
        return result;
    }

    /**
     * Moves the zero values to the end of the given array.
     * @param array Array to move zeroes from.
     * @return Resulting array.
     */
    private static int[] moveZeroToEnd(int[] array) {
        // Handle null case
        if (array == null) {
            throw new IllegalArgumentException("Input array can't be null!");
        }

        // Move zeroes to the end and return
        int[] result = new int[array.length];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != 0) {
                result[j] = array[i];
                j++;
            }
        }
        return result;
    }
}
