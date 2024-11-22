//public class LongesWordFind {
//
//
//    public String findLongestWord(String sentence) {
//
//        if (sentence.isEmpty()) {
//            return "";
//        }
//
//        var strSplit = sentence.split(" ");
//        var longestWord = 0;
//
//        for (int i = 0; i < strSplit.length; i++) {
//            if (strSplit.length > longestWord) {
//                longestWord = strSplit[i].length();
//            }
//        }
//
//        return String.valueOf(longestWord);
//
//    }
//    public static void main(String args[]){
//        LongesWordFind longesWordFind = new LongesWordFind();
//        System.out.println(longesWordFind.findLongestWord("A quick brown fox jumps over the lazy dog"));
//    }
//}
//
//
