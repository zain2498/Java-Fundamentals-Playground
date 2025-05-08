package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {

    private int capacity;

    LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String, Integer> studentMap = new LRUCache<>(3);
            studentMap.put("zain ", 12);
            studentMap.put("Hammad", 22);
            studentMap.put("Sohaib", 33);
            studentMap.put("samad", 31);
        studentMap.put("zain ", 12);

        System.out.println(studentMap);
    }

}
