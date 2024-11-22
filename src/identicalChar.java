public class identicalChar {
    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {

        // TODO: Write your code here
        boolean check = false;
        int len = str.length();

        if(len == 0){
            return check;
        }

        for(int i=0; i < len-1; i ++){

            int char1 = str.charAt(i);
            int char2 = str.charAt(i+1);

            if(str.charAt(i) != str.charAt(i+1)){
                check = false;
            }else{
                check = true;
                return check;
            }
        }
        
        return check;
    }

    public static void main (String[] args) {
        /* code */
        identicalChar stringMagic = new identicalChar();
        boolean check = stringMagic.hasConsecutiveDuplicates("cartoon");
        System.out.println(check);

    }
}
