package baitapzalo;
import java.util.Arrays;
import java.util.Scanner;

public class MainStudent {
    static Scanner scanner = new Scanner(System.in);
    static StudentManger studentManger = new StudentManger();
    public static void main(String[] args) {
        Student[] students = new Student[2];

        Student s1 = new Student(1,"Đạt",18,"datoc24@gmail.com");
        Student s2 = new Student(2,"Huy",50,"Huyoc24@gmail.com");

        students[0] = s1;
        students[1] = s2;

        studentManger.setStudents(students);
        studentManger.setSize(students.length);

        Student[] retrievedStudents = studentManger.getStudents();
        while (true){
            System.out.println("Lựa chọn");
            System.out.println("1. hiển thị danh sách");
            System.out.println("2. thêm học sinh");
            System.out.println("3. sửa học sinh");
            System.out.println("4. xóa học sinh");
            System.out.println("5. tim kiếm học sinh");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1){
                displayStudents(retrievedStudents);
            }
            else if (choice == 2){
                addStudents();
            }
            else if (choice == 3){
                editStudents();
            }
            else if (choice == 4){
                deleteStudents();
            }
        }
    }
    public static void displayStudents(Student[] students) {
        System.out.println("Danh sách sinh viên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public static void addStudents(){
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập email");
        String email = scanner.nextLine();

        Student student = new Student(id,name,age,email);
        Student[] extendedStudents = Arrays.copyOf(studentManger.getStudents(), studentManger.getSize() + 1);
        extendedStudents[studentManger.getSize()] = student;
        studentManger.setStudents(extendedStudents);
        studentManger.setSize(studentManger.getSize() + 1);
        System.out.println("Đã thêm học sinh mới thành công!");
    }
    public static void editStudents(){
        System.out.println("Nhập ID của học sinh cần sửa:");
        int id = Integer.parseInt(scanner.nextLine());

        Student[] students = studentManger.getStudents();
        for (int i = 0; i < studentManger.getSize(); i++) {
            if (students[i].getId() == id) {
                System.out.println("Nhập thông tin mới cho học sinh:");
                System.out.println("Tên mới:");
                students[i].setName(scanner.nextLine());
                System.out.println("Tuổi mới:");
                students[i].setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println("Email mới:");
                students[i].setEmail(scanner.nextLine());
                System.out.println("Đã cập nhật thông tin của học sinh thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID: " + id);
    }
    public static void deleteStudents() {
        System.out.println("Nhập ID của học sinh cần xóa:");
        int id = Integer.parseInt(scanner.nextLine());

        Student[] students = studentManger.getStudents();
        for (int i = 0; i < studentManger.getSize(); i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < studentManger.getSize() - 1; j++) {
                    students[j] = students[j + 1];
                }
                studentManger.setSize(studentManger.getSize() - 1);
                System.out.println("Đã xóa học sinh thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID: " + id);
    }
    public static void searchStudents() {
        System.out.println("Nhập ID của học sinh cần tìm kiếm:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên học sinh cần tìm kiếm");
        String name = scanner.nextLine();
        Student[] students = studentManger.getStudents();
        for (int i = 0; i < studentManger.getSize(); i++) {
            if (students[i].getId() == id || name.equals(students[i].getName())){
                System.out.println("Thông tin của học sinh:");
                System.out.println(students[i]);
                return;
            }
        }
        System.out.println("Không tìm thấy học sinh có ID: " + id);
    }
}
