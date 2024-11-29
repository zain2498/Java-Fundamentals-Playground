package AppliedProgramming;


public class SecondHighestElementWithArray {

    public static char findOccurance(String str, int[] count) {

        for (char c : str.toCharArray()){
            count[c]++;
        }
        int highest = 0;
        int secondHighest = 0;
        for (int c : count){
            if(c > highest){
                secondHighest = highest;
                highest = c;
            } else if (c > secondHighest && c < highest) {
                secondHighest = c;
            }
        }

        for (int i =0; i < count.length; i++){
            if(secondHighest == count[i]){
                return (char) i;
            }
        }
        return '\0';

    }
    public static void main(String[] args) {
        String str = "yesmynameiszain";
        int[] count = new int[255];
        char res = findOccurance(str,count);
        if(res != '\0'){
            res = findOccurance(str,count);
        }else{
            System.out.println("there is no second highest");
        }
        System.out.println(res);
    }
}


