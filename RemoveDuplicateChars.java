import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.LinkedHashSet;

//This class removes duplicate characters from a string.
//The order of character are sorted in the output string.


public class RemoveDuplicateChars {
  public static void main(String [] args) {
    
    String str = "geeks for geeks";  //eebnggh
    System.out.println(str);
    System.out.println(removeUsingSort(str));
    System.out.println(removeUsingSet(str));
  }
    
    public static String removeUsingSort(String str) {
      Character [] chars = new Character [str.length()];
      for(int i=0; i<str.length(); i++) {
        chars[i] = str.charAt(i); 
      }
      Arrays.sort(chars, new Comparator<Character>() {
        public int compare(Character ch1, Character ch2) {
          return Character.compare(Character.valueOf(ch1),Character.valueOf(ch2));
        }
      });
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<chars.length; i++) {
        while(i<chars.length-1 && chars[i]==chars[i+1])
          i++;
        sb.append(chars[i]); 
      }
      return sb.toString();
    }
    
    public static String removeUsingSet(String str) {
      Set<Character> set = new LinkedHashSet<Character>();
      StringBuilder sb = new StringBuilder();
      for(int i=0; i<str.length(); i++) {
        char ch = str.charAt(i);
        if (!set.contains(ch)) {
          set.add(ch); 
          sb.append(ch);
        }
      }
      return sb.toString();
    }
}