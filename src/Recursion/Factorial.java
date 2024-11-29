package Recursion;

public class Factorial {

    public static int calcFactorial(int n){

        if(n==1 || n==0){
            return 1;
        }

        int fact_nm1 = calcFactorial(n-1);
        int fact = n * fact_nm1;
        return fact;
    }



    public static int getLastDigit(int number) {
//
//        int lastDig = 0;
//
//
//
//
//        String num = String.valueOf(number);
//
//        char[] characters = num.toCharArray();
//
//        int len = characters.length;
//        char trytest = characters[len - 1];
//        System.out.println("char value "+trytest);

        return number % 10;
    }

    public static void main (String args[]){
        int n = 10;
        int fact = calcFactorial(n);
        System.out.println("Recursion.Factorial is "+ fact);

//        System.out.println(getLastDigit(999875));
    }
}


