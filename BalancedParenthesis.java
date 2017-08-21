import java.util.Stack;

public class BalancedParenthesis {
  
  public static void main (String [] args) {
    String str = "{([({)])}";
    System.out.println(str + " is balanced: " + isBalanced(str));
    
  }
  
  public static boolean isBalanced(String str) {
    Stack<Character>st = new Stack<>();
    for(int i=0; i<str.length(); i++) {
      char ch = str.charAt(i);
      if (ch=='{' || ch=='(' || ch=='[') 
        st.push(ch);
      else if (ch=='}' || ch==')' || ch==']') {
        char chPair = st.pop();
        if (!checkMatch(chPair, ch))
          return false;
      }
    }
  return true;  
  }
  
  public static boolean checkMatch(char ch1, char ch2) {
    if (ch1 == '(' && ch2 == ')')  
      return true;
    if (ch1 == '{' && ch2 == '}')
      return true;
    if (ch1 == '[' && ch2 == ']')
      return true;
    return false;
  }
  
  
}