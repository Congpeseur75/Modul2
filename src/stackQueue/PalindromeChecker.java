package stackQueue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        // Loại bỏ các ký tự không phải là chữ cái và chuyển đổi thành chữ thường
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Đưa các ký tự của chuỗi vào stack và queue
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        // So sánh từng cặp ký tự từ stack và queue
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palindrome = "Able was I ere I saw Elba";
        System.out.println("'" + palindrome + "' is a Palindrome: " + isPalindrome(palindrome));

        String nonPalindrome = "Hello World";
        System.out.println("'" + nonPalindrome + "' is a Palindrome: " + isPalindrome(nonPalindrome));
    }
}
