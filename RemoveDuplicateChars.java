
import java.util.Arrays;
import java.util.Comparator;

//This class removes duplicate characters from a string.
// The order of character are sorted in the output string.

public class RemoveDuplicateChars {
  public static void main(String [] args) {
    
    String str = "geeks for geeks";
    System.out.println(str);
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
    
    System.out.println(sb.toString());
  }
}