package InterviewQuestions;

public class LongestConsecutiveSequence {

    public static int findLongestConsecutiveSequenceInArray(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int currEleCount = 1;
        int maxCount = 1;

        for(int i =0; i <arr.length -1 ;i++){
            if(arr[i] == arr[i+1]){
                currEleCount++;
            }else {
                currEleCount = 1;
            }
            maxCount = Math.max(currEleCount, maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] seqOfArray1 = {0,0,0,0};
        System.out.println("max count is "+findLongestConsecutiveSequenceInArray(seqOfArray1));

        int[] seqOfArray2 =  {0, 0, 1, 0, 1, 0};
        System.out.println("max count is "+findLongestConsecutiveSequenceInArray(seqOfArray2));

        int[] seqOfArray3 = {0, 1, 0, 1, 1, 1, 1};
        System.out.println("max count is "+findLongestConsecutiveSequenceInArray(seqOfArray3));
    }
}
