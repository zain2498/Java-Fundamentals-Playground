package InterviewQuestions;

import java.util.Arrays;

public class CumulativeDistance {

    //Brut
    public static int[] findCumulativeDistances(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            int sum = 0;

            for (int j = 0; j < n; j++) {

                if (i != j && nums[i] == nums[j]) {

                    sum += Math.abs(i - j);

                }

            }

            result[i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 4, 2, 4, 3};
        System.out.println("THe cumulative distances are " + Arrays.toString(findCumulativeDistances(arr)));
    }
}
