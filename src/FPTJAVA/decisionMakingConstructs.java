package FPTJAVA;

import java.util.Scanner;

public class decisionMakingConstructs {
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
            int choice = scanner.nextInt();
            if (choice == 1){
                checkAge();
            }
            else if (choice == 2){
                checkNumberEvenOrOdd();
            }
            else if (choice == 3){
                checkPointStudent();
            }
            else if (choice == 4){
                totalRevenue();
            }
            else if (choice == 5){
                detectButton();
            }
            else if (choice == 6){
                chooseTheCorrectAnswer();
            }
            else {
                break;
            }
        }
    }
    public static void checkAge(){
        //Viết chương trình Java để cho phép người dùng nhập tuổi của họ. Sau đó chương trình sẽ hiển thị xem người đó có đủ điều kiện để bỏ phiếu hay không. Người đủ điều kiện bầu cử phải lớn hơn hoặc bằng 18 tuổi.
        int age = scanner.nextInt();
        if (age >= 18 ){
            System.out.println("độ tuổi là: " + age + "đủ điều kiện bầu cử");
        }
        else {
            System.out.println("độ tuổi là: " + age + "không đủ điều kiện bâu cử");
        }
    }
    public static void checkNumberEvenOrOdd(){
        //Viết chương trình Java để xác định xem một số đầu vào có phải là số chẵn hay không
        int number = scanner.nextInt();
        if (number / 2 == 0){
            System.out.println(number + "là số chẵn");
        }
        else {
            System.out.println(number + "là số lẻ");
        }
    }
    public static void checkPointStudent(){
        //Viết một chương trình Java để xác định điểm của học sinh.
        int midtermScore = scanner.nextInt();
        int testMarks = scanner.nextInt();
        int finalGrade = scanner.nextInt();
        double avg = (double)(midtermScore + testMarks + finalGrade) / 3;
        if(avg >= 90){
            System.out.println(avg + "điểm của học sinh này là A");
        }
        else if (avg >= 70){
            System.out.println(avg + "điểm của học sinh này là B");
        }
        else if (avg >= 50){
            System.out.println(avg + "điểm của hoc sinh là C");
        }
        else {
            System.out.println(avg + "điểm của học sinh này là D");
        }
    }
    public static void totalRevenue(){
        //Viết chương trình Java để tính toán doanh thu từ việc bán hàng dựa trên đơn giá và số lượng sản phẩm mà người dùng nhập vào.
        //Tỷ lệ chiết khấu là 10% cho số lượng mua từ 100 đến 120 chiếc và 15% cho số lượng mua lớn hơn 120 chiếc. Nếu số lượng mua dưới 100 chiếc, mức chiết khấu là 0%
        int unitPrice = scanner.nextInt();
        int quantity = scanner.nextInt();
        int revenue = quantity * unitPrice;
        int discount;
        double sumRevenue;
        if (quantity > 120){
            discount = revenue / 100 * 15;
            sumRevenue = revenue -discount;
            System.out.println("tổng tiền sau khi chiết khấu là: " + sumRevenue  + "tiên chiết khấu là: " + discount + "doanh thu khi chưa chiếc khấu là: " + revenue);
        }
        else if (quantity > 110){
            discount = revenue / 100 * 10;
            sumRevenue = revenue - discount;
            System.out.println("tổng tiền sau khi chiết khấu là: " + sumRevenue  + "tiên chiết khấu là: " + discount + "doanh thu khi chưa chiếc khấu là: " + revenue);
        }
        else {
            sumRevenue = revenue;
            System.out.println("tổng doanh thu là: " + sumRevenue);
        }
    }
    public static void detectButton(){
        //Viết chương trình Java để phát hiện các phím bấm.
        //Nếu người dùng nhấn các phím số (từ 0 đến 9), chương trình sẽ cho biết số được nhấn, ngược lại, chương trình sẽ hiển thị "Không được phép"
        int button = scanner.nextInt();
        if (button == 0){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 1){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 2){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 3){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 4){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 5){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 6){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 7){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 8){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else if (button == 9){
            System.out.println("số bạn nhấn có phím là: " + button);
        }
        else {
            System.out.println("không được phép bấm");
        }

        switch (button){
            case 1:
                System.out.println("số bạn nhập từ bàn phím là 1");
                break;
            case 2:
                System.out.println("số bạn nhập từ bàn phím là 2");
                break;
            case 3:
                System.out.println("số bạn nhập từ bàn phím là 3");
                break;
            case 4:
                System.out.println("số bạn nhập từ bàn phím là 4");
                break;
            case 5:
                System.out.println("số bạn nhập từ bàn phím là 5");
                break;
            case 6:
                System.out.println("số bạn nhập từ bàn phím là 6");
                break;
            case 7:
                System.out.println("số bạn nhập từ bàn phím là 7");
                break;
            case 8:
                System.out.println("số bạn nhập từ bàn phím là 8");
                break;
            case 9:
                System.out.println("số bạn nhập từ bàn phím là 9");
                break;
            default:
        }
        if (button <= 9){
            System.out.println("số bạn nhập từ bàn phím là: " + button);
        }
    }
    public static void chooseTheCorrectAnswer(){
        //Viết một chương trình Java cho phép người dùng chọn câu trả lời đúng của một câu hỏi.
        while(true){
            System.out.println("Cách chính xác để khai báo một biến để lưu trữ một giá trị số nguyên trong Java là gì?");
            System.out.println("A.  int 1x = 10");
            System.out.println("B. int x = 10;");
            System.out.println("C. float x = 10.0f;");
            System.out.println("D.  chuỗi x = 10");
            String chooser = scanner.nextLine();
            if (chooser.equalsIgnoreCase("B")){
                System.out.println("B là đáp án Chính xác");
                break;
            }
            else {
                System.out.println("sai! vui lòng thử lại.");
            }
        }
    }
}
