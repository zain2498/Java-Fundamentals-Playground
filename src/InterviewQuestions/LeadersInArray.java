package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int sizeOfArray = arr.length;
        int rightMax = arr[sizeOfArray - 1];
        leaders.add(rightMax);

        for (int i = sizeOfArray -2; i >=0; i--){
            if (arr[i] > rightMax){
                rightMax = arr[i];
                leaders.add(rightMax);
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] numArray1 = {16,17,4,3,5,2};
        System.out.println(findLeaders(numArray1));

        int[] numArray2 = {1,2,3,4,5,2};
        System.out.println(findLeaders(numArray2));
    }
}
