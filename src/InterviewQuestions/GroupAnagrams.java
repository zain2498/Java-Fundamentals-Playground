package InterviewQuestions;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] str) {
        if (str == null || str.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();
        for (String s : str){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedKey = new String(charArr);

            map.putIfAbsent(sortedKey, new ArrayList<>());
            map.get(sortedKey).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] str = {"ate", "eat", "cartoon", "tea", "net", "ten"};
        System.out.println("Group Anagram");
        System.out.println(groupAnagrams(str));
    }
}
