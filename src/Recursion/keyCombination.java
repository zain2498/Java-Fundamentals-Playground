package Recursion;

public class keyCombination {
    public static String[] keypad = {".","abc","def","ghi", "jkl", "mno", "pqr", "st", "uvwx", "yz"};

    public static void keypadCombination(String str, int index, String combination){

        if(index == str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(index);
        String mapping = keypad[currChar - '0'];

        for (int i = 0; i < mapping.length(); i++){
            combination = combination+mapping.charAt(i);
            keypadCombination(str,index+1, combination);
        }
    }

    public static void main(String args[]){
        String str = "34";
        keypadCombination(str,0,"");
    }
}
