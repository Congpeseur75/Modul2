package baitapzalo;

import java.util.Arrays;
public class Array1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        int a = 11;
        int index = arr.length / 2;
        int [] newArray = new int[arr.length + 1];
        for (int i = 0; i < newArray.length; i++){
            if (i < index){
                newArray[i] = arr[i];
            }else if (i == index){
                newArray[i] = a;
            }
            else {
                newArray[i] = arr[i-1];
            }
        }
        System.out.println("mảng sau khi cộng thêm số 11: " + Arrays.toString(newArray));
    }
}
