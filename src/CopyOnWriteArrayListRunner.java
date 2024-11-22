import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListRunner {

    /*
        in this approach it only synchornizes the add operation because copyOnWriteArrayList can copy the entire array
        and while its copy all the threads are reading from the old array and once its done
     */


    public static void addArray(){
        List<String> list = new CopyOnWriteArrayList<>();
        //Thread - 3
        list.add("Bat");
        list.add("Cat");
        list.add("Rat");

        getArray(list);
    }

    public static void getArray(List<String> list){
        //Threads - 1000
        for(String element:list){
            System.out.println(element);
        }
    }


    public static void main(String[] args) {

        addArray(); // this wiull
    }



}
