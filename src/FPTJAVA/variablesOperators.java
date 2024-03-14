package FPTJAVA;
import java.util.Scanner;

import java.util.Scanner;

public class variablesOperators {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
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
            System.out.println("14. bai14");
            System.out.println("0. enter close");
            int choice = scanner.nextInt();
            if (choice == 1){
                displayNumber();
            }
            else if (choice == 2){
                displayName();
            }
            else if(choice == 3){
                equationDegreeFirst();
            }
            else if (choice == 4){
                valuesVariables();
            }
            else if (choice == 5){
                convertNumber();
            }
            else if (choice == 6){
                valuesA();
            }
            else if (choice == 7){
                valuesB();
            }
            else if (choice == 8){
                valuesC();
            }
            else if (choice == 9){
                valuesD();
            }
            else if(choice == 10){
                pressStyle();
            }
            else if (choice == 11){
                noPressStyle();
            }
            else if (choice == 12){
                pressStyleChange();
            }
            else if (choice == 13){
                distinguishTowPressStlyle();
            }
            else if (choice == 14){
                useFLDAfterNumber();
            }
            else if (choice == 0){
                System.out.println("kết thúc chương trình");
            }
            System.out.println("kết thúc");
        }
    }
    public static void displayNumber(){
        //Viết chương trình Java để khai báo hai biến số nguyên, một biến float và một biến chuỗi và gán lần lượt 10, 12.5 và "Lập trình Java" cho chúng. Sau đó, hiển thị các giá trị của chúng trên màn hình
        int a = 10;
        float b = 12.5f;
        System.out.println("số nguyên là: " + a + "số thực là: " + b);
    }
    public static void displayName(){
        //Viết chương trình Java bằng cách sử dụng lớp Scanner để nhập tên , họ từ bàn phìm và sau đó  sẽ được hiển thị lên console
        String name = scanner.nextLine();
        System.out.println(name);
    }
    public static void  equationDegreeFirst(){
        //Giải phương trình bậc 1
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double x = (double) -b / a;
            System.out.println("Nghiệm của phương trình là: " + x);
        }
        scanner.close();
    }
    public static void valuesVariables(){
        //Tính giá trị của biến:
        //                     boolean a = true&&false;
        //                     boolean b = (3 > 100) || (25%5 == 0)
        //                     boolean c = a && b;
        //                     boolean d = !a || b;
        boolean a = false;  // a = false
        boolean b = true;  // b = false || true = true
        boolean c = false;  // c = false && true = false
        boolean d = true;  // d = !false || true = true

        System.out.println("Giá trị của a là: " + a);
        System.out.println("Giá trị của b là: " + b);
        System.out.println("Giá trị của c là: " + c);
        System.out.println("Giá trị của d là: " + d);
    }
    public static void convertNumber(){
        //Nhập vào 2 số nguyên, lưu vào 2 biến a và b. Sau đó, đảo giá trị của 2 biến này rồi xuất giá trị của chúng ra màn hình console.
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp = a;
            a = b;
            b = temp;
        System.out.println("giá trị của a là: " + a + "giá trị của b là: " + b);
    }
    public static void valuesA(){
        //Tính giá trị của a:
        //int i = 1; j = 1;
        //a = i++ + j++;
        int i = 1, j = 1;
        int a = (i++) + (j++);
        System.out.println(a);
    }
    public static void valuesB(){
        //Assignment  7:
        //Tính giá trị của a:
        //int i = 1; j = 1;
        //a = i++ + ++j;
        int i = 1, j = 1;
        int b = (i++) + (++j);
        System.out.println(b);
    }
    public static void valuesC(){
        //Tính giá trị của a:
        //int i = 1; j = 1;
        //a = ++i + j++;
        int i = 1, j = 1;
        int c= (++i) + (j++);
        System.out.println(c);
    }
    public static void valuesD(){
        //Tính giá trị của a:
        //int i = 1; j = 1;
        //a = ++i + ++j;
        int i = 1, j = 1;
        int d = (++i) + (++j);
        System.out.println(d);
    }
    public static void pressStyle(){
        //Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        //byte->short->int->long->float->double"
        byte byteValue = 100;
        short shortValue = (short) byteValue;
        int intValue = shortValue;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        System.out.println(doubleValue);
    }
    public static void noPressStyle(){
        //Cho các ví dụ về ép kiểu mà độ chính xác không bị thay đổi, như thứ tự bên dưới:
        //double -> float -> long -> int -> short -> byte
        double doubleValue = 123.456;
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
    public static void distinguishTowPressStlyle(){
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
