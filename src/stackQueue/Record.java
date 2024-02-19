package stackQueue;
import java.util.LinkedList;
import java.util.Queue;
public class Record {
    String name;
    String gender;
    String dateOfBirth;

    public Record(String name, String gender, String dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return name + ", " + gender + ", " + dateOfBirth;
    }
}
