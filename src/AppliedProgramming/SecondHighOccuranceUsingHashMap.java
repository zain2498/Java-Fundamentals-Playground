package AppliedProgramming;

import java.util.HashMap;
import java.util.Map;

public class SecondHighOccuranceUsingHashMap {

     public  static String str = "madamm";
     static int secondHighestCount=0;

     public static char findSecondHighestOccurance(){

         Map<Character, Integer> countMap = new HashMap<>();
         int highestCount = 0;

         for (char ch: str.toCharArray()){
             countMap.put(ch, countMap.getOrDefault(ch,0)+1);
         }

         for (int count : countMap.values()){

             if(count > highestCount){
                 secondHighestCount=highestCount;
                 highestCount=count;
             }else if(count > secondHighestCount && count < secondHighestCount){
                 secondHighestCount=count;
             }
         }

         for (Map.Entry<Character,Integer> entry : countMap.entrySet()){
             if(entry.getValue() == secondHighestCount){
                 return entry.getKey();
             }
         }

         return '\0';
     }
    public static void main(String[] args) {

      char res =  findSecondHighestOccurance();

      if(res != '\0'){
          System.out.println( "char: "+ res + " - count- "+ secondHighestCount);
      }else {
          System.out.println("there is no second highest");
      }

    }
}
