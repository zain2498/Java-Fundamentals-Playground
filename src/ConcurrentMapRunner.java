import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

    public static void main(String[] args) {
        Map<Character, LongAdder> longAdderMap = new Hashtable<>();
        String str = "ABCD ABCD ABCD";
        for (char character:str.toCharArray()){
            LongAdder longAdder = longAdderMap.get(character);
            if(longAdder ==null){
                longAdder = new LongAdder();
            }

            longAdder.increment();
            longAdderMap.put(character,longAdder);
        }
        System.out.println(longAdderMap);
        //the above function is not thread safe so inorder to make it thread safe we will do this


        //---this is thread safe
        ConcurrentMap<Character, LongAdder> concurrentMap =  new ConcurrentHashMap<>();

        for(char character: str.toCharArray()){
            concurrentMap.computeIfAbsent(character, ch -> new LongAdder()).increment();
        }

        System.out.println("thread safe "+concurrentMap);




    }


}
