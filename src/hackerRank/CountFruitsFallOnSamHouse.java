package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CountFruitsFallOnSamHouse {

    //imperitive programming
//       public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){
//
//           // a --> 4 and b --> 12
//
//           List<Integer> samHouseGotFruit = new ArrayList<>();
//           int countApple =0;
//           int countOranges = 0;
//
//           //s --> 7 and t --> 10
//           for (int apple : apples){
//               apple += a;
//
//                if(apple >=s && apple <= t ){
//                    countApple += 1;
//               }
//           }
//
//           for (int orange : oranges){
//                orange += b;
//
//               if(orange >= s && orange <= t){
//                   countOranges +=1;
//               }
//           }
//
//           samHouseGotFruit.add(countApple);
//           samHouseGotFruit.add(countOranges);
//           System.out.println("No of Fruits Sam got "+samHouseGotFruit);
//
//
//       }


    //functional programming
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges){

        long countApples = apples.stream().map(apple -> apple+a).filter(apple -> apple >=s && apple<=t).count();
        long countOranges = oranges.stream().map(orange -> orange+b).filter(orange -> orange >=s && orange <= t).count();

        System.out.println(countApples);
        System.out.println(countOranges);
    }

    public static void main(String[] args) {
           List<Integer> apples = new ArrayList<>();
           List<Integer> oranges = new ArrayList<>();

           apples.add(-2);
           apples.add(2);
           apples.add(1);

           oranges.add(5);
           oranges.add(-6);

        countApplesAndOranges(7,11,5,15, apples, oranges);
    }
}
