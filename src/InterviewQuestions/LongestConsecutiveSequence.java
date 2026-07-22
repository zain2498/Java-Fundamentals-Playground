package InterviewQuestions;

public class LongestConsecutiveSequence {

    public static int findLongestConsecutiveSequenceInArray(int[] arr) {
        int currCount = 1;
        int maxCount = 1;

        if (arr == null || arr.length < 0) {
            return 0;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currCount++;
            } else {
                currCount = 1;
            }

            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] seqOfArray1 = {0, 0, 0, 0};
        System.out.println("max count is " + findLongestConsecutiveSequenceInArray(seqOfArray1));

        int[] seqOfArray2 = {0, 0, 1, 0, 1, 0};
        System.out.println("max count is " + findLongestConsecutiveSequenceInArray(seqOfArray2));

        int[] seqOfArray3 = {0, 1, 0, 1, 1, 1, 1};
        System.out.println("max count is " + findLongestConsecutiveSequenceInArray(seqOfArray3));

        int[] seqOfArray4 = null;
        System.out.println(findLongestConsecutiveSequenceInArray(seqOfArray4));
    }
}
