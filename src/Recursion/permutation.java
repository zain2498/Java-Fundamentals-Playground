package Recursion;


public class permutation {

    public static void permString(String str, String permutation){

        int len = str.length();

        if(len ==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0; i < len; i++){

            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            String permChar = permutation + currChar;
            permString(newStr,permChar);
        }
    }

    public static void main(String args[]){
        String str = "abc";
        permString(str,"");

    }

}


