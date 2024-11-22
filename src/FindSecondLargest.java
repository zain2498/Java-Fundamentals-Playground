import java.util.Arrays;

public class FindSecondLargest {

    /**
     * This method finds and returns the second largest element in the given array.
     *
     * @param array the array in which to find the second largest element
     * @return the second largest element in the array
     */

    public int findSecondLargestElement(int[] array) {
        //TODO: Write your code here
        int flag = -1;

        if(array.length <= 1){
            return flag;
        }
        int largestNum = 0;
        int secondLargestNum = 0;

        Arrays.sort(array); //array yahan sort huwa wa milega.
        for(int value : array){
            if(value > largestNum){
                largestNum = value;
            }
        }
        for(int i =0 ; i < array.length -1 ; i ++){
            if(array[i] > secondLargestNum ){
                secondLargestNum = array[i];
                if(secondLargestNum != largestNum){
                    flag = secondLargestNum;
                }

            }
        }

        System.out.println("Second largest num is "+ secondLargestNum);
        return flag;

    }

    public static void main(String args[]){
        FindSecondLargest obj = new FindSecondLargest();
        int[] arr = {2147483647, 2147483647};
        int secondLargestNum = obj.findSecondLargestElement(arr);
        System.out.println(secondLargestNum);
    }
}


