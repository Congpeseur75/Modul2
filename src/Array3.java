import java.util.Arrays;
public class Array3 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int index = 0;
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr = Arrays.copyOf(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
