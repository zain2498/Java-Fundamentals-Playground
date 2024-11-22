import java.util.ArrayList;
import java.util.List;

public class NumberMagic {

    /**
     * This method returns all factors of a given number in an ArrayList.
     *
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public List<Integer> determineAllFactors(int number) {
        List<Integer> ls = new ArrayList<>();
        if (number <=0){
            return ls;
        }

        // TODO: Write your code here

        for(int i=1; i <= number; i ++){
            if(number % i == 0){
                ls.add(i);
            }
        }
            return ls;
    }

    public static void main(String args[]){
        NumberMagic nm = new NumberMagic();
        int num = 9;
        System.out.println(nm.determineAllFactors(num));

    }
}