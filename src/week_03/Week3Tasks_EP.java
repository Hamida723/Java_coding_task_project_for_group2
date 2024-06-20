package week_03;

public class Week3Tasks_EP {


        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }

            // Check divisibility up to square root of the number
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false; // Not prime
                }
            }

            return true; // Prime
        }

        public static void main(String[] args) {
            int number = 1; // Example number
            if (isPrime(number)) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }

