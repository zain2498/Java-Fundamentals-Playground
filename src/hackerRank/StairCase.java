package hackerRank;

public class StairCase {

    public void pattern(int n){

        for(int i=0; i < n; i++){

            //spaces
            for(int j=(n-1 - i); j > 0; j-- ){
                System.out.print(" ");
            }
            //print hash
            for(int k = 0; k <= i; k++ ){     //spaces 4, hash 1,
                System.out.print("#");      //
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        StairCase stairCase = new StairCase();
        stairCase.pattern(6);
    }

}
