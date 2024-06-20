package week_09;

import java.util.ArrayList;
import java.util.Arrays;

public class Week9Tasks_EP {

    public static void main(String[] args) {

        removingNames();

        removingNumbers();

        concatArrays();
    }

    public static ArrayList<String> removingNames() {

        // Initialize the list of names
        String[] names = {"Ahmed", "John", "Eric", "Ahmed", "Mike"};

        // Create an empty ArrayList
        ArrayList<String> nameList = new ArrayList<>();

        // Add all elements from the array to the ArrayList
        nameList.addAll(Arrays.asList(names));

        // Remove all occurrences of "Ahmed"
        nameList.removeIf(name -> name.equals("Ahmed"));
        System.out.println(nameList);

        int lengthNamesArray = nameList.size();

        return nameList;
    }

    public static ArrayList<Integer> removingNumbers() {

        // Initialize the list of names
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 10, 100, 101, 102, 103, 104, 105, 106, 107};

        // Create an empty ArrayList
        ArrayList<Integer> numberList = new ArrayList<>();

        // Add all elements from the array to the ArrayList
        numberList.addAll(Arrays.asList(numbers));

        // Remove all values greater than 100
        numberList.removeIf(number -> number > 100);

        System.out.println(numberList);

        return numberList;
    }

    public static ArrayList<String> concatArrays() {

        String[] fruits = {"apple", "cherry", "grape"};

        String[] vegetables = {"tomato", "eggplant", "cucumber"};

        // Create an empty ArrayList
        ArrayList<String> concatenatedList = new ArrayList<>();

        // Add all elements from the fruits array to the ArrayList
        for (String fruit : fruits) {
            concatenatedList.add(fruit);
        }

        // Add all elements from the vegetables array to the ArrayList
        for (String vegetable : vegetables) {
            concatenatedList.add(vegetable);
        }

        System.out.println(concatenatedList);

        return concatenatedList;
    }


}
