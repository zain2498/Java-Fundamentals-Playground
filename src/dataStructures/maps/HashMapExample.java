package dataStructures.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<String,Integer> peopleInfo = new HashMap<>();

        peopleInfo.put("Zain", 26);
        peopleInfo.put("Qamar", 65);
        peopleInfo.put("Sohaib", 24);
        peopleInfo.put("Waheb", 24);
        peopleInfo.put("Abdullah", 23);

        for (Map.Entry<String,Integer> entry : peopleInfo.entrySet()){
            System.out.println("Name of a person: "+entry.getKey()+" and Age: "+entry.getValue());
        }

    }
}
