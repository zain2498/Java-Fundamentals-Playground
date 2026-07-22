package InterviewQuestions;

public class SubArraySum {

    public static int sum(int[] arr) {
        int sizeOfArray = arr.length;
        int temp;
        int sum =0;

        for (int i =0; i < sizeOfArray; i++){
            temp =0;
            for (int j =i; j<sizeOfArray; j++){
                temp = temp + arr[j];
                sum = sum + temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println("The sum of total elements present in the array are: "+sum(arr));
    }
}
