package FPTJAVA;

public class Stack {
    private int[] arr;
    private int top;  // Lưu vị trí của phần tử đưa vào cuối cùng. Khởi tạo là -1
    private int size; // Kích thước tối đa của Stack

    // Constructor để tạo một Stack với kích thước cho trước
    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = size;
    }

    // Kiểm tra xem Stack có rỗng không
    public boolean isEmpty() {
        return top == -1;
    }

    // Kiểm tra xem Stack có đầy không
    public boolean isFull() {
        return top == size - 1;
    }

    // Thêm một phần tử vào đỉnh của Stack
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

    // Lấy giá trị của phần tử đầu tiên trong Stack mà không loại bỏ nó
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Top element of stack: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element of stack: " + stack.peek());
    }
}
