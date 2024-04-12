package week_03;

public class Week3Tasks_BI {
    public static void main(String[] args) {
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        checkPrime(2);     // prime
        checkPrime(3);     // prime
        checkPrime(30);    // composite
        checkPrime(47);    // prime
        checkPrime(24854); // composite
        checkPrime(10499); // prime
        System.out.println("=============================================\n");

        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        int[] nums = {215743648, 123, -5263, 100, -1000, 3, -5, 0};
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("%-25s", "Original num" + (i + 1) + " = " + nums[i]);
            System.out.print(" | ");
            System.out.println("Reversed num" + (i + 1) + " = " + reverseNumber(nums[i]));
        }
        System.out.println("=============================================\n");
    }

    /**
     * Checks if a number is prime or not and displays the result.
     * @param num Number to check.
     */
    private static void checkPrime(int num) {
        // Handle edge cases
        if (num <= 1) {
            throw new IllegalArgumentException("Numbers less than 2 can't be prime!");
        }

        // Check for prime (don't need to round up "limit", as that would make it bigger than sqrt(num))
        int limit = (int) Math.sqrt(num);
        boolean isPrime = true;
        for (int i = 2; i < limit; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Display whether the number is prime or not
        if (isPrime) {
            System.out.println(num + " is a prime number!");
        }
        else {
            System.out.println(num + " is a composite number!");
        }
    }

    /**
     * Reverses the digits of a specified number and returns it.
     * @param num Number to reverse.
     * @return Reversed number.
     */
    private static int reverseNumber(int num) {
        // Handle negative number edge cases
        boolean isNegative = false;
        if (num < 0) {
            num = -num;
            isNegative = true;
        }

        // Extract each digit and add to result in a reversing pattern
        int result = 0;
        while (num > 0) {
            result = (result * 10) + (num % 10);
            num /= 10;
        }

        // Return the result
        if (isNegative) {
            return -result;
        }
        return result;
    }
}
