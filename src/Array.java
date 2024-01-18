import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int a = 11;
        int [] newArray = new int [arr.length + 1];
        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i];
        }
        newArray [newArray.length - 1 ] = a;
        arr = newArray;
        System.out.println(Arrays.toString(arr));
    }
}
