package TwoDArray;

import java.util.Scanner;

//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs.
public class randomNum {

    public static void main(String args[]){
        int i,j,n, rows, columns;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter rows");
        rows = sc.nextInt();

        System.out.println("Please enter columns");
        columns = sc.nextInt();


        int[][] matrix = new int[rows][columns];

        //for Input
        System.out.println("Please enter elements into matrix");
        for(i =0; i <rows; i++){
            for (j=0; j <columns; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //finding a random number
        System.out.println("Enter a serch number");
        n = sc.nextInt();


        //for output
        System.out.println("Print Matrix");
        for (i=0; i < rows; i ++){
            for (j=0; j < columns; j++){

                if(matrix[i][j]==n){
                    System.out.print("YAYY FOUND "+n);
                }
            }
        }


    }

}
