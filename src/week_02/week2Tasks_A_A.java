package week_02;

public class week2Tasks_A_A {
    public static void main(String[] args) {
        System.out.println("---------------SWAP NUMBERS------------");

        swapWithoutThirdvar(6, 10);

        System.out.println("---------------------------------------");

        System.out.println("-------------DIVISIBLE-----------------");

        divisbleBy3515();

        System.out.println("---------------------------------------");

        System.out.println("----------PRINT CONSECUTIVE------------");
    }

    public static void swapWithoutThirdvar(int num1, int num2) {
        System.out.println("Before Swapping:");

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 += num2;
        num2 -= num1;
        num1 -= num2;

        System.out.println("After Swapping:");

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

    public static void divisbleBy3515() {
        String divisibleBy15 = "Divisible by 15 ---> ";
        String divisibleBy3 =  "Divisible by 3  ---> ";
        String divisibleBy5 =  "Divisible by 5  ---> ";

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                divisibleBy15 += i + " ";
            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            }else if (i % 5 == 0) {
                divisibleBy5 += i + " ";
            }
        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }


}













