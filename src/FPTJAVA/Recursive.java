package FPTJAVA;

import java.util.Scanner;

public class Recursive {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine());
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                for (int i = 0; i < n; i++) {
                    System.out.print(fibonacci(i) + " ");
                }
                break;
            case 2:
                int result = factorial(n);
                System.out.println("Factorial of " + n + " is: " + result);
                break;
            case 3:
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());

                System.out.println("USCLN của " + a + " và " + b + " là: " + uscln(a, b));
                System.out.println("BSCNN của " + a + " và " + b + " là: " + bscnn(a, b));
                break;
            case 4:
                int[] numbers = {1, 2, 3, 4, 5}; // Dãy số

                int results = sum(numbers, n);
                System.out.println("Tổng của các số là: " + results);
                break;
            case 5:
                int number = 12345; // Số nguyên dương cần đảo ngược
                System.out.println("Số nguyên dương ban đầu: " + number);
                int reversedNumber = reverse(number);
                System.out.println("Số nguyên dương sau khi đảo ngược: " + reversedNumber);
                break;
            case 6:
                int number1 = 12345; // Số nguyên dương cần đếm số lượng chữ số
                int count = countDigits(number1);
                System.out.println("Số lượng chữ số trong số " + number1 + " là: " + count);
                break;
            case 7:
                int max = findMaxDigit(n);
                System.out.println("Chữ số lớn nhất trong số " + n + " là: " + max);
                break;
            case 8:
                int result1 = integerLog2(n);
                System.out.println("Giá trị nguyên logarit cơ số 2 của " + n + " là: " + result1);
            case 9:
                System.out.println("Hệ nhị phân của " + n + " là: " + decimalToBinary(n));
                break;
            case 10:
                int firstDigit = findFirstDigit(n);
                System.out.println("Chữ số đầu tiên của số " + n + " là: " + firstDigit);
                break;
            case 11:
                int result2 = calculateSum(n);
                System.out.println("Tổng S(" + n + ") là: " + result2);
                break;
            case 12:
                double result3 = calculateSums(n);
                System.out.println("Tổng S(" + n + ") là: " + result3);
                break;
            case 13:
                int result4 = calculateSum1(n);
                System.out.println("Tổng S(" + n + ") là: " + result4);
            default:
                System.out.println("exit");
                break;
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int uscln(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return uscln(b, a % b);
        }
    }

    // Hàm tính BSCNN sử dụng đệ quy
    public static int bscnn(int a, int b) {
        return (a * b) / uscln(a, b);
    }

    public static int sum(int[] numbers, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return numbers[n - 1] + sum(numbers, n - 1);
        }
    }

    //in dãy số đảo ngược.
    public static int reverse(int number) {
        return reverseHelper(number, 0);
    }

    public static int reverseHelper(int number, int reversedNumber) {
        if (number == 0) {
            return reversedNumber;
        } else {
            int digit = number % 10;
            int newReversedNumber = reversedNumber * 10 + digit;
            return reverseHelper(number / 10, newReversedNumber);
        }
    }

    //đếm số lượng đệ quy
    public static int countDigits(int number) {
        if (number < 10) {
            return 1; // Nếu số chỉ có một chữ số
        } else {
            return 1 + countDigits(number / 10); // Đếm chữ số hiện tại và gọi đệ quy với số bị giảm đi một chữ số
        }
    }

    // Hàm tìm chữ số lớn nhất sử dụng đệ quy
    public static int findMaxDigit(int n) {
        if (n < 10) {
            return n; // Trường hợp cơ bản: số n chỉ có một chữ số
        } else {
            int lastDigit = n % 10; // Lấy chữ số cuối cùng của số n
            int remainingDigitsMax = findMaxDigit(n / 10); // Tìm chữ số lớn nhất trong số còn lại (không bao gồm chữ số cuối cùng)
            return Math.max(lastDigit, remainingDigitsMax); // So sánh chữ số cuối cùng với chữ số lớn nhất trong số còn lại
        }
    }

    // Hàm tính giá trị nguyên logarit cơ số 2 sử dụng đệ quy
    public static int integerLog2(int n) {
        return integerLog2Helper(n, 0);
    }

    public static int integerLog2Helper(int n, int count) {
        if (n <= 1) {
            return count; // Kết thúc đệ quy khi n đạt đến hoặc nhỏ hơn 1
        } else {
            return integerLog2Helper(n / 2, count + 1); // Gọi đệ quy với n/2 và tăng biến đếm lên 1
        }
    }

    // Hàm chuyển đổi sang hệ nhị phân sử dụng đệ quy
    public static String decimalToBinary(int n) {
        if (n == 0) {
            return "0"; // Trường hợp cơ bản: nếu n = 0, hệ nhị phân cũng là 0
        } else {
            return decimalToBinaryHelper(n); // Gọi hàm trợ giúp để thực hiện chuyển đổi
        }
    }

    public static String decimalToBinaryHelper(int n) {
        if (n == 0) {
            return ""; // Trường hợp cơ bản: kết thúc đệ quy khi n = 0
        } else {
            return decimalToBinaryHelper(n / 2) + n % 2; // Gọi đệ quy với n/2 và nối kết quả với phần dư khi chia cho 2
        }
    }

    // Hàm tìm chữ số đầu tiên sử dụng đệ quy
    public static int findFirstDigit(int n) {
        if (n < 10) {
            return n; // Trường hợp cơ bản: số n chỉ có một chữ số
        } else {
            return findFirstDigit(n / 10); // Gọi đệ quy với số bị giảm đi một chữ số
        }
    }

    // Hàm tính tổng sử dụng đệ quy
    public static int calculateSum(int n) {
        if (n == 1) {
            return 1; // Trường hợp cơ bản: nếu n = 1, trả về 1
        } else {
            return (2 * n + 1) + calculateSum(n - 1); // Gọi đệ quy với n - 1 và cộng với (2n + 1)
        }
    }

    // Hàm tính tổng sử dụng đệ quy
    public static double calculateSums(int n) {
        if (n == 1) {
            return 1.0; // Trường hợp cơ bản: nếu n = 1, trả về 1
        } else {
            return calculateFactorial(2 * n - 1) + calculateSums(n - 1); // Gọi đệ quy với n - 1 và cộng với 1/(2n - 1)!
        }
    }

    // Hàm tính giai thừa
    public static double calculateFactorial(int num) {
        if (num == 1) {
            return 1.0; // Trường hợp cơ bản: nếu num = 1, trả về 1
        } else {
            return num * calculateFactorial(num - 1); // Gọi đệ quy để tính giai thừa của num
        }
    }

    // Hàm tính tổng sử dụng đệ quy
    public static int calculateSum1(int n) {
        if (n == 1) {
            return 1; // Trường hợp cơ bản: nếu n = 1, trả về 1
        } else {
            return n * n + calculateSum1(n - 1); // Gọi đệ quy với n - 1 và cộng với n^2
        }
    }
}
