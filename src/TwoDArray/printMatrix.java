package TwoDArray;

import java.util.Scanner;

public class printMatrix {


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        int rows = sc.nextInt();
        System.out.println("Enter Columns");
        int cols = sc.nextInt();

        int [][] numbers = new int[rows][cols];

        //Input
        System.out.println("Please enter number of elements in a matrix");
        for (int i =0; i < rows; i ++){

            for (int j = 0; j < cols; j ++){

                numbers[i][j] = sc.nextInt();
            }

        }


        //output
        System.out.println("Print Matrix ");
        for(int i = 0; i < rows; i ++){
            for(int j=0; j < cols ; j++){

                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
