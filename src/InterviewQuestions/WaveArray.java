package InterviewQuestions;

import java.util.Arrays;

public class WaveArray {

    public static int[] convertToWave(int[] arr) {
        int sizeOfArray = arr.length;
        int tempVariable = 0;
        for (int i =0; i < sizeOfArray - 1; i = i +2) {
            tempVariable = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = tempVariable;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] numArray1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(convertToWave(numArray1)));

        int[] numArray2 = {2,4,7,8,9,10};
        System.out.println(Arrays.toString(convertToWave(numArray2)));
    }
}
