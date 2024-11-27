package AppliedProgramming;


public class SecondHighestElementWithArray {

    public static char findOccurance(String str, int[] count) {
        for (char ch : str.toCharArray()){
            count[ch]++;
        }

        int highest=0;
        int secondHighest=0;

        for(int c : count){
            if(c > highest){
                secondHighest = highest;
                highest = c;
            }else if (c > secondHighest && c < highest){
                secondHighest = c;
            }
        }

        for (int i=0; i < count.length-1; i++){
            if (count[i] == secondHighest){
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
            System.out.println("secondHighest value "+res);
        }else {
            System.out.println("there is no second highest value in the string ");
        }
        System.out.println(res);
    }
}


