package stackQueue;

public class Nodee {
    int data;
    Node next;

    public Nodee(int data) {
        this.data = data;
        this.next = null;
    }
    public class CircularQueue {
        private Node front;
        private Node rear;

        public CircularQueue() {
            this.front = null;
            this.rear = null;
        }

        public void enQueue(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                front = rear = newNode;
                rear.next = front; // Circular linkage
            } else {
                rear.next = newNode;
                rear = newNode;
                rear.next = front; // Circular linkage
            }
        }

        public int deQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return -1; // Or throw an exception
            } else {
                boolean removedData = front.data;
                if (front == rear) {
                    front = rear = null;
                } else {
                    front = front.next;
                    rear.next = front; // Circular linkage
                }
            }
            return 0;
        }

        public boolean isEmpty() {
            return front == null && rear == null;
        }

        public void displayQueue() {
            if (isEmpty()) {
                System.out.println("Queue is empty.");
                return;
            }

            Node temp = front;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != front);
            System.out.println();
        }

        public void main(String[] args) {
            CircularQueue queue = new CircularQueue();
            queue.enQueue(1);
            queue.enQueue(2);
            queue.enQueue(3);
            queue.enQueue(4);
            queue.enQueue(5);

            System.out.println("Initial queue:");
            queue.displayQueue();

            System.out.println("Dequeued element: " + queue.deQueue());
            System.out.println("Dequeued element: " + queue.deQueue());

            System.out.println("Queue after dequeue:");
            queue.displayQueue();
        }
    }
}
