package Recursion;

//find the first and last occurance of the element...
public class findOccurance {

    public static int first = -1;
    public static int last = -1;

    public static void findOcc(String str, int index, char element){

        if(index == str.length()){
            System.out.println("First character find at index "+first);
            System.out.println("Last character find at index "+last);
            return;
        }

        char currChar = str.charAt(index);
        if(currChar == element){
            if(first == -1){
                first = index;
            }else {
                last = index;
            }
        }

        findOcc(str,index+1,element); //recursive call

    }

    public static void main(String args[]){
        String str = "abaacdaefaah";
        findOcc(str,0,'a');
    }

}

//Time complexity is O(n) because we are traversing the whole string one by one bcx it depends on string len
