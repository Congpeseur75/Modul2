package baitapzalo;

public class StudentManger {
    private Student[] students;
    private int size;

    public StudentManger() {
    }

    public StudentManger(Student[] students, int size) {
        this.students = students;
        this.size = size;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}

