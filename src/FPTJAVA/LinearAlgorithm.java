package FPTJAVA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LinearAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binarySequence = "0000000000000000000000000000";
        int n;
        do {
            try {
                System.out.print("Nhập số lượng phần tử của mảng (5 < n < 100): ");
                n = Integer.parseInt(scanner.nextLine());
                if (n <= 5 || n >= 100) {
                    throw new IllegalArgumentException("Số lượng phần tử không hợp lệ, vui lòng nhập lại!");
                }
                break; // Thoát khỏi vòng lặp nếu nhập số lượng phần tử hợp lệ
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số nguyên!");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                arr[i] = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số nguyên!");
                i--; // Giảm biến đếm để nhập lại phần tử không hợp lệ
            }
        }

        System.out.println("Mảng đã nhập là:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Nhập giá trị trong mảng cần tìm (x): ");
        int x = 0;
        try {
            x = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập một số nguyên!");
            return;
        }

        System.out.println("Nhập giá trị trong mảng cần tìm (y): ");
        int y = 0;
        try {
            y = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập một số nguyên!");
            return;
        }

        System.out.println("chon bai bạn muốn xem: ");
        System.out.println("1. bai 1");
        System.out.println("2. bai 2");
        System.out.println("3. bai 3");
        System.out.println("4. bai 4");
        System.out.println("5. bai 5");
        System.out.println("6. bai 6");
        System.out.println("7. bai 7");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                findValues(arr, x);
                break;
            case 2:
                countValues(arr,x);
                break;
            case 3:
                displayValue(arr, x);
                break;
            case 4:
                countAboutTwoValue(arr,x,y);
                break;
            case 5:
                findLastZeroIndex(binarySequence);
                break;
            case 6:
                int[] a ={0, 1, 2, 4, 6, 9, 11, 15};
                int[] b ={1, 2, 4, 6, 9, 11, 15};
                System.out.println(findMissingValue(a));
                System.out.println(findMissingValue(b));
                break;
            case 7:
                System.out.println(binarySearch(arr,x));
                break;
            case 8:
                displayDuplicateValues(arr);
                break;
            case 9:
                countMissingElements(arr);
                break;
            case 10:
                System.out.println(countElementsInRange(arr,x,y));
                break;
            case 11:
                printUniquePairsWithEqualSum(arr);
                break;
            default:
                System.out.println("exit");
        }
    }
    public static void findValues(int[] arr, int value){
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("giá trị có tồn tại trong mảng");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay giá tri nao giong value");
        }
    }
    public static void countValues(int[] arr, int value){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                count++;
            }
        }
        if (count == 0){
            System.out.println("-1");
        }
    }
    public static void displayValue(int[] arr, int value) {
        boolean found = false;
        System.out.println("Cac vi tri chua phan tu giong key:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Vi tri: " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
    public static void countAboutTwoValue(int[] arr, int x, int y){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                count++;
            }
            if (arr[i] == y){
                break;
            }
        }
        if (count == 0){
            System.out.println("-1");
        }
        System.out.println(count);
    }
    public static int findLastZeroIndex(String binaryString) {
        int left = 0;
        int right = binaryString.length() - 1;
        int lastZeroIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            char currentChar = binaryString.charAt(mid);

            if (currentChar == '0') {
                lastZeroIndex = mid; // Lưu lại vị trí số 0
                left = mid + 1; // Tiếp tục tìm kiếm bên phải
            } else {
                right = mid - 1; // Tìm kiếm bên trái
            }
        }

        return lastZeroIndex;
    }
    public static int findMissingValue(int[] arr) {
        Arrays.sort(arr); // Sắp xếp mảng để áp dụng thuật toán tìm kiếm nhị phân

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Nếu giá trị tại vị trí mid không phải là mid thì số bị thiếu nằm ở bên trái
            if (arr[mid] != mid) {
                right = mid - 1;
            } else { // Nếu giá trị tại vị trí mid bằng mid, số bị thiếu nằm ở bên phải
                left = mid + 1;
            }
        }

        // Trả về giá trị thiếu là vị trí left
        return left;
    }
    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Nếu phần tử x được tìm thấy ở vị trí mid, trả về mid
            if (arr[mid] == x) {
                return mid;
            }

            // Nếu x nhỏ hơn giá trị ở vị trí mid, tiếp tục tìm kiếm bên trái của mid
            if (x < arr[mid]) {
                right = mid - 1;
            } else { // Nếu x lớn hơn giá trị ở vị trí mid, tiếp tục tìm kiếm bên phải của mid
                left = mid + 1;
            }
        }

        // Nếu không tìm thấy x trong mảng, trả về -1
        return -1;
    }
    public static void displayDuplicateValues(int[] arr) {
        boolean foundDuplicate = false;
        System.out.print("Các giá trị trùng nhau trong mảng là: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    foundDuplicate = true;
                    break;  // Đã tìm thấy giá trị trùng nhau, thoát khỏi vòng lặp trong
                }
            }
        }
        if (!foundDuplicate) {
            System.out.print("0"); // Không tìm thấy giá trị trùng nhau, hiển thị 0
        }
    }
    public static String countMissingElements(int[] arr) {
        Arrays.sort(arr); // Sắp xếp mảng để tìm phần tử nhỏ nhất và lớn nhất
        int min = arr[0];
        int max = arr[arr.length - 1];

        StringBuilder result = new StringBuilder();

        for (int i = min + 1; i < max; i++) {
            if (!contains(arr, i)) {
                result.append(i).append(", ");
            }
        }

        // Kiểm tra xem có phần tử nào còn thiếu không, nếu không có thì trả về 0
        if (result.length() == 0) {
            return "0";
        }

        // Xóa dấu phẩy cuối cùng và khoảng trắng thừa
        return result.substring(0, result.length() - 2);
    }

    // Phương thức kiểm tra xem phần tử có tồn tại trong mảng không
    public static boolean contains(int[] arr, int target) {
        for (int i : arr) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
    public static int countElementsInRange(int[] arr, int x, int y) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < x && arr[i] > y) {
                count++;
            }
        }
        return count;
    }
    public static void printUniquePairsWithEqualSum(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (!set.contains(sum)) {
                    set.add(sum);
                    System.out.println("Cặp duy nhất: (" + arr[i] + ", " + arr[j] + ") có tổng bằng: " + sum);
                }
            }
        }
    }

}


