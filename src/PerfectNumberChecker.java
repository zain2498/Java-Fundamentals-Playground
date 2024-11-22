public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {

        if(number <=0){
            return false;
        }

        int sum=0;
        for (int i =1; i < number ; i++){

            if(number % i == 0 ){
                sum = sum + i;
            }
        }

        if(sum == number){
            return true;
        }else{
            return false;
        }

    }

    public  static void main(String args[]){
        PerfectNumberChecker obj = new PerfectNumberChecker();
        System.out.println(obj.isPerfectNumber(29));
    }
}

