package InterviewQuestions;

public class ReverseNumber {

    /*
    * Time: O(log₁₀ n) (one iteration per digit)
    * Space: O(1)
    * */

    public static int reverse(Integer number){
        int reverse = 0;

        while (number != 0){ //12345
            int currDigit = number % 10; //5
            reverse = reverse * 10 + currDigit; //0*10 + 5 = 5
            number = number / 10; //1234 --5 removed - 1234
        }

        return reverse;
    }
    public static void main(String args[]){
        int number = 12345;
        int result = reverse(number);
        System.out.println("Reverse order : "+ result);
    }
}
