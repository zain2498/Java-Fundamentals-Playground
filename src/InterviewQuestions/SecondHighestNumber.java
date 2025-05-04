package InterviewQuestions;

//Write a program to find the second highest number in an array without using sorting.
public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr = {-3, -1, -2, -5};
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > highest) {
                secondHighest = highest;
                highest = ele;
            } else if (ele > secondHighest && ele < highest) {
                secondHighest = ele;
            }
        }
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest value in the array.");
        } else {
            System.out.println("Second highest value in the array is " + secondHighest);
        }
    }
}
