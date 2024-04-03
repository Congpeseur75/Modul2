package FPTJAVA;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackAndQueue {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                sumOfNNumbers();
                break;
            case 2:
                String input = "Hello, world!";
                String reversed = reverseString(input);
                System.out.println("Chuỗi ban đầu: " + input);
                System.out.println("Chuỗi đảo ngược: " + reversed);
                break;
            case 3:
                String expression = "4 5 - 3 2 / + 5 *";
                double result = evaluateExpression(expression);
                System.out.println("Giá trị của biểu thức là: " + result);
                break;
            case 4:
                System.out.print("Nhập số nguyên dương trong hệ thập phân: ");
                int decimalNumber = scanner.nextInt();

                String octalNumber = convertDecimalToOctal(decimalNumber);
                System.out.println("Số nguyên dương " + decimalNumber + " trong hệ bát phân là: " + octalNumber);
                break;
            case 5:
                System.out.print("Nhập số nguyên dương trong hệ thập phân: ");
                int decimalNumbers = Integer.parseInt(scanner.nextLine());

                String binaryNumber = convertDecimalToBinary(decimalNumbers);
                System.out.println("Số nguyên dương " + decimalNumbers + " trong hệ nhị phân là: " + binaryNumber);
                break;
            case 6:
                String postfixExpression = "2 3 4 + * 5 - 2 2 * +";
                double results = evaluatePostfix(postfixExpression);
                System.out.println("Giá trị của biểu thức hậu tố là: " + results);
                break;
        }
    }
    public static void  sumOfNNumbers(){
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        // Nhập các số vào hàng đợi và ngăn xếp
        System.out.println("Nhập " + n + " số:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            queue.offer(num); // Thêm vào hàng đợi
            stack.push(num); // Thêm vào ngăn xếp
        }

        // Tính tổng từ hàng đợi
        int sumFromQueue = 0;
        while (!queue.isEmpty()) {
            sumFromQueue += queue.poll(); // Lấy phần tử ra khỏi hàng đợi và cộng vào tổng
        }

        // Tính tổng từ ngăn xếp
        int sumFromStack = 0;
        while (!stack.isEmpty()) {
            sumFromStack += stack.pop(); // Lấy phần tử ra khỏi ngăn xếp và cộng vào tổng
        }

        System.out.println("Tổng từ hàng đợi: " + sumFromQueue);
        System.out.println("Tổng từ ngăn xếp: " + sumFromStack);
    }
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();

        // Push mỗi ký tự của chuỗi vào ngăn xếp
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Tạo chuỗi mới từ các ký tự đã được pop từ ngăn xếp
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
    public static double evaluateExpression(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                // Nếu là số, đưa vào Stack
                stack.push(Double.parseDouble(token));
            } else {
                // Nếu là toán tử, thực hiện phép toán tương ứng
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperation(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        // Kết quả cuối cùng là giá trị còn lại trên Stack
        return stack.pop();
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double performOperation(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0)
                    return operand1 / operand2;
                else
                    throw new ArithmeticException("Division by zero!");
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public static String convertDecimalToOctal(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0"; // Nếu số nguyên là 0, trả về "0" ở hệ bát phân
        }

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        // Chia số nguyên cho 8 và lưu lại phần dư vào Stack
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 8;
            stack.push(remainder);
            decimalNumber /= 8;
        }

        // Đẩy các phần dư từ Stack vào Queue để đảo ngược thứ tự
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Tạo chuỗi kết quả từ các phần tử trong Queue
        StringBuilder octalNumber = new StringBuilder();
        while (!queue.isEmpty()) {
            octalNumber.append(queue.poll());
        }

        return octalNumber.toString();
    }

    public static String convertDecimalToBinary(int decimalNumber) {
        if (decimalNumber == 0) {
            return "0"; // Nếu số nguyên là 0, trả về "0" ở hệ nhị phân
        }

        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        // Chia số nguyên cho 2 và lưu lại phần dư vào Stack
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber /= 2;
        }

        // Đẩy các phần dư từ Stack vào Queue để đảo ngược thứ tự
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Tạo chuỗi kết quả từ các phần tử trong Queue
        StringBuilder binaryNumber = new StringBuilder();
        while (!queue.isEmpty()) {
            binaryNumber.append(queue.poll());
        }

        return binaryNumber.toString();
    }

    public static double evaluatePostfix(String postfixExpression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = postfixExpression.split(" ");
        for (String token : tokens) {
            if (isNumerics(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                double result = performOperations(token.charAt(0), operand1, operand2);
                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static boolean isNumerics(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static double performOperations(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0)
                    return operand1 / operand2;
                else
                    throw new ArithmeticException("Division by zero!");
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


}
