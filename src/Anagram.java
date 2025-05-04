import javax.swing.table.TableCellEditor;
import java.util.Arrays;

public class Anagram {

    public boolean areAnagrams(String str1, String str2) {

        if (str1.equals("") || str2.equals("")) {
            return false;
        }

        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        String lowerCaseStr1 = str1.toLowerCase();
        String lowerCaseStr2 = str2.toLowerCase();

        char[] str1CharrArr = lowerCaseStr1.toCharArray();
        char[] str2CharrArr = lowerCaseStr2.toCharArray();

        Arrays.sort(str1CharrArr);
        Arrays.sort(str2CharrArr);

       return Arrays.equals(str1CharrArr, str2CharrArr);
    }

    public static void main(String[] args) {
        String str1 = "maryam";
        String str2 = "abcde";

        Anagram anagram = new Anagram();
        System.out.println(anagram.areAnagrams(str1, str2));
    }

}
