package FPTJAVA;

import java.util.Scanner;

public class CauTrucLoop {
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
            System.out.println("0. enter closer");
            int choice = scanner.nextInt();
            if (choice == 1){
                printForm();
            }
            else if (choice == 2){
                PrintSeries();
            }
            else if (choice == 3){
                PrintSeries1();
            }
            else if (choice == 4){
                PrintSeries2();
            }
            else if (choice == 5){
                PrintSeries3();
            }
            else if (choice == 6){
                PrintSeries4();
            }
            else if (choice == 7){
                PrintSeries5();
            }
            else if (choice == 0){
                System.out.println("đóng chương trình");
                break;
            }
        }
    }
    public static void printForm(){
        //Viết chương trình Java bằng cách sử dụng  vòng lặp for để in mẫu sau
        //"*
        //**
        //***
        //****
        //*****
        System.out.println("nhập một số nguyên bằng 5");
        int size = 5;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PrintSeries(){
        //Viết chương trình Java bằng cách sử dụng ba vòng lặp for để in mẫu sau
        //"1******
        //12*****
        //123****
        //1234***
        //12345**
        //123456*
        //1234567
        System.out.println("nhập một số nguyên bằng 7");
        int size = 8;
        for (int i = 1; i < size; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i + 1; k <= size ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void PrintSeries1(){
        //In dãy số 1, 2, 3, 4, 5 … n (n là số nhập vào từ bàn phím)
        System.out.println("nhập một số nguyên ");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.print(i);
        }
    }
    public static void  PrintSeries2(){
        //In dãy số 1, 3, 5, 7, 9 … n (n là số nhập vào từ bàn phím)
        System.out.println("nhập một số nguyên ");
        int size = scanner.nextInt();
        for (int i = 1; i <= size; i++) {
            System.out.print(i);
            i++;
        }
    }
    public static void PrintSeries3(){
        //In dãy số 2, -4, 6, -8, 10 … n (n là số nhập vào từ bàn phím) (*)
        System.out.println("nhập một số nguyên ");
        int size = scanner.nextInt();
        int num = -2;
        for (int i = 2; i <= size; i++) {
            if (i % 2 == 0){
                num *= 2;
                System.out.print("," + i + "," + num);
            }
            else {
                break;
            }
           i = i + 3;
        }
    }
    public static void PrintSeries4(){
        //In dãy số 2, 4, -6, 8, 10, -12 … n (bằng ít nhất 2 cách khác nhau) (n là số nhập vào từ bàn phím)
        System.out.println("nhập một số nguyên ");
        int size = scanner.nextInt();
        int num = -3;
        for (int i = 2; i <= size; i++) {
           if(i % 2 == 0) {
               System.out.print("," + i);
               i += 2;
               System.out.print("," + i);
           }
           else {
               num *= 2;
               System.out.print("," + num);
               i = i + 2;
           }
        }

        int flag = 1;
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                System.out.print(", " + num);
                num += 2;
            } else {
                System.out.print(", " + (flag * i * -1));
                flag *= -1;
            }
        }
    }
    public static void PrintSeries5(){
        //In dãy số 2, 4, 6, 8, 10 … 2n (n là số nhập vào từ bàn phím) (*)
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * i + " ");
        }
    }
}

