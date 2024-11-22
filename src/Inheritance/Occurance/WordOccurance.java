package Inheritance.Occurance;

import java.util.HashMap;
import java.util.Map;

public class WordOccurance extends Occurance {

    String str;

    public WordOccurance(String typeOfOccurance, String str) {
        super(typeOfOccurance);
        this.str = str;
    }

    Map<String,Integer> occurances = new HashMap<>();

    public Map<String,Integer> countOccurance() {
        String[] words = str.split(" ");
        for (String word: words){
            Integer integer = occurances.get(word);
            if(integer == null){
                occurances.put(word,1);
            }else {
                occurances.put(word,integer+1);
            }
        }
        return occurances;
    }

}
