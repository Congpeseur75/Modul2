package mang_va_phuong_thuc_trong_java;
import java.util.Scanner;
public class FindMaxInMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tìm phần tử lớn nhất của ma trận có sẵn
        double[][] matrix = {
                {1.5, 2.0, 3.1},
                {4.2, 5.3, 6.0},
                {7.7, 8.5, 9.2}
        };

        double maxElement = matrix[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất của ma trận có sẵn là: " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất là: [" + row + ", " + col + "]");

        // Bước 2: Nhập ma trận từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        double[][] userMatrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        // In ma trận nhập từ người dùng
        System.out.println("Ma trận nhập từ người dùng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(userMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
