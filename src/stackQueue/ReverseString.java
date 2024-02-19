package stackQueue;
import java.util.Stack;
public class ReverseString {
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Pop characters from stack to build the reversed string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println("Original string: " + input);

        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
}
