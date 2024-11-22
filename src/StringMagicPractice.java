public class StringMagicPractice {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // TODO: Write your code here
        int len = str.length();
        System.out.println("the length of str is "+len);

        if(str.isEmpty()){
            return -1;
        }
        int num = -1;
        for(int i=0; i < len; i++){
            char currChar = str.charAt(i);

            if(Character.isDigit(currChar)){
                num = Integer.parseInt(String.valueOf(currChar));
            }
        }
        return num;

    }

    public static void main (String[] args) {

        String str = "hello2world5";
        StringMagicPractice StringMagic = new StringMagicPractice();
        int digit = StringMagic.getRightmostDigit(str);
        System.out.println("following is the digit: "+ digit);
    }
}