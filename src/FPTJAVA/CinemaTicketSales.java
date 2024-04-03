package FPTJAVA;

public class CinemaTicketSales {
    public static boolean cinemaQueue(int[] arr) {
        int count25 = 0;
        int count50 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 25) {
                count25++;
            } else if (arr[i] == 50) {
                if (count25 == 0) {
                    return false; // Không có đủ tiền 25 để trả lại
                }
                count25--;
                count50++;
            } else { // arr[i] == 100
                if (count50 > 0 && count25 > 0) {
                    count50--;
                    count25--;
                } else if (count25 >= 3) {
                    count25 -= 3;
                } else {
                    return false; // Không đủ tiền 25 và 50 để trả lại
                }
            }
        }

        return true; // Có đủ tiền để trả lại cho tất cả người đứng trong hàng
    }

    public static void main(String[] args) {
        int[] arr1 = {25, 25, 50, 50};
        System.out.println(cinemaQueue(arr1)); // Kết quả: true

        int[] arr2 = {25, 100};
        System.out.println(cinemaQueue(arr2)); // Kết quả: false
    }
}
