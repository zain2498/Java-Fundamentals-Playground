package Recursion;

public class calPower {

    public static int pow(int x, int n){

        if(n==0){
            return 1;
        }
        if (x == 0){
            return 0;
        }

        int pownm1 = pow(x,n-1);
        int pown = x * pownm1;
        return pown;
    }

    public static void main (String args[]){

        int x = 5 , n = 2;
        int powSum = pow(x,n);
        System.out.println(powSum);
    }

}