import java.util.Arrays;

public class ArrayReverse {

    public int[] reverseArray(int[] array) {

        int start = 0;
        int end = array.length - 1; //if array starts from 0

        int [] reversedArray = new int[array.length];

        if(array.length < 1){
            return  array;
        }

        while (start < end){
            reversedArray[start] = array[end];
            reversedArray[end] = array[start];

            start++;
            end--;
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();
        int[] arr = {1,2,3,4,6,9,2};
       int[] reveresedArr =  arrayReverse.reverseArray(arr);
        System.out.println("The array is reverse order is "+Arrays.toString(reveresedArr));
    }

}
