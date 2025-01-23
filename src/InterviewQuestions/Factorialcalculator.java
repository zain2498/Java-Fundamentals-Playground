package InterviewQuestions;

import java.sql.PreparedStatement;

public class Factorialcalculator {

    public  static  int factorial =1;
    public static int num = 5;
    public static void main(String[] args) {

        System.out.println(num +" factorial via iterative approach "+ factorialIterative(num) );
        System.out.println(num +" factorial via recursive approach "+ factorialRecursive(num) );
    }

    public static int factorialIterative(int n){
        for (int i=1; i <=n ; i++){
            factorial = factorial*i;
        }
        return factorial;
    }

    public static int factorialRecursive(int n){
        if (n ==0 || n ==1){
            return 1;
        }
        return n * factorialRecursive(n-1);

    }
}
