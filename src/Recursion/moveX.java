package Recursion;

public class moveX {

    public static void movXAll(String str, int index, int count, String newString){

        if(index == str.length()){

            for (int i =0 ; i < count; i ++){
                newString = newString + 'x';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index);

        if(currChar == 'x'){
            count++;
            movXAll(str,index+1,count,newString);
        }else {
            newString = newString + currChar;
            movXAll(str,index+1,count,newString);
        }

    }

    public static void main (String args[]){
        String str = "axbcxxd";
        movXAll(str,0,0,"");
    }
}


//Time complexity is O(n + count)
// which is O(n + n) => O(2n)
//but in asymptotic term we remove constant so,
//The time complexity is O(n).