public class UltimateNumber {
    public static void main(String[] args) {
        int [] arr1 = {50,40,30,20,10};
        int [] arr2 = {40,70,80,90,30};
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.println("có xuất hiện");
                }
                else {
                    System.out.println("không xuất hiện");
                }
            }
        }
    }
}