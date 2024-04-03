package FPTJAVA;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListArrayList {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true){
            System.out.println("chọn bài bạn muốn xem");
            System.out.println("1. bai1");
            System.out.println("2. bai2");
            System.out.println("3. bai3");
            System.out.println("4. bai4");
            System.out.println("5. bai5");
            int choice = scanner.nextInt();
            if (choice == 1){
                listStringNumber();
            }
            else if (choice == 2){
                ArrayList<Integer> List = listInput();
                displayList(List);
            }
            else if (choice == 3){
                ArrayList<Integer> List = listInput();
                displayList(List);
                System.out.println("nhập vị trí cần lấy");
                int index = scanner.nextInt();
                getValues(List, index);
            } else if (choice == 4) {
                ArrayList<Integer> List = listInput();
                displayList(List);
                System.out.println("nhập vị trí cần lấy");
                int index = scanner.nextInt();
                updateList(List,index);
            }
            else if (choice == 5){
                ArrayList<Integer> List = listInput();
                displayList(List);
                System.out.println("nhập vị trí cần lấy");
                int index = scanner.nextInt();
                deleteList(List,index);
            }
        }

    }
    public static void listStringNumber(){
        ArrayList<String> stringList = new ArrayList<>();
        System.out.println("nhập số lượng danh sách: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("giá trị của i là: " + (i + 1) + ": ");
            String value = scanner.nextLine();
            stringList.add(value);
        }
        System.out.println("các giá trị trong danh sách: ");
        for(String item: stringList){
            System.out.print(item + " ");
        }
    }
    public static ArrayList<Integer> listInput(){
        ArrayList<Integer> listNumber = new ArrayList<>();
        System.out.println("nhập số lượng danh sách: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("giá trị cuủa i là: " + (i+1)+": ");
            int values = scanner.nextInt();
            listNumber.add(values);
        }
        return listNumber;
    }
    public static void displayList(ArrayList<Integer> List){
        for (int item : List){
            System.out.print(item + " ");
        }
    }
    public static void getValues(ArrayList<Integer> List,int index){
        if (index >= 0 && index < List.size()){
            int values = List.get(index);
            System.out.println("giá trị tại vị trí: " + index + " giá trị: " + values);
        }
        else {
            System.out.println("vị trí không hợp lệ");
        }
    }
    public static void updateList(ArrayList<Integer> List,int index){
        System.out.println("nhập phần tử muốn sửa: ");
        int N = scanner.nextInt();
        if (index >= 0 && index < List.size()){
            int values = List.set(index,N);
            System.out.println("giá trị tại vị trí: " + index + " giá trị: " + values + " giá trị được sửa là: " + N);
        }
        else {
            System.out.println("vị trí không hợp lệ");
        }
    }
    public static void deleteList(ArrayList<Integer> List,int index){
        if (index >= 0 && index < List.size()){
            int values = List.remove(index);
            System.out.println("giá trị tại vị trí: " + index + " đã được xóa");
        }
        else {
            System.out.println("vị trí không hợp lệ");
        }
    }
}
