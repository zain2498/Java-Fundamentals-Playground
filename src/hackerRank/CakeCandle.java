package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CakeCandle {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here

        if(candles.size()<0){
            return -1;
        }

        int max= Collections.max(candles);
        int countMax=0;

        for (int candle: candles){

            if(max == candle){
                countMax += 1;
            }
        }

        System.out.println(max);
        System.out.println(countMax);
        return countMax;

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(3,2,7,7,1,3,3));
        birthdayCakeCandles(arr);
    }
}
