import javax.swing.table.TableCellEditor;
import java.util.Arrays;

public class Anagram {

  public boolean areAnagrams(String str1, String str2){

      if(str1.equals("") || str2.equals("")){
          return false;
      }

      if(str1.isEmpty() || str2.isEmpty()){
          return false;
      }

      String toLowerCase1 = str1.toLowerCase();
      String toLowerCase2 = str2.toLowerCase();

      char[] char1 = toLowerCase1.toCharArray();
      char[] char2 = toLowerCase2.toCharArray();


      Arrays.sort(char1);
      Arrays.sort(char2);

      return Arrays.equals(char1,char2);
  }

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "abcdef";

        Anagram anagram = new Anagram();
        System.out.println(anagram.areAnagrams(str1,str2));
    }

}
