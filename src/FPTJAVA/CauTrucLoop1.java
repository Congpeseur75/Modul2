package FPTJAVA;

import java.util.Scanner;

public class CauTrucLoop1 {
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
            int choice = scanner.nextInt();
            if (choice == 1){
                printNumber();
            }
            else if (choice == 2){
                fibonacci();
            }
            else if(choice == 3){
                sequence();
            }
            else if (choice == 4){
                sequence1();
            }
            else if (choice == 5){
                sumSeries();
            }
            else if (choice == 6){
                factorial();
            }
            else if (choice == 7) {
                SumAndProduct();
            }
        }
    }
    public static void printNumber(){
        int number = scanner.nextInt();
        int count = 1;
        for (int i = 2; i <= number; i += 2) {
            for (int j = 1; j <= count ; j++) {
                System.out.print(i + "  ");
                i += 2;
            }
            count++;
            System.out.print(i * (-1) + "   ");
        }
    }
    public static void fibonacci(){
        System.out.println("nhập vào số bất kì");
        int number = scanner.nextInt();
        System.out.print("dãy fibonacci gồm: " + number + " số là:  ");
        for (int i = 0; i < number; i++) {
            System.out.print(customFibonacci(i) + "  ");
        }
    }
    public static int customFibonacci(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 2;
        else
            return customFibonacci(n - 1) + customFibonacci(n - 2);
    }
    public static void sequence(){
        System.out.print("Nhập số phần tử của dãy: ");
        int n = scanner.nextInt();

        System.out.println("Dãy số được tạo là:");
        for (int i = 0; i < n; i++) {
            System.out.print(customSequence(i) + " ");
        }
    }
    public static int customSequence(int n) {
        if (n == 0)
            return 1;
        else
            return 2 * customSequence(n - 1) + 1;
    }
    public static void sequence1(){
        System.out.print("Nhập số phần tử của dãy: ");
        int n = scanner.nextInt();

        System.out.println("Dãy số được tạo là:");
        for (int i = 0; i < n; i++) {
            System.out.print(customSequence1(i) + " ");
        }
    }
    public static int customSequence1(int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return 2 * customSequence(n - 1) - 1;
        else
            return -2 * customSequence(n - 1);
    }
    public static void sumSeries(){
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.print("Tổng của dãy là: " + sum);
    }

    public static void factorial(){
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / textFactorial(2 * i - 1);
        }

        System.out.println("Tổng của dãy là: " + sum);
    }
    public static long textFactorial(int n){
        if (n == 0 || n == 1)
            return 1;
        else
            return n * textFactorial(n - 1);
    }
    public static void SumAndProduct(){
        System.out.print("Nhập số nguyên dương m: ");
        int m = scanner.nextInt();

        int sum = 0;
        int product = 1;

        int num = m;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        System.out.println("Tổng của các chữ số của " + m + " là: " + sum);
        System.out.println("Tích của các chữ số của " + m + " là: " + product);
    }
}
