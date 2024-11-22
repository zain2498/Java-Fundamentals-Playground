package PatternProblem;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String args[])
    {
        int n, i, j, k;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
         n = s.nextInt();

        for(i=1; i<=n; i++){

            for (j=n; j>i; j--){
                System.out.print(" ");
            }

            for (k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n; i >= 1; i --){

            for (j=n; j > i ; j--){
                System.out.print(" ");
            }

            for (k=1; k <= (2*i-1); k++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
