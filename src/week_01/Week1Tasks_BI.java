package week_01;

public class Week1Tasks_BI {
    public static void main(String[] args) {
        System.out.println("Task-1 test:");
        System.out.println("===========================");
        oddOrEven(5);
        oddOrEven(6);
        oddOrEven(21);
        System.out.println("===========================\n");

        System.out.println("Task-2 test:");
        System.out.println("===========================");
        divWithoutOperator(25, 5);
        divWithoutOperator(92, 3);
        divWithoutOperator(23, 35);
        System.out.println("===========================\n");

        System.out.println("Task-3 test:");
        System.out.println("===========================");
        finra();
        System.out.println("===========================\n");

    }

    private static void oddOrEven(int num) {
        if (num % 2 == 0) {
            System.out.println("Number " + num + " is even.");
        }
        else {
            System.out.println("Number " + num + " is odd.");
        }
    }

    private static void divWithoutOperator(int dividend, int divisor) {
        if (dividend <= 0 || divisor <= 0) {
            throw new IllegalArgumentException("Arguments must be positive!");
        }

        int originalDividend = dividend;
        int quotient = 0;
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        System.out.println(originalDividend + " / " + divisor + " -> Quotient = " + quotient + ", Remainder -> " +
                           dividend);
    }

    private static void finra() {
        String result;
        System.out.print("FINRA");
        for (int i = 1; i <= 30; i++) {
            result = "";
            if (i % 3 == 0) {
                result += "FIN";
            }
            if (i % 5 == 0) {
                result += "RA";
            }
            if (result.isEmpty()) {
                result = String.valueOf(i);
            }
            System.out.print(", " + result);
        }
        System.out.println();
    }
}
