package InterviewQuestions;

public class SubArraySum {

    public static int sum(int[] arr) {
        int size = arr.length;
        int start;
        int sum = 0;

       for (int i = 0; i < size; i++) {
           start = 0;
           for (int j = i; j < size; j++) {
               start = start + arr[j];
               sum += start;
           }
       }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(sum(arr));
    }
}
