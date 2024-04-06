package week_02;

public class Week2Tasks_BI {
    public static void main(String[] args) {
        System.out.println("Task-1 test:");
        System.out.println("=============================================");
        swapWithoutTempVar(5, 21);
        swapWithoutTempVar(61, 20);
        swapWithoutTempVar(-35, 0);
        System.out.println("=============================================\n");

        System.out.println("Task-2 test:");
        System.out.println("=============================================");
        divisibleBy3515();
        System.out.println("=============================================\n");

        System.out.println("Task-3 test:");
        System.out.println("=============================================");
        printConsecutiveNum(24);
        System.out.println("=============================================\n");
    }

    private static void swapWithoutTempVar(int num1, int num2) {
        System.out.print("Original -> ");
        System.out.printf("%-12s", "num1 = " + num1);
        System.out.printf("%-12s", "num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.print("  | Swapped -> ");
        System.out.printf("%-12s", "num1 = " + num1);
        System.out.printf("%-12s", ", num2 = " + num2);
        System.out.println();
    }

    private static void divisibleBy3515() {
        StringBuilder divisible3Str  = new StringBuilder("Divisible By  3 ->");
        StringBuilder divisible5Str  = new StringBuilder("Divisible By  5 ->");
        StringBuilder divisible15Str = new StringBuilder("Divisible By 15 ->");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 ) {
                divisible15Str.append(" ").append(i);
            }
            else if (i % 3 == 0) {
                divisible3Str.append(" ").append(i);
            }
            else if (i % 5 == 0) {
                divisible5Str.append(" ").append(i);
            }
        }
        System.out.println(divisible15Str);
        System.out.println(divisible5Str);
        System.out.println(divisible3Str);
    }

    private static void printConsecutiveNum(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            str.setLength(0);
            if (i % 2 == 0) {
                str.append("Codility");
            }
            if (i % 3 == 0) {
                str.append("Test");
            }
            if (i % 5 == 0) {
                str.append("Coders");
            }
            if (str.isEmpty()) {
                str.append(i);
            }
            System.out.println(str);
        }
    }
}
