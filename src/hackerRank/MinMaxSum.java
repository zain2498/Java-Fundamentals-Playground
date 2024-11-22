package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSumFun(List<Integer> arr) {
        // Write your code here
        long MaxSum = 0;
        long MinSum = 0;

        Collections.sort(arr);

        for(int i=0; i <arr.size()-1; i++){

            MinSum += arr.get(i);

        }
        for(int j=1; j < arr.size(); j++){

             MaxSum +=arr.get(j);
        }

        System.out.println(MinSum +" "+ MaxSum);

    }

    public static void main(String[] args) {
        MinMaxSum obj = new MinMaxSum();
        List<Integer> list =  new ArrayList<>(Arrays.asList(7,69,2,221,8974));
        miniMaxSumFun(list);
    }
}
