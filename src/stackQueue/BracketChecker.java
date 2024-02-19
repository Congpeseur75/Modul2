package stackQueue;
import java.util.Stack;
public class BracketChecker {
    public static boolean checkBrackets(String expression) {
        Stack<Character> bracketStack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                bracketStack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (bracketStack.isEmpty()) {
                    return false; // Nếu stack rỗng và gặp dấu ngoặc đóng, không khớp
                }
                char top = bracketStack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Nếu dấu ngoặc mở không khớp với dấu ngoặc đóng
                }
            }
        }

        return bracketStack.isEmpty(); // Nếu stack rỗng sau khi duyệt xong, tất cả dấu ngoặc đã khớp
    }

    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        System.out.println("Expression 1 is well-formed: " + checkBrackets(expression1));

        String expression2 = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
        System.out.println("Expression 2 is well-formed: " + checkBrackets(expression2));

        String expression3 = "s * (s – a) * (s – b * (s – c)";
        System.out.println("Expression 3 is well-formed: " + checkBrackets(expression3));

        String expression4 = "s * (s – a) * s – b) * (s – c)";
        System.out.println("Expression 4 is well-formed: " + checkBrackets(expression4));

        String expression5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        System.out.println("Expression 5 is well-formed: " + checkBrackets(expression5));
    }
}
