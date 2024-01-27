package mang_va_phuong_thuc_trong_java;
import java.util.Scanner;
public class SumOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một ma trận vuông có sẵn
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = calculateSumOfMatrix(matrix);

        System.out.println("Tổng các phần tử của ma trận vuông là: " + sum);

        // Bước 2: Thu thập mảng từ nhập liệu của người dùng
        System.out.print("Nhập kích thước của ma trận (số hàng và số cột): ");
        int size = scanner.nextInt();

        int[][] userMatrix = new int[size][size];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextInt();
            }
        }

        // In ma trận nhập từ người dùng
        System.out.println("Ma trận nhập từ người dùng:");
        printMatrix(userMatrix);
    }

    private static int calculateSumOfMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
