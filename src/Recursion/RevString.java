package Recursion;

public class RevString {

    public static void strRev(String str, int idx){

        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        strRev(str,idx-1);

    }

    public static void main(String args[]){
        String str = "zain";
        strRev(str,str.length()-1);
        System.out.println(Thread.currentThread().getState());
    }
}