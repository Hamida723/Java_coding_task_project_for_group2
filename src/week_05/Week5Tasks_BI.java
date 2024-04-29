package week_05;

import java.util.LinkedHashMap;
import java.util.Map;

public class Week5Tasks_BI {
    public static void main(String[] args) {
        // =================================================== TEST-1 ==================================================
        String str1;
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        str1 = "AAABBBCCCDEF";
        System.out.println("1-) String = " + str1 + "\n    Uniques = " + findUniqueChars(str1));
        str1 = "Hello world!";
        System.out.println("2-) String = " + str1 + "\n    Uniques = " + findUniqueChars(str1));
        str1 = "";
        System.out.println("3-) String = " + str1 + "\n    Uniques = " + findUniqueChars(str1));
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        String str2;
        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        str2 = "ABCD";
        System.out.println("1-) String = " + str2 + "\n    Reversed = " + reverseString(str2));
        str2 = "ABC";
        System.out.println("2-) String = " + str2 + "\n    Reversed = " + reverseString(str2));
        str2 = "Hello world!";
        System.out.println("3-) String = " + str2 + "\n    Reversed = " + reverseString(str2));
        str2 = "";
        System.out.println("4-) String = " + str2 + "\n    Reversed = " + reverseString(str2));
        System.out.println("=============================================\n");
    }

    /**
     * Finds the unique (non-repeating) characters from the specified string and returns them as a string.
     * @param str String to check unique characters from.
     * @return String that consist of unique characters found.
     */
    private static String findUniqueChars(String str) {
        // Handle null case
        if (str == null) {
            throw new IllegalArgumentException("Input string can't be null!");
        }

        // Create a frequency list for the characters
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Construct the resulting string and return it
        StringBuilder result = new StringBuilder();
        map.keySet().stream().filter(c -> map.get(c) == 1).forEach(result::append);
        return result.toString();
    }

    /**
     * Reverses the specified string and returns it.
     * @param str String to be reversed.
     * @return Reversed string.
     */
    private static String reverseString(String str) {
        // Handle null case
        if (str == null) {
            throw new IllegalArgumentException("Input string can't be null!");
        }

        // // Lazy answer
        // StringBuilder result = new StringBuilder(str);
        // return result.reverse().toString();

        // Swap characters outer characters until the middle and return the reversed string
        char[] charArray = str.toCharArray();
        int minI = 0;
        int maxI = charArray.length - 1;
        for (; minI < maxI; minI++, maxI--) {
            char temp = charArray[minI];
            charArray[minI] = charArray[maxI];
            charArray[maxI] = temp;
        }
        return String.valueOf(charArray);
    }
}
