package thuattoansapsep;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6}; // Mảng đầu vào

        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr); // Hiển thị mảng trước khi sắp xếp

        insertionSort(arr); // Sắp xếp mảng

        System.out.println("\nMảng sau khi sắp xếp:");
        printArray(arr); // Hiển thị mảng sau khi sắp xếp
    }
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của arr[0..i-1], lớn hơn key, đến vị trí sau khi chúng đã được sắp xếp
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            System.out.println("Bước " + i + ":");
            printArray(arr); // Hiển thị mảng sau mỗi bước
        }
    }

    // Phương thức hiển thị mảng
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
