package stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    public static void demergeRecords(Queue<Record> records) {
        Queue<Record> femaleQueue = new LinkedList<>();
        Queue<Record> maleQueue = new LinkedList<>();

        // Phân loại các bản ghi vào các queue tương ứng theo giới tính
        while (!records.isEmpty()) {
            Record record = records.poll();
            if (record.gender.equalsIgnoreCase("female")) {
                femaleQueue.offer(record);
            } else {
                maleQueue.offer(record);
            }
        }

        // Ghi các bản ghi của nữ vào file output
        System.out.println("Female records:");
        while (!femaleQueue.isEmpty()) {
            Record record = femaleQueue.poll();
            System.out.println(record);
            // Ghi vào file output nào đó
        }

        // Ghi các bản ghi của nam vào file output tiếp theo
        System.out.println("\nMale records:");
        while (!maleQueue.isEmpty()) {
            Record record = maleQueue.poll();
            System.out.println(record);
            // Ghi vào file output trên
        }
    }

    public static void main(String[] args) {
        Queue<Record> records = new LinkedList<>();
        records.offer(new Record("Alice", "female", "1990-01-01"));
        records.offer(new Record("Bob", "male", "1985-05-15"));
        records.offer(new Record("Carol", "female", "1988-09-30"));
        records.offer(new Record("David", "male", "1992-03-20"));

        System.out.println("Original records:");
        for (Record record : records) {
            System.out.println(record);
        }

        System.out.println("\nDemerged records:");
        demergeRecords(records);
    }
}
