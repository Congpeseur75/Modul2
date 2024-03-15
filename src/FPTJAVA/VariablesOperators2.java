package FPTJAVA;

import java.util.Random;
import java.util.Scanner;

public class VariablesOperators2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("chọn bài");
            System.out.println("1. bai1");
            System.out.println("2. bai2");
            System.out.println("3. bai3");
            System.out.println("4. bai4");
            System.out.println("5. bai5");
            System.out.println("6. bai6");
            System.out.println("7. bai7");
            System.out.println("8. bai8");
            System.out.println("9. bai9");
            System.out.println("10. bai10");
            System.out.println("11. bai11");
            System.out.println("12. bai12");
            System.out.println("13. bai13");
            int choice = scanner.nextInt();
            if (choice == 1){
                calculationNumber();
            }
            else if (choice == 2){
                numberOneForSix();
            }
            else if (choice == 3){
                calculationDecimal();
            }
            else if (choice == 4){
                equationLevelTwo();
            }
            else if (choice == 5){
                AreaPerimeterCircle();
            }
            else if (choice == 6){
                Values();
            }
            else if (choice == 7){
                resultCalculation();
            }
            else if (choice == 8){
                pressStyle();
            }
            else if (choice == 9){
                pressStyle1();
            }
            else if (choice == 10){
                pressStyle2();
            }
            else if (choice == 11){
                pressStyleChange();
            }
            else if (choice == 12){
                distinguishTowPressStyle();
            }
            else if (choice == 13){
                useFLDAfterNumber();
            }
        }
    }
    public static void calculationNumber(){
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        if (a == 0 || b == 0){
            System.out.println("không chia hết đc cho 0");
        }
        else {
            System.out.println(a/b);
        }
    }
    public static void numberOneForSix(){
        Random random = new Random();
        int randomNumber = random.nextInt(6)+ 1;
        System.out.println(randomNumber);
    }
    public static void calculationDecimal(){
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float sum = a + b;
        System.out.println(sum);
    }
    public static void equationLevelTwo(){
        System.out.println("Nhập hệ số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c:");
        double c = scanner.nextDouble();

        // Giải phương trình bậc 2
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
    public static void AreaPerimeterCircle(){
        double radius = scanner.nextDouble();
        double Area = radius * radius * Math.PI;
        double Perimeter = 2 * radius * Math.PI;
        System.out.println("diện tích hình tròn là: " + Perimeter + "Chu vi hình tròn là: " + Area);
    }
    public static void Values(){
        int i = 1, j = 1;
        int a = i++ + j++ + i++ + j++;
        int b = ++i + ++j + i++ + j++;
        int c =  i++ + ++i - i-- - --i;
        System.out.println("giá trị của a là: " + a + "giá trị cua b là: " + b + "giá trị của c là: " + c);
    }
    public static  void resultCalculation(){
        //int i = 2;
        //System.out.println(i++);
        //System.out.println(++i);
        int i = 2;
        System.out.println("kết quả là: 3");
    }
    public static void pressStyle(){
        //Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        //byte->short->int->long->float->double"
        byte byteValue = 100;
        short shortValue = (short) byteValue;
        int intValue = (int) shortValue;
        long longValue = (long) intValue;
        float floatValue = (float) longValue;
        double doubleValue = (double) floatValue;
        System.out.println(doubleValue);
    }
    public static void pressStyle1(){
        //Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        //double -> float -> long -> int -> short -> byte
        double doubleValue = 3.14159;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;
        System.out.println(byteValue);
    }
    public static void pressStyle2(){
        double doubleValue = 3.14159;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;
        System.out.println(byteValue);
    }
    public static void pressStyleChange(){
        //Cho các ví dụ về ép kiểu mà độ chính xác  bị thay đổi, như thứ tự bên dưới:
        //double -> float -> long -> int -> short -> byte
        double doubleValue = 123.456;
        float floatValue = (float) doubleValue;
        long longValue = (long) floatValue;
        int intValue = (int) longValue;
        short shortValue = (short) intValue;
        byte byteValue = (byte) shortValue;
        System.out.println(byteValue);
    }
    public static void distinguishTowPressStyle(){
        //Phân biệt ép kiểu tường minh và ép kiểu ngầm định
        System.out.println("Ép kiêu tường mình(explicit casting) là: Đây là quá trình mà bạn thực hiện chủ định, khi bạn cung cấp mã để chuyển đổi giữa các kiểu dữ liệu. Trong ép kiểu tường minh, bạn cần sử dụng toán tử ép kiểu (type) expression");
        System.out.println("Ép kiểu ngầm định(implicit casting) là: Đây là quá trình mà trình biên dịch tự động thực hiện khi có thể chuyển đổi từ một kiểu dữ liệu sang kiểu dữ liệu khác mà không làm mất thông tin hoặc không gây ra lỗi. Ép kiểu ngầm định thường xảy ra khi chuyển từ kiểu dữ liệu có kích thước nhỏ hơn sang kiểu có kích thước lớn hơn.");
    }
    public static void useFLDAfterNumber(){
        //Khi nào cần dùng các ký tự L, F, D… sau các số nguyên, số thực trong Java?
        //Khi nào thì không cần dùng đến các ký tự này mà Java vẫn tự hiểu được các số thuộc kiểu dữ liệu gì?
        System.out.println("L (hoặc l): Được sử dụng sau một số nguyên để chỉ ra rằng giá trị đó thuộc kiểu dữ liệu long. Ví dụ: long number = 1000000L;");
        System.out.println("F (hoặc f): Được sử dụng sau một số thực để chỉ ra rằng giá trị đó thuộc kiểu dữ liệu float. Mặc dù không sử dụng F sau một số thực sẽ tạo ra một lỗi biên dịch, nhưng có thể sử dụng nếu cần thiết để làm rõ kiểu dữ liệu. Ví dụ: float number = 3.14f;");
        System.out.println("D (hoặc d): Được sử dụng sau một số thực để chỉ ra rằng giá trị đó thuộc kiểu dữ liệu double. Tương tự như F, không sử dụng D sau một số thực cũng sẽ được hiểu là kiểu dữ liệu double. Ví dụ: double number = 3.14;");

    }
}
