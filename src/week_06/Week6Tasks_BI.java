package week_06;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Week6Tasks_BI {
    public static void main(String[] args) {
        // =================================================== TEST-1 ==================================================
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        String str;
        str = "abcde";
        System.out.println("\tPassword: " + str);
        System.out.println("\tResult: " + validatePassword(str));
        System.out.println("\t-----");

        str = "abcdef";
        System.out.println("\tPassword: " + str);
        System.out.println("\tResult: " + validatePassword(str));
        System.out.println("\t-----");

        str = "ABCdEF";
        System.out.println("\tPassword: " + str);
        System.out.println("\tResult: " + validatePassword(str));
        System.out.println("\t-----");

        str = "abcDef";
        System.out.println("\tPassword: " + str);
        System.out.println("\tResult: " + validatePassword(str));
        System.out.println("\t-----");

        str = "abcDe1";
        System.out.println("\tPassword: " + str);
        System.out.println("\tResult: " + validatePassword(str));
        System.out.println("\t-----");

        str = "a*cDe1";
        System.out.println("\tPassword: " + str);
        System.out.println("\tResult: " + validatePassword(str));
        System.out.println("=============================================\n");


        // =================================================== TEST-2 ==================================================
        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        int[] array;
        array = new int[] {5};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + maxFromIntArray(array));
        System.out.println("\t-----");
        array = new int[] {5, 12};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + maxFromIntArray(array));
        System.out.println("\t-----");

        array = new int[] {0, 1, 2, 3, 4};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + maxFromIntArray(array));
        System.out.println("\t-----");

        array = new int[] {-100, 50, 2, -35, 0, 66};
        System.out.println("\tArray: " + Arrays.toString(array));
        System.out.println("\tResult: " + maxFromIntArray(array));
        System.out.println("\t-----");
        System.out.println("=============================================\n");


        // =================================================== TEST-3 ==================================================
        System.out.println("Task-3 test:");
        System.out.println("=============================================");
        String str2;
        str2 = "5";
        System.out.println("\tString: " + str2);
        System.out.println("\tResult: " + digitSum(str2));
        System.out.println("\t-----");

        str2 = "123";
        System.out.println("\tString: " + str2);
        System.out.println("\tResult: " + digitSum(str2));
        System.out.println("\t-----");

        str2 = "2505";
        System.out.println("\tString: " + str2);
        System.out.println("\tResult: " + digitSum(str2));
        System.out.println("\t-----");

        str2 = "99999";
        System.out.println("\tString: " + str2);
        System.out.println("\tResult: " + digitSum(str2));
        System.out.println("\t-----");
        System.out.println("=============================================\n");
    }

    /**
     * Validates if the given password is valid or not.
     * @param str Password to be checked.
     * @return True if valid, false if invalid.
     */
    private static boolean validatePassword(String str) {
        // Handle null case
        if (str == null) {
            throw new IllegalArgumentException("Input string can't be null!");
        }

        // Password must be at leas 6 character long
        if (str.length() < 6) {
            return false;
        }

        // Password must have at least one upper case character
        for (int i = 0; true; i++) {
            if (i == str.length()) {
                return false;
            }
            if (Character.isUpperCase(str.charAt(i))) {
                break;
            }
        }

        // Password must have at least one lower case character
        for (int i = 0; true; i++) {
            if (i == str.length()) {
                return false;
            }
            if (Character.isLowerCase(str.charAt(i))) {
                break;
            }
        }

        // Password must have at least one special character
        for (int i = 0; true; i++) {
            if (i == str.length()) {
                return false;
            }
            if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                break;
            }
        }

        // Password must have at least one digit
        for (int i = 0; true; i++) {
            if (i == str.length()) {
                return false;
            }
            if (Character.isDigit(str.charAt(i))) {
                break;
            }
        }

        // Password is valid
        return true;
    }

    /**
     * Returns the maximum value from the given array.
     * @param array int array.
     * @return Maximum value.
     */
    private static int maxFromIntArray(int[] array) {
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
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        // Return the max value
        return max;
    }

    /**
     * Returns the sum of all digits in a string.
     * @param num String number.
     * @return Total sum.
     */
    private static int digitSum(String num) {
        // Handle null case
        if (num == null) {
            throw new IllegalArgumentException("Input string can't be null!");
        }

        // If the string is empty
        if (num.isEmpty()) {
            throw new IllegalArgumentException("Input string can't be empty!");
        }

        // If the string is empty
        if (num.charAt(0) == '0') {
            throw new IllegalArgumentException("Input string can't start with 0!");
        }

        // Calculate the sum (all chars must be digits)
        int sum = 0;
        for (char c : num.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("Input string contains non-digit!");
            }
            sum += c - '0';
        }

        // Return the sum
        return sum;
    }
}
