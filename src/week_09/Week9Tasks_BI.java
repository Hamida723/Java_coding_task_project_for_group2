package week_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Week9Tasks_BI {
    public static void main(String[] args) {
        // =================================================== TEST-1 ==================================================
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        int[] array1;
        int[] array2;

        array1 = new int[] {};
        array2 = new int[] {};
        System.out.println("\tArray1: " + Arrays.toString(array1));
        System.out.println("\tArray2: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(concatArray(array1, array2)));
        System.out.println("\t----------");

        array1 = new int[] {5};
        array2 = new int[] {};
        System.out.println("\tArray1: " + Arrays.toString(array1));
        System.out.println("\tArray2: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(concatArray(array1, array2)));
        System.out.println("\t----------");

        array1 = new int[] {};
        array2 = new int[] {5};
        System.out.println("\tArray1: " + Arrays.toString(array1));
        System.out.println("\tArray2: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(concatArray(array1, array2)));
        System.out.println("\t----------");

        array1 = new int[] {-1, 0, 9};
        array2 = new int[] {25, -55, 2, -4};
        System.out.println("\tArray1: " + Arrays.toString(array1));
        System.out.println("\tArray2: " + Arrays.toString(array2));
        System.out.println("\tResult: " + Arrays.toString(concatArray(array1, array2)));
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        List<String> list;

        list = new ArrayList<>();
        System.out.println("\tList: " + list);
        System.out.println("\tResult: " + removeAhmed(list));
        System.out.println("\t-----");

        list = new ArrayList<>(Arrays.asList("Penny", "Lenny", "Josh", "Ahmed", "Canter"));
        System.out.println("\tList: " + list);
        System.out.println("\tResult: " + removeAhmed(list));
        System.out.println("\t-----");

        list = new ArrayList<>(Arrays.asList("Ahmed", "Lenny", "Josh", "Ahmed", "Canter", "Ahmed"));
        System.out.println("\tList: " + list);
        System.out.println("\tResult: " + removeAhmed(list));
        System.out.println("=============================================\n");


        // =================================================== TEST-3 ==================================================
        System.out.println("Task-3 test:");
        System.out.println("=============================================");
        List<Integer> list2;

        list2 = new ArrayList<>();
        System.out.println("\tList: " + list2);
        System.out.println("\tResult: " + removeGreaterThan100(list2));
        System.out.println("\t-----");

        list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println("\tList: " + list2);
        System.out.println("\tResult: " + removeGreaterThan100(list2));
        System.out.println("\t-----");

        list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60 ,70 ,80, 90, 100, 110, 120));
        System.out.println("\tList: " + list2);
        System.out.println("\tResult: " + removeGreaterThan100(list2));
        System.out.println("\t-----");

        list2 = new ArrayList<>(Arrays.asList(98, 99, 100, 101, 102));
        System.out.println("\tList: " + list2);
        System.out.println("\tResult: " + removeGreaterThan100(list2));
        System.out.println("=============================================\n");
    }

    /**
     * Concatenates second array into the first one and returns it.
     * @param array1 First array.
     * @param array2 Second array.
     * @return Concatenated array.
     */
    private static int[] concatArray(int[] array1, int[] array2) {
        // Handle null case
        if (array1 == null || array2 == null) {
            throw new IllegalArgumentException("Input array can't be null!");
        }

        // Concatenate the arrays and return
        int[] result = new int[array1.length + array2.length];
        int i = 0;
        for (int element : array1) {
            result[i] = element;
            i++;
        }
        for (int element : array2) {
            result[i] = element;
            i++;
        }
        return result;
    }


    /**
     * Removes the all entries of "Ahmed" from the given list.
     * @param namesList List of names.
     * @return New list with "Ahmed" names removed.
     */
    private static List<String> removeAhmed(List<String> namesList) {
        // Handle null case
        if (namesList == null) {
            throw new IllegalArgumentException("Input list can't be null!");
        }

        // Remove all "Ahmed" and return
        namesList.removeIf(s -> s.equals("Ahmed"));
        return namesList;
    }

    /**
     * Removes the elements who are bigger than 100 in a list and returns the new list.
     * @param numberList List to remove numbers from.
     * @return Resulting list.
     */
    private static List<Integer> removeGreaterThan100(List<Integer> numberList) {
        // Handle null case
        if (numberList == null) {
            throw new IllegalArgumentException("Input list can't be null!");
        }

        // Remove the elements greater than 100 and return
        // numberList.removeIf(i -> i > 100);
        for (int i = 0; i < numberList.size(); i++) {
            if (numberList.get(i) > 100) {
                numberList.remove(i);
                i--;
            }
        }
        return numberList;
    }
}
