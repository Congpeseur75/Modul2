package thuattoansapsep;

public class InsertionSortVisualization {
    void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử của mảng đã sắp xếp lên một vị trí
            // lớn hơn nếu chúng lớn hơn phần tử key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;

            // Hiển thị mảng sau mỗi bước
            displayArray(arr);
        }
    }
    void displayArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[]) {
        InsertionSortVisualization sorter = new InsertionSortVisualization();
        int arr[] = { 12, 11, 13, 5, 6 };

        System.out.println("Mảng trước khi sắp xếp:");
        sorter.displayArray(arr);

        sorter.insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        sorter.displayArray(arr);
    }
}
