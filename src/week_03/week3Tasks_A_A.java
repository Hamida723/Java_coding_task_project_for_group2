package week_03;

public class week3Tasks_A_A {
    public static void main(String[] args) {
        System.out.println("----------NUMBERS--PRIME--NUMBER----------");
        isPrime(2);
        isPrime(20);
        //isPrime(1);


        System.out.println("--------- NUMBERS--REVERSE--NEGATIVE----------");
        int[] numbers = {-12345, -9876, -54321};
        for (int num : numbers) {
            String reversed = reverseNumber(num);
            System.out.println("Actual number: "+ num + " || " + "Reversed number: " + reversed);
        }

    }

    private static void isPrime(int num) {
        boolean isPrime = true;
        if (num <= 1){
            throw new IllegalArgumentException("Numbers less than 1 or equal to 1!");
        }
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0){
                    isPrime=false;
                    break;
                }
            }

        if(isPrime == true){
            System.out.println(num + " is prime");
        }else if (isPrime == false) {
            System.out.println(num + " is not prime");
        }
    }
    private static String reverseNumber(int num) {
        if (num<0){
            num= -num;
            return "-" + new StringBuilder(String.valueOf(num)).reverse().toString();
        } else {
            return String.valueOf(num);
        }

    }


}
