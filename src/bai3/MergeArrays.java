package bai3;
import java.util.Scanner;
public class MergeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tạo 2 mảng số với kích thước cho trước
        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];

        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];

        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        // Bước 3: Tạo mảng thứ 3 có kích thước bằng kích thước mảng 1 + kích thước mảng 2
        int size3 = size1 + size2;
        int[] array3 = new int[size3];

        // Bước 4: Gán phần tử từ mảng 1 vào mảng 3
        for (int i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }

        // Bước 5: Gán phần tử từ mảng 2 vào mảng 3, tính từ phần tử array3[array2.length]
        for (int i = 0; i < size2; i++) {
            array3[size1 + i] = array2[i];
        }

        // In mảng sau khi gộp
        System.out.println("Mảng sau khi gộp:");
        for (int i = 0; i < size3; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
