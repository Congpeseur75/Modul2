package FPTJAVA;

import java.util.Scanner;
import java.util.Random;

import static javax.swing.text.html.HTML.Attribute.N;

public class Array {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("chọn bài");
            System.out.println("1. bai1");
            System.out.println("2. bai2");
            System.out.println("3. bai3");
            System.out.println("4. bai4");
            System.out.println("5. bai5");
            int choice = scanner.nextInt();
            if (choice == 1) {
                inputAndOutputArray();
            }
            else if (choice == 2) {
                generateAndDisplay(scanner.nextInt());
            }
            else if (choice == 3) {
                displayEvenNumber();
            }
            else if (choice == 4) {
                createArrayA();
            }
            else if (choice == 5) {
                createArrayB();
            }
        }
    }
    public static void inputAndOutputArray(){
        int N = scanner.nextInt();
        int [] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Các giá trị trong mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("arr[" + i + "]: " + array[i]);
        }
    }
    public static void generateAndDisplay(int N){
        int[] array = new int[N];
        Random random = new Random();
        System.out.println("Các giá trị số nguyên trong mảng:");
        for (int i = 0; i < N; i++) {
            int randomNumber = random.nextInt(); // sinh ra số nguyên ngẫu nhiên
            array[i] = randomNumber;
            System.out.println(randomNumber);
        }
    }
    public static void displayEvenNumber(){
        int N = scanner.nextInt();
        int [] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.print(array[i] + " ");
            }
            else {
                System.out.println();
            }
        }
    }
    public static void createArrayA(){
        int N = scanner.nextInt();
        int[] A = generateArray(N);
        int[] B = extractEvenNumbers(A);
        System.out.println("Các giá trị chẵn trong mảng A:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
    public static int[] generateArray(int N){
        int[] array = new int[N];
        System.out.println("Nhập các giá trị của mảng A:");
        for (int i = 0; i < N; i++) {
            System.out.print("Nhập giá trị thứ " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int[] extractEvenNumbers(int[] A) {
        int count = 0;
        // Đếm số lượng phần tử chẵn trong mảng A
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                count++;
            }
        }
        // Tạo mảng mới chứa các giá trị chẵn từ mảng A
        int[] B = new int[count];
        int index = 0;
        // Sao chép các giá trị chẵn từ mảng A vào mảng B
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                B[index] = A[i];
                index++;
            }
        }
        return B;
    }
    public static void  createArrayB(){
        int N = scanner.nextInt();
        int[] A = generateArray(N);
        int[] B = extractOddNumbers(A);
        System.out.println("Các giá trị chẵn trong mảng A:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
    }
   public static int[] extractOddNumbers(int[] A){
       int count = 0;
       // Đếm số lượng phần tử lẻ trong mảng A
       for (int i = 0; i < A.length; i++) {
           if (A[i] / 2 != 0) {
               count++;
           }
       }
       // Tạo mảng mới chứa các giá trị lẻ từ mảng A
       int[] B = new int[count];
       int index = 0;
       // Sao chép các giá trị lẻ từ mảng A vào mảng B
       for (int i = 0; i < A.length; i++) {
           if (A[i] / 2 != 0) {
               B[index] = A[i];
               index++;
           }
       }
       return B;
   }
}
