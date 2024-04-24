package week_04;

import java.util.*;

public class Week4Tasks_BI {
    public static void main(String[] args) {
        // =================================================== TEST-1 ==================================================
        String T1_str1;
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        T1_str1 = "AAABBCDD";
        System.out.printf("1-) String = \"%s\"\n" +
                          "    Frequency = \"%s\"\n" , T1_str1, frequencyOfChars(T1_str1));

        T1_str1 = "x";
        System.out.printf("2-) String = \"%s\"\n" +
                          "    Frequency = \"%s\"\n" , T1_str1, frequencyOfChars(T1_str1));

        T1_str1 = "How much wood could a woodchuck chuck?";
        System.out.printf("3-) String = \"%s\"\n" +
                          "    Frequency = \"%s\"\n" , T1_str1, frequencyOfChars(T1_str1));

        T1_str1 = "";
        System.out.printf("4-) String = \"%s\"\n" +
                          "    Frequency = \"%s\"\n" , T1_str1, frequencyOfChars(T1_str1));

        T1_str1 = "  \t  \t \n";
        System.out.printf("5-) String = \"%s\"\n" +
                          "    Frequency = \"%s\"\n" , T1_str1, frequencyOfChars(T1_str1));
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        String T2_str1, T2_str2;
        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        T2_str1 = "abc";
        T2_str2 = "cab";
        System.out.printf("1-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "Wool lord!";
        T2_str2 = "Hello world!";
        System.out.printf("2-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "aaaaaa";
        T2_str2 = "abc";
        System.out.printf("3-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "abcd";
        T2_str2 = "abc";
        System.out.printf("4-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "";
        T2_str2 = "cab";
        System.out.printf("5-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "abc";
        T2_str2 = "";
        System.out.printf("6-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "";
        T2_str2 = "";
        System.out.printf("7-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "   \t \n";
        T2_str2 = "";
        System.out.printf("8-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));

        T2_str1 = "";
        T2_str2 = "   \t \n";
        System.out.printf("8-) str1 = \"%s\"\n" +
                          "    str2 = \"%s\"\n" +
                          "    result = %b\n"   , T2_str1, T2_str2 , isFromSameLetters(T2_str1, T2_str2));
        System.out.println("=============================================\n");


        // =================================================== TEST-3 ==================================================
        String T3_str1;
        System.out.println("Task-3 test:");
        System.out.println("=============================================");
        T3_str1 = "AAABBBCCC";
        System.out.printf("1-) String = \"%s\"\n" +
                          "    Dupes removed = \"%s\"\n" , T3_str1, removeDuplicates(T3_str1));

        T3_str1 = "Good morning world!";
        System.out.printf("2-) String = \"%s\"\n" +
                          "    Dupes removed = \"%s\"\n" , T3_str1, removeDuplicates(T3_str1));

        T3_str1 = "";
        System.out.printf("3-) String = \"%s\"\n" +
                          "    Dupes removed = \"%s\"\n" , T3_str1, removeDuplicates(T3_str1));

        T3_str1 = "  \t   \n";
        System.out.printf("4-) String = \"%s\"\n" +
                          "    Dupes removed = \"%s\"\n" , T3_str1, removeDuplicates(T3_str1));
        System.out.println("=============================================\n");
    }

    /**
     * Returns the frequency of characters in a string with the format "c1f1c2f2c3f3..." where: (c=character,
     * f=frequency). Case-sensitive! White spaces are ignored!
     * @param str Input string for frequency check.
     * @return Formatted frequency result string.
     */
    private static String frequencyOfChars(String str) {
        // Handle null case
        if (str == null) {
            throw new IllegalArgumentException("Input string can't be null!");
        }

        // Add each char to a map; if char exists, increment its value instead
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }

        // Format and return the frequency result string
        StringBuilder result = new StringBuilder();
        for (Character c : map.keySet()) {
            result.append(c);
            result.append(map.get(c));
        }
        return result.toString();
    }

    /**
     * Checks if the str1 contains the same set of letters in str2 (regardless of frequency). Not case-sensitive!  White
     * spaces are ignored!
     * @param str1 String to check the letters of.
     * @param str2 String to check the letters from.
     * @return Boolean result.
     */
    private static boolean isFromSameLetters(String str1, String str2) {
        // Handle null cases
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Input strings can't be null!");
        }

        // Construct a set from str2 and check if str1 letters are in the set, return the result
        Set<Character> set = new HashSet<>();
        for (char c : str2.toLowerCase().toCharArray()) {
            set.add(c);
        }
        for (char c : str1.toLowerCase().toCharArray()) {
            if(!Character.isWhitespace(c) && !set.contains(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Removes the duplicate elements from a string and returns it. Order is preserved. Case-sensitive!
     * @param str String to remove duplicate elements from.
     * @return String without duplicates.
     */
    private static String removeDuplicates(String str) {
        // Handle null cases
        if (str == null) {
            throw new IllegalArgumentException("Input string can't be null!");
        }

        // Remove all dupes and return the result
        StringBuilder result = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}
