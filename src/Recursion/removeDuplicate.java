package Recursion;

//to remove duplicacy from string using recursion
public class removeDuplicate {

    public static boolean[] map = new boolean[26];

    public static void removeDuplicacy(String str, int index, String newString){

        if (index == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(index);
        if(map[currChar - 'a']){
            removeDuplicacy(str,index+1,newString);

        }else {
            newString += currChar;
            map[currChar-'a'] = true;
            removeDuplicacy(str,index+1,newString);
        }
    }

    public static void main(String args[]){
        String str = "abbccda";
        removeDuplicacy(str,0,"");
    }
}


//Time complexity is O(n) bcx we are traversing a complete string.