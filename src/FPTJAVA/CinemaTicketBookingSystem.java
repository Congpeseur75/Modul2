package FPTJAVA;

class Node {
    int seatNumber;
    String customerName;
    Node next;

    public Node(int seatNumber, String customerName) {
        this.seatNumber = seatNumber;
        this.customerName = customerName;
        this.next = null;
    }
}

public class CinemaTicketBookingSystem {
    private Node A; // Danh sách liên kết chứa số ghế trống
    private Node B; // Danh sách hàng đợi chứa số thứ tự xếp hàng của khách
    private Node C; // Danh sách liên kết chứa thông tin khách đã mua vé

    // Khởi tạo rạp với n ghế, ban đầu tất cả ghế đều trống
    public CinemaTicketBookingSystem(int n) {
        A = new Node(1, null);
        Node current = A;
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i, null);
            current = current.next;
        }
    }

    // Chức năng lấy số xếp hàng
    public void getQueueNumber(String customerName) {
        Node newNode = new Node(-1, customerName); // Số thứ tự xếp hàng được thiết lập sau
        if (B == null) {
            newNode.seatNumber = 1;
            B = newNode;
        } else {
            Node lastNode = getLastNode(B);
            newNode.seatNumber = lastNode.seatNumber + 1;
            lastNode.next = newNode;
        }
        System.out.println("Khách hàng " + customerName + " có số xếp hàng là: " + newNode.seatNumber);
    }

    // Chức năng mua vé
    public void buyTicket() {
        if (A == null) {
            System.out.println("Xin lỗi, không còn ghế trống.");
            return;
        }
        if (B == null) {
            System.out.println("Xin lỗi, không có khách đang chờ xếp hàng.");
            return;
        }
        Node customer = B;
        Node seat = A;
        Node prev = null;
        while (seat != null && seat.seatNumber != customer.seatNumber) {
            prev = seat;
            seat = seat.next;
        }
        Node newNode = new Node(seat.seatNumber, customer.customerName);
        if (C == null) {
            C = newNode;
        } else {
            Node lastNode = getLastNode(C);
            lastNode.next = newNode;
        }
        if (prev == null) {
            A = A.next;
        } else {
            prev.next = seat.next;
        }
        System.out.println("Khách hàng " + newNode.customerName + " đã mua vé cho ghế số " + newNode.seatNumber);
    }

    // Chức năng hủy vé
    public void cancelTicket(int seatNumber) {
        if (C == null) {
            System.out.println("Không tìm thấy vé tương ứng với số ghế " + seatNumber);
            return;
        }
        Node customer = C;
        Node prev = null;
        while (customer != null && customer.seatNumber != seatNumber) {
            prev = customer;
            customer = customer.next;
        }
        if (customer == null) {
            System.out.println("Không tìm thấy vé tương ứng với số ghế " + seatNumber);
            return;
        }
        Node newNode = new Node(seatNumber, null);
        if (A == null) {
            A = newNode;
        } else {
            Node lastNode = getLastNode(A);
            lastNode.next = newNode;
        }
        if (prev == null) {
            C = C.next;
        } else {
            prev.next = customer.next;
        }
        System.out.println("Vé cho ghế số " + seatNumber + " đã được hủy.");
    }

    // Chức năng hiển thị thông tin vé đã bán
    public void displaySoldTickets() {
        System.out.println("Thông tin các vé đã bán:");
        Node temp = C;
        while (temp != null) {
            System.out.println("Ghế số: " + temp.seatNumber + " - Khách hàng: " + temp.customerName);
            temp = temp.next;
        }
    }

    // Phương thức trợ giúp: lấy node cuối cùng trong danh sách liên kết
    private Node getLastNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        CinemaTicketBookingSystem cinema = new CinemaTicketBookingSystem(10);

        // Mô phỏng các chức năng
        cinema.getQueueNumber("Alice");
        cinema.getQueueNumber("Bob");
        cinema.buyTicket();
        cinema.buyTicket();
        cinema.getQueueNumber("Charlie");
        cinema.cancelTicket(2);
        cinema.displaySoldTickets();
    }
}