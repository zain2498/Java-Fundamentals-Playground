package InterviewQuestions;

//Write a program to find the second highest number in an array without using sorting.
public class SecondHighestNumber {

    public static void findSecondHighestNum(int[] arr){
        if (arr == null){
            return;
        }
        int highestValue = Integer.MIN_VALUE;
        int secondHighestValue = Integer.MIN_VALUE;

        for (int currVar : arr){
            if (currVar > highestValue){
                secondHighestValue = highestValue;
                highestValue = currVar;
            } else if (currVar > secondHighestValue && currVar < highestValue){
                secondHighestValue = currVar;
            }
        }

        if (secondHighestValue < Integer.MIN_VALUE){
            System.out.println("There is no second highest value present in an array.");
        }else {
            System.out.println("The second highest value is  "+secondHighestValue);
        }
    }
    public static void main(String[] args) {
        int[] arr = {-3, -1, -2, -5};
        findSecondHighestNum(arr);

        int[] arr1 = {2,5,6,7,8,9,2,22,16};
        findSecondHighestNum(arr1);

        int[] arr3 = {5,8,0,1,13,11,56,24,23,7,77};
        findSecondHighestNum(arr3);
    }
}