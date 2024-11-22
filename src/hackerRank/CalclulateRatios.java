package hackerRank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;

public class CalclulateRatios {

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int zeros=0;
        int negValue=0;
        int posValue =0;

        Formatter fm = new Formatter();

        for(int value : arr){

            if(value < 0){
                negValue += 1;
            }else if(value ==0){
                zeros  += 1;
            }else{
                posValue +=1;
            }
        }

        String zeroOccurrence = String.format("%.6f", (double) zeros / n);
        String posOccurrence = String.format("%.6f", (double) posValue / n);
        String negOccurrence = String.format("%.6f", (double) negValue / n);


        List<String> list = new ArrayList<>();
        list.add(posOccurrence);
        list.add(negOccurrence);
        list.add(zeroOccurrence);

        for(String num : list){
            System.out.println(num);
        }

    }

    public static void main(String[] args) {
        CalclulateRatios obj = new CalclulateRatios();
        List<Integer> list =  new ArrayList<>(Arrays.asList(-6,3,-9,0,4,1));
        obj.plusMinus(list);
    }
}
