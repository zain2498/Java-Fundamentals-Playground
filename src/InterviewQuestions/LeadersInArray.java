package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int sizeOfArr = arr.length;
        int rightMostEle = arr[sizeOfArr -1];
        leaders.add(rightMostEle);

        for (int i = sizeOfArr -2; i >0; i--){
            if (arr[i] > rightMostEle){
                rightMostEle = arr[i];
                leaders.add(rightMostEle);
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
