package baitapzalo;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        manager.addStudent(new Student(1,"Ten da",3,"tenda24@gmail.com"));
        manager.addStudent(new Student(2,"Kiên",4,"kien24@gmail.com"));

        while (true){
            System.out.println("Chọn thao tác muốn thực hiện");
            System.out.println("1. hiển thị danh sách");
            System.out.println("2. thêm học sinh vào danh sách");
            System.out.println("3. sửa học sinh cần sửa");
            System.out.println("4. xóa học sinh khỏi danh sách");
            System.out.println("5. tìm kiếm học sinh theo id và tên");
            System.out.println("0. đóng menu");
            int choice = scanner.nextInt();
            if (choice == 1){
                manager.displayAllStudents();
            }
            else if (choice == 2){
                System.out.print("Nhập id: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nhập email: ");
                String email = scanner.nextLine();

                Student newStudent = new Student(id, name, age, email);
                manager.addStudent(newStudent);
            }
            else if (choice == 3){
                manager.updateStudent(scanner.nextInt(), new Student());
            }
            else if (choice == 4){
                System.out.println("nhập id cần tìm");
                manager.deleteStudent(scanner.nextInt());
            }
            else if (choice == 5){
                System.out.println("nhập id cần tìm");
                manager.searchById(scanner.nextInt());
                System.out.println("nhập tên cần tìm");
                manager.searchByName(scanner.nextLine());
            }
            else if (choice == 0){
                System.out.println("đóng lựa chọn");
                break;
            }
        }
    }
}
