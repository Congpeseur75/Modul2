package FPTJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListArrayListOne {
    static ArrayList<Integer> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("nhập bài bạn muốn xem: ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                System.out.println("bài 1:");
                searchElement(scanner.nextInt());
                break;
            case 2:
                System.out.println("bài 2:");
                ArrayList<Integer>   list = new ArrayList<>();
                list.add(5);
                list.add(77);

                ArrayList<Integer>   list1 = new ArrayList<>();
                list1.add(5);
                list1.add(77);
                boolean result = compare(list, list1);
                System.out.println(result);
                break;
            case 3:
                System.out.println("bai 3:");
                System.out.println("nhập giá trị: ");
                checkValueInListArray(scanner.nextInt());
                break;
            case 4:
                System.out.println("bài 4:");
                ArrayList<Integer>   list2 = new ArrayList<>();
                list2.add(5);
                list2.add(77);
                list2.add(6);
                list2.add(8);

                ArrayList<Integer>   list3 = new ArrayList<>();
                list3.add(8);
                list3.add(10);
                list3.add(12);
                displayElementNotAvailable(list2,list3);
                break;
            case 5:
                System.out.println("bài 5:");
                ArrayList<Integer>   list4 = new ArrayList<>();
                list4.add(5);
                list4.add(77);

                ArrayList<Integer>   list5 = new ArrayList<>();
                list5.add(5);
                list5.add(77);
                displayElementInArraylist(list4, list5);
                break;
            default:
                System.out.println("lựa chọn không hợp lệ");
        }
    }
    public static void searchElement(int value){
        list = new ArrayList<>();
        System.out.println("nhập số lượng danh sách: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("giá trị của i ở vị trí: " + (i + 1) + ": ");
            int A = scanner.nextInt();
            list.add(A);
        }
        System.out.println("tìm giá trị có hoặc không trong danh sách: ");
        for(int item: list){
            if (item == value){
                System.out.print("giá trị có trong danh sách: " + item);
            }
            else {
                System.out.println("giá trị không có trong danh sách:");
            }
        }
    }

    public static boolean compare(ArrayList<Integer> list, ArrayList<Integer> list1){
        if (list.size() != list1.size()) {
            return false;
        }
        Collections.sort(list);
        Collections.sort(list1);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).intValue() != list1.get(i).intValue()) {
                return false;
            }
        }
        return true;
    }
    public static void checkValueInListArray(int value){
        list = new ArrayList<>();
        System.out.println("nhập số lượng danh sách: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.println("giá trị của i ở vị trí: " + (i + 1) + ": ");
            int A = scanner.nextInt();
            list.add(A);
        }
        int count = 0;
        for (int item : list){
            if (item == value){
                count++;
            }
            else {
                System.out.println("không có giá trị nào như vậy: ");
            }
        }
        System.out.println("số lượng giá trị có trong danh sách là: " + count);
    }
    public static void displayElementNotAvailable(ArrayList<Integer> list, ArrayList<Integer> list1){
        if (list.size() == list1.size()) {
            System.out.println("2 mảng bằng nhau không thể duyệt chương trình");
        }
        else {
            for (int i = 0; i < list1.size(); i++) {
                if (list1.get(i).intValue() != list.get(i).intValue()) {
                    System.out.print(list1.get(i) + " ");
                } else {
                    System.out.println();
                }
            }
        }
    }
    public static void displayElementInArraylist(ArrayList<Integer> list, ArrayList<Integer> list1){
        System.out.println("các phần tử có trong danh sách L1 và L2 là: ");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                System.out.print(list.get(i) + "  " + list1.get(i) + " ");
            }
        }
    }
}
