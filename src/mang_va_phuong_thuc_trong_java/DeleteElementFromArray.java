package mang_va_phuong_thuc_trong_java;
import java.util.Scanner;
public class DeleteElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập phần tử cần xoá (X): ");
        int X = scanner.nextInt();

        // Bước 3: Tìm X và chỉ ra vị trí của X (index_del)
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                System.out.println("Phần tử " + X + " xuất hiện tại vị trí index " + index_del);
                break;
            }
        }

        // Bước 4: Thực hiện xoá phần tử X khỏi mảng
        if (index_del != -1) {
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }
            N--; // Giảm số phần tử trong mảng sau khi xoá
        } else {
            System.out.println("Phần tử " + X + " không xuất hiện trong mảng.");
        }

        // Bước 5: In ra mảng sau khi xoá
        System.out.println("Mảng sau khi xoá phần tử " + X + ":");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
