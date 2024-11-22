package Recursion;

public class FibbonacciSeries {

    public static void printFib(int a, int b, int n){

        if(n==0){
            return;
        }

        int c = a + b;
        System.out.println(c);
        printFib(b,c,n-1);

    }

    public static void main(String args[]){
            int a =0;
            int b = 1;
            int n = 7;
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);
    }
}
