package stackQueue;
import java.util.Stack;
public class DecimalToBinary {
    public static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();

        // Chuyển đổi từ dạng thập phân sang nhị phân bằng phép chia lấy dư cho 2
        while (decimal != 0) {
            int remainder = decimal % 2;
            stack.push(remainder);
            decimal /= 2;
        }

        // Đọc từ Stack và nối kết quả lại với nhau để tạo thành chuỗi nhị phân
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 30;
        System.out.println("Decimal number: " + decimalNumber);
        System.out.println("Binary number: " + decimalToBinary(decimalNumber));
    }
}
