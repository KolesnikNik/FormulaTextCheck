import java.util.Stack;

public class BracketChecker {
    public static Boolean test(String str){
        Stack<Character> borders = new Stack<>();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++){
            if(chars[i]==')' && borders.isEmpty()) return false;
            else if(chars[i]==')' && chars[i-1]=='(') return false;
            else if(chars[i]=='(') borders.push('(');
            else if(chars[i]==')' && borders.peek() == '(') borders.pop();
        }
        return borders.isEmpty();
    }
}
