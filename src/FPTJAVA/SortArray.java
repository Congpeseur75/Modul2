package FPTJAVA;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 4, 9, 2, 6, 5, 8};
        sortArrayUsingQuickSort(arr, 0, arr.length - 1);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    public static void sortArrayUsingQuickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sortArrayUsingQuickSort(arr, low, pivotIndex - 1); // Sắp xếp phần bên trái của pivot
            sortArrayUsingQuickSort(arr, pivotIndex + 1, high); // Sắp xếp phần bên phải của pivot
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot)) { // So sánh số lẻ và số chẵn
                i++;
                // Hoán đổi vị trí
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Hoán đổi vị trí pivot
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static boolean compare(int a, int b) {
        // Sắp xếp các số chẵn trước, sau đó đến các số lẻ
        if (a % 2 == 0 && b % 2 != 0) {
            return true;
        } else if (a % 2 != 0 && b % 2 == 0) {
            return false;
        } else if (a % 2 == 0 && b % 2 == 0) {
            return a <= b;
        } else {
            return a >= b;
        }
    }
}
