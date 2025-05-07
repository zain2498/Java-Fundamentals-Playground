package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapCollectionExample {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Zain");
        map.put(2,"Badar");
        map.put(3,"Uddin");

        Set<Integer> keys =  map.keySet();
        System.out.println("Extracting values based on keys");
        for (int key: keys){
            System.out.println(map.get(key));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Extracting both keys and values");
        for (Map.Entry<Integer, String> entry :  entries){
            System.out.println( entry.getKey()+": "+ entry.getValue());
        }
    }

    /*
    * Hash function k 4 components hute hain
    * key ---> jise value associated huti ha
    * value --> ye ksi key se mapped huti ha
    * bucket ---> hashmap k ander key and values array me store huti ha
    * hashcode ---> fixed size ka huta ha or jitna b bara input hu fix size ka output deta ha eik numerical value m
    *          ---> same input ka hamesha same output huga
    *
    *hash function is inbuilt hasfunction in java.
    * what is hash function ?
    * eik key paas krdi jati ha hash function me jise hashcode generate huta ha or hashcode ki help se hamen pata chalta ha k key value ko kaha store krna ha array me
    * calculating index :
    *   int index = hashCode % arraySize;
    *
    * 2 input ka same output askta ha ye kehlata ha collision because hashfunction ki apni eik duniya ha
    * jahan se finite number of hash codes hi aaskate hain jinki waja se do differnt keys k same hashcode aaskte h
    *   e.g: key = 'abc' --> hashcode --> 8 ,,   *   e.g: key = 'cba' --> hashcode --> 8 ,,
    *
    * har eik index per linkedlist store ha or collision anay per same index per linked list ki form me data store hujata ha 
     * */
}
