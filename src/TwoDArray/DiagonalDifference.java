package TwoDArray;//package TwoDArray;
//
//public class DiagonalDifference {
//
//    public static int diagonalDifference(int[][] arr) {
//        int n = arr.length;
//        int leftDiagonalSum = 0;
//        int rightDiagonalSum = 0;
//
//        // Calculate the sum of the left-to-right diagonal
//        for (int i = 0; i < n; i++) {
//            leftDiagonalSum += arr[i][i];
//        }
//
//        // Calculate the sum of the right-to-left diagonal
//        for (int i = 0; i < n; i++) {
//            rightDiagonalSum += arr[i][n - 1 - i];
//        }
//
//        // Return the absolute difference between the two sums
//        return Math.abs(leftDiagonalSum - rightDiagonalSum);
//    }
//
//    public static void main(String[] args) {
//        // Example usage:
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {9, 8, 9}
//        };
//
//        int result = diagonalDifference(matrix);
//        System.out.println(result);
//    }
//}
//

import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int rightDiagonalSum = 0;
        int leftDiagonalSum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            // Access the elements of each row
            List<Integer> row = arr.get(i);

            // Calculate the left-to-right diagonal sum
            leftDiagonalSum += row.get(i);

            // Calculate the right-to-left diagonal sum
            rightDiagonalSum += row.get(n - 1 - i);
        }

        // Return the absolute difference between the two sums
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }

//    public static void main(String[] args) {
//        // Example usage:
//        List<List<Integer>> matrix = List.of(
//                List.of(1, 2, 3),
//                List.of(4, 5, 6),
//                List.of(9, 8, 9)
//        );
//
//        int result = diagonalDifference(matrix);
//        System.out.println(result);
//    }
}


//DRY RUN
/*
i --> 0;
n --> 3



0,2 ---> i - n - 1 = 0 - 3 - 1 = 2
1,1 ---> 1 - 3 - 1 = 1
2,0 ---> 2 - 3 - 1 = 0

 */
