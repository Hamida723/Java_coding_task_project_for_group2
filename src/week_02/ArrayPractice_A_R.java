package week_02;

public class ArrayPractice_A_R {
    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 5 == 0) {
                System.out.print(numbers[i] + " ");
            }

        }
    }
}
