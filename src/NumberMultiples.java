import java.util.ArrayList;
import java.util.List;

public class NumberMultiples {

    private List<Integer> numList = new ArrayList<> ();
    public List<Integer> determineMultiples(int number, int limit) {

        if(number <= 0){
            return numList;
        }

        int result = 0;

        for(int i =1; i <= limit ; i++){

            result = number *i;

            if(result < limit){
                numList.add(result);
            }

        }

        return numList;
    }

    public static void main (String[] args) {
        /* code */
        int num = 1 , limit = 20;;
        NumberMultiples numberMagic = new NumberMultiples();
        System.out.println(numberMagic.determineMultiples(num,limit));;
    }
}