import java.util.Arrays;

public class variableArguement {

    void print(int... values){
        System.out.println(Arrays.toString(values));
    }

    public int sum(int... values){
        int sum =0;
        for(int value: values){
            sum+=value;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String args[]){
        variableArguement variableArguement = new variableArguement();
        variableArguement.print(1,2,3,4,5,6,7,8,9);
        variableArguement.sum(1,2,3,4,5,6,7,8,9);
    }

}




