package week_01;

public class week1Tasks_A_A {
    public static void main(String[] args) {
        System.out.println("---------NUMBERS-- ODD & EVEN--------");
        oddorEven(6);
        oddorEven(5);
        oddorEven(-2);

        System.out.println("------NUMBERS-- DIVIDE without OPERATOR-----");

        divWithoutOP(25,5);
        divWithoutOP(60,6);

        System.out.println("------------FINRA------------");
        //Method which prints nums 1 to 30
        //multiple of 3 print "FIN"
        //multiple of 5 print "RA"
        //multiple both print "FINRA"
        finra();
    }
    public static void oddorEven (int num){
        if (num > 0){
            if (num % 2 == 0 ){
                System.out.println("Num " + num + " is even");
            } else  {
                System.out.println("Num " + num + " is odd");
            }
        }
        else {
            System.out.println("Number is negative");
        }
    }
    public static void  divWithoutOP (int dividend , int divisor){
        int quotient = 0;
        int orginalDivdend = dividend;

        do {
            dividend -= divisor;
            quotient++;
        }while (dividend >= divisor);
        System.out.println(orginalDivdend + "/" + divisor + "=" + quotient);

    }
    public static void finra (){
        String result ;
        for (int i = 1; i <= 30; i++) {
            result = "";
            if(i % 3 == 0){
                result += "FIN";
            }
            if (i % 5 == 0){
                result += "RA";
            }
            if ( i % 3 == 0 & i % 5 == 0){
                result += "FINRA";
            }
            System.out.print(result +" ");
        }
        System.out.println();
    }

}
