public class StringMagic {

    public int countUppercaseLetters(String str) {
        // TODO: Write your code here
        
        int len = str.length();
        System.out.println("length of String "+ len);

        int count = 0;

        if(len == 0){
            return count;
        }// end of if statement


        for(int i =0; i < str.length(); i++){

            char currChar = str.charAt(i); //currChar we get,

            if(Character.isUpperCase(currChar)){
                count = count + 1;
            }

        }//end of for loop

        return count;

    }// end of function

    public static void main (String[] args) {

         StringMagic strMagic = new StringMagic();

        int countLetters = strMagic.countUppercaseLetters("this string is full of lowercase letters");

        System.out.println(countLetters);
    }

}


