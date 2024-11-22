import java.util.List;
import java.util.Scanner;

public class test {


    public static String SerialNumber(String str) {
        boolean isSeriealNumber = false; //11.124.167
        String regex = "^[1-9]{3}\\.[1-9]{3}\\.[1-9]{3}$";
        String set1="";
        String set2="";
        String set3="";

        if(str.matches(regex)){
            set1 = str.substring(0,3);
            set2 = str.substring(4,7);
            set3 = str.substring(8,11);

            boolean isGreaterSet1 = checkLastDigit(set1);
            boolean isGreaterSet2 = checkLastDigit(set2);
            boolean isGreaterSet3 = checkLastDigit(set3);

            int sumSet1 = sumOfSets(set1);
            int sumSet2 = sumOfSets(set2);

            if( ((sumSet1%2)==0) && ((sumSet2%2)!= 0 && isGreaterSet1 && isGreaterSet2 && isGreaterSet3)){

                isSeriealNumber = true;
            }

        }else{

            return String.valueOf(isSeriealNumber);
        }

        return String.valueOf(isSeriealNumber);
    }

    public static boolean checkLastDigit(String nums){
        int secondLastDigit = Character.getNumericValue(nums.charAt(nums.length() - 2));
        int thirdLastDigit = Character.getNumericValue(nums.charAt(nums.length() - 3));
        int lastDigit = Character.getNumericValue(nums.charAt(nums.length() - 1));

        return lastDigit > secondLastDigit && lastDigit > thirdLastDigit;

    }
    public static int sumOfSets(String value){

        int sum =0;

        for(int i=0; i< value.length();i++){

            sum += Character.getNumericValue(value.charAt(i));
        }

        return sum;
    }

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("please enter number : ");
        System.out.print(SerialNumber(s.nextLine()));
    }


    //System.out.println(getLastDigit(12345677));

//        String word = "hello"; //a, e , i, o, u
//        System.out.println(VowelCount(word));

//    public static String VowelCount(String str) {
//
//        char[] characters = str.toCharArray();
//        int count = 0;
//
//        for(char ch : characters){
//
//            if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u'){
//                count +=1;
//            }
//        }
//
//        return String.valueOf(count);
//
//    }

//    static int getLastDigit(int num){
//        if(num<0)
//        {
//            return 0;
//        }
//        else {
////           String numString= Integer.toString(num);
////           int len=numString.length();
////           return num %len;
//
//            return  num % 100;
//        }
//    }


//        System.out.println("Please enter the amount in figures");
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        String value = String.valueOf(num);
//        char[] characters = value.toCharArray();
//        for (char character : characters) {
//            System.out.println(character);
//        }
//
//        String units;
//        char numVal;
//        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//        String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety",};
//        String[] tensPower = {"Hundred", "Thousand",};
//
//        int index;
//        int len = characters.length;
//
//        if (characters.length < 0) {
//            units = "";
//            System.out.println("no value");
//        }
//
//        for (int i = 0; i < len; i++) {
//            index = len - i;
//            if (i == index) {
//                units = "units";
//                numVal = characters[index];
//                System.out.println();
//            } else if (i == index) {
//                units = "Ty";
//                numVal = characters[index];
////                System.out.print(numVal+" "+units);
//            } else if (i == index) {
//                units = "Hundred";
//                numVal = characters[index];
////                System.out.print(numVal+" "+units);
//            } else if (i == index) {
//                units = "Thousands";
//                numVal = characters[index];
////                System.out.print(numVal+" "+units);
//            } else if (i == index) {
//                units = "Ten Thousands";
//                numVal = characters[index];
////                System.out.print(numVal+" "+units);
//            } else if (i == index) {
//                units = "Lacs";
//                numVal = characters[index];
////                System.out.print(numVal+" "+units);
//            }
////            else {
////                System.out.println("Amount is exceeding the limit");
////            }
//        }
//
//
//    }
}



//500

// five hundred