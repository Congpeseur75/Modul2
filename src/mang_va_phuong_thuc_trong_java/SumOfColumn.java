package mang_va_phuong_thuc_trong_java;
import java.util.Scanner;
public class SumOfColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Tính tổng các phần tử của một mảng có sẵn
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.print("Nhập cột muốn tính tổng (0 đến " + (matrix[0].length - 1) + "): ");
        int columnToSum = scanner.nextInt();

        int sumOfColumn = calculateSumOfColumn(matrix, columnToSum);

        System.out.println("Tổng của cột " + columnToSum + " là: " + sumOfColumn);

        // Bước 2: Thu thập mảng thực từ nhập liệu của người dùng
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        double[][] userMatrix = new double[rows][cols];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại [" + i + "][" + j + "]: ");
                userMatrix[i][j] = scanner.nextDouble();
            }
        }

        // In mảng nhập từ người dùng
        System.out.println("Mảng nhập từ người dùng:");
        printMatrix(userMatrix);
    }

    private static int calculateSumOfColumn(int[][] matrix, int column) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }

    private static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
