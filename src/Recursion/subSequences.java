package Recursion;

import java.util.HashSet;

public class subSequences {

    public static void subSeq(String str, int index, String newStr, HashSet<String> hashSet){
        if(index == str.length()){
            if(hashSet.contains(newStr)){
                return;
            }else {
                System.out.println(newStr);
                hashSet.add(newStr);
                return;
            }

        }
        char currChar = str.charAt(index);
        //to be
         subSeq(str,index+1,newStr+currChar,hashSet);

        //not to be
        subSeq(str, index+1,newStr,hashSet);
    }

    public static void main(String args[]){
        String str = "aaa";
        HashSet <String> hashSet = new HashSet<>();
        subSeq(str,0,"",hashSet);
    }
}

/*
number of elements is basically the power of 2 for example if 'abc'
then,
2^3 = 8 NO OF POSSIBLE COMBINATIONS.

function calls = 2^n + 2^n-1 + 2^n-2 +  2^n-3 +.... 1

Geometric progression formula : a(r^n -1) / r-1

so the time complexity of this function is O(2^n)


 */