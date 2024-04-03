package FPTJAVA;

import java.util.Random;

public class CustomStack {
    private int[] arr;
    private int top;
    private int size;

    // Khởi tạo stack với số phần tử n
    public CustomStack(int n) {
        arr = new int[n];
        top = -1;
        size = n;
    }

    // Kiểm tra Stack có rỗng hay không
    public boolean isEmpty() {
        return top == -1;
    }

    // Kiểm tra Stack có đầy hay không
    public boolean isFull() {
        return top == size - 1;
    }

    // Đưa một phần tử vào Stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push item " + item);
            return;
        }
        arr[++top] = item;
        System.out.println("Pushed " + item + " to the stack");
    }

    // Lấy một phần tử ra khỏi Stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    // Lấy giá trị của phần tử đầu tiên trong Stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(10);

        // Nhập 10 phần tử ngẫu nhiên vào Stack và xuất ra màn hình
        Random random = new Random();
        System.out.println("Nhập 10 phần tử ngẫu nhiên vào Stack:");
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(100); // Giả sử các phần tử ngẫu nhiên là số nguyên từ 0 đến 99
            stack.push(randomNum);
        }

        System.out.println("Các phần tử trong Stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
