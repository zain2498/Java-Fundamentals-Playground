package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo
{
    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.2f);
        linkedHashMap.put("apple",2);
        linkedHashMap.put("orange",3);
        linkedHashMap.put("mango",4);

        linkedHashMap.get("mango");
        linkedHashMap.get("apple");

        for (Map.Entry<String, Integer> list : linkedHashMap.entrySet()){
            System.out.println(list);

        }
    }
}

/*Least recently used sab se oper ajayega takay use hum remove kr saken is case me orange h */
