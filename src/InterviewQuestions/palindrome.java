package InterviewQuestions;

public class palindrome {
    public static void main(String[] args) {
        String strInput = "A man, a plan, a canal, panama";
        if (isPalindrome(strInput)) {
            System.out.println("The given string is a palindrome");
        } else {
            System.out.println("The given string is a palindrome");
        }
    }

    public static boolean isPalindrome(String str){
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]","");
        String revString = new StringBuilder(cleanedStr).reverse().toString();

        if (cleanedStr.equalsIgnoreCase(revString)){
            return true;
        }
        return false;
    }
}
