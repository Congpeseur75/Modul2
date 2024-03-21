package FPTJAVA;

import java.util.Scanner;

public class Bai6{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("chọn bài bạn muốn xem:");
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                sumArray();
            case 2:
                addArray(scanner.nextInt());
            case 3:
                deleteArr(scanner.nextInt());
            case 4:
                displayArray();
            case 5:
                informationStudent();
            case 0:
                System.out.println("kết thúc chương trình");
                break;
            default:
        }
    }
    public static void sumArray(){
        System.out.println("nhập vào số nguyên: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] % 2 == 0 ){
                sumEven += arr[i];
            }
            else {
                sumOdd += arr[i];
            }
        }
        System.out.println("tổng của mảng arr lả: " + sum + "tổng số chẵn trong mảng là: " + sumEven + "tổng số lẻ trong mảng là: " + sumOdd);
    }
    public static int[] addArray(int N){
        int[] arr = {1,3,5,7,9,11};
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = N;
        return newArr;
    }

    public static int[] deleteArr(int N){
        int[] arr = {1,3,5,7,9,11};
        int[] newArr = new int[arr.length - 1];
        for (int i = 0,k = 0; i < arr.length; i++) {
            if (i != N){
                newArr[k] = arr[i];
                k++;
            }
        }
        return newArr;
    }
    public static int[] addValues(int[] A,int[] index,int[] value){
        int N = index.length;
        for (int i = 0; i < N; i++) {
            int insertIndex = index[i];
            int insertValue = value[i];
            for (int j = A.length-1; j < insertIndex ; j++) {
                A[j] = A[j-1];
            }
            A[insertIndex] = A[insertValue];
        }
        return A;
    }
    public static int[] inputArray(){
        System.out.println("nhập số lượng phần tử A: ");
        int M = scanner.nextInt();
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            System.out.println(i + 1);
            A[i] = scanner.nextInt();
        }
        return A;
    }
    public static void displayArray(){
        int[] A = inputArray();
        System.out.println("nhập số lượng giá trị cần thêm vào mảng: ");
        int N = scanner.nextInt();
        int[] index = new int[N];
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Nhập vị trí cần chèn giá trị thứ " + (i + 1) + ": ");
            index[i] = scanner.nextInt();
            System.out.print("Nhập giá trị cần chèn tại vị trí " + index[i] + ": ");
            values[i] = scanner.nextInt();
        }
        A = addValues(A, index,values);
        System.out.println("mảng A sau khi chèn là: ");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
        }
    }

    public static void informationStudent(){
        System.out.println("nhập số lượng học viên: ");
        int N = scanner.nextInt();
        String[] name = new String[N];
        double[] pointSQLBasic = new double[N];
        double[] pointJavaBasic = new double[N];
        double[] pointJavaAdvanced = new double[N];
        System.out.println("nhập thông tin: ");
        inputStudent(scanner,name,pointSQLBasic,pointJavaBasic,pointJavaAdvanced);
        System.out.println("hiện thị thông tin: ");
        displayInformationStudent(name,pointSQLBasic,pointJavaBasic,pointJavaAdvanced);
        System.out.println("tính và hiển thị điểm trung bình");
        calculateAverageAndDisplayPointStudent(name,pointSQLBasic,pointJavaBasic,pointJavaAdvanced);

    }
    public static void inputStudent(Scanner scanner,String[] name,double[] pointSQLBasic,double[] pointJavaBasic,double[] pointJavaAdvanced){
        for (int i = 0; i < name.length; i++) {
            scanner.nextLine();
            System.out.println("Nhập thông tin học viên thứ " + (i+1) + ":");
            System.out.print("Tên học viên: ");
            name[i] = scanner.nextLine();
            System.out.print("Điểm SQL Basic: ");
            pointSQLBasic[i] = scanner.nextDouble();
            System.out.print("Điểm Java Basic: ");
            pointJavaBasic[i] = scanner.nextDouble();
            System.out.print("Điểm Java Advanced: ");
            pointJavaAdvanced[i] = scanner.nextDouble();
        }
    }
    public static void displayInformationStudent(String[] name,double[] pointSQLBasic,double[] pointJavaBasic,double[] pointJavaAdvanced){
        for (int i = 0; i < name.length; i++) {
            System.out.println("Học viên: " + name[i]);
            System.out.println("  Điểm SQL Basic: " + pointSQLBasic[i]);
            System.out.println("  Điểm Java Basic: " + pointJavaBasic[i]);
            System.out.println("  Điểm Java Advanced: " + pointJavaAdvanced[i]);
        }
    }
    public static void calculateAverageAndDisplayPointStudent(String[] name,double[] pointSQLBasic,double[] pointJavaBasic,double[] pointJavaAdvanced){
        for (int i = 0; i < name.length; i++) {
            double average = (pointSQLBasic[i] + pointJavaBasic[i] + pointJavaAdvanced[i]) / 3.0;
            if (average >= 6.5){
                System.out.println("Học viên: " + name[i] + " - Điểm trung bình: " + average);
            }
        }
    }
}
