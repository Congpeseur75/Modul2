package bai1;

import java.util.Scanner;
public class Untitel {
    public static void main(String[] args) {
        double vnd = 23000;
        double  usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD:");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.print("Giá trị VND: " + quydoi);
    }
}
