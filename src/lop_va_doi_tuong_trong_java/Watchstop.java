package lop_va_doi_tuong_trong_java;

public class Watchstop {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        // Generate an array of 100,000 random numbers
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 100000);
        }

        // Start the stopwatch
        stopWatch.start();

        // Perform selection sort on the array
        selectionSort(numbers);

        // Stop the stopwatch
        stopWatch.stop();

        // Display the elapsed time
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime() + " milliseconds");
    }

    // Selection Sort Algorithm
    private static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the element at index i
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
