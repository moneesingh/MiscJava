import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        System.out.println(isBalanced("(()){[]})"));
    }

    private static String isBalanced(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (openParanthesis(ch)){
                stack.push(ch);
            } else if (closeParanthesis(ch) && (!isPair(ch, stack))) {
                    return "Not balanced";
            }
        }
        return "balanced";
    }

    private static boolean openParanthesis(char ch) {
        if (ch == '(' || ch == '{' || ch == '[') {
            return true;
        }
        return false;
    }

    private static boolean closeParanthesis(char ch) {
        if (ch == ')' || ch == '}' || ch == ']') {
            return true;
        }
        return false;
    }

    private static boolean isPair(char ch, Stack stack) {
        char popped;
        if (!stack.isEmpty()) {
            popped = (char)stack.pop();
        } else {
            return false;
        }
        boolean ret;
        switch (popped) {
            case '(':
                ret = ch == ')' ? true : false;
                break;
            case '{':
                ret = ch == '}' ? true : false;
                break;
            case '[':
                ret = ch == ']' ? true : false;
                break;
            default:
                ret = false;
            }
        return ret;
    }
}
