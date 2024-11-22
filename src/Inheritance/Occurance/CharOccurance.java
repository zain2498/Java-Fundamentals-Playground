package Inheritance.Occurance;

import java.util.HashMap;
import java.util.Map;

public class CharOccurance extends Occurance {

    String str;

    public CharOccurance(String typeOfOccurance,String str) {
        super(typeOfOccurance);
        this.str = str;
    }

    Map<Character,Integer> occurances = new HashMap<>();


    public Map<Character, Integer> countOccurance() {
        char[] characters = str.toCharArray();
        for (char character : characters){
            Integer integer = occurances.get(character);
            if(integer == null){
                occurances.put(character,1);
            }else{
                occurances.put(character,integer +1);
            }
        }
        return occurances;
    }

}
