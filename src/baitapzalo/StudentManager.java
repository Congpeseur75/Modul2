package baitapzalo;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student>students;
    public StudentManager(){
        this.students = new ArrayList<>();
    }



    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void updateStudent(int index, Student student){
        students.set(index, student);
    }
    public void deleteStudent(int index){
        students.remove(index);
    }
    public void searchByName(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                System.out.println(student);
            }
        }
    }

    public void searchById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có id là " + id);
    }

    @Override
    public String toString() {
        return "StudentManager{" +
                "students=" + students +
                '}';
    }
}

