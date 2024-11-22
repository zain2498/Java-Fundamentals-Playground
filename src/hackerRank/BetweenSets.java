package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BetweenSets {

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count =0;

        if (a.isEmpty() || b.isEmpty()){
            return 0;
        }


        System.out.println(findLCM(a));

        return count;
    }


    public static List<Integer> findLCM(List<Integer> a){
        List<Integer> fact = Collections.singletonList(0);

        for(int value : a){
            for (int j=1; j <= 10; j++){

                if(value % j ==0){
                    fact.add(value);
                }
            }
        }


        return fact;
    }

    public static void main(String args[]){
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(2);
        a.add(6);

        a.add(24);
        a.add(36);

        System.out.println(getTotalX(a,b));
    }
}
