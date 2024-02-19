package danhsach;

public class MyLinkedListTest {
    private int numNodes;
    private Node head;

    public void MyLinkedList() {
        numNodes = 0;
        head = null;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
        numNodes++;
    }

    public void addFirst(Object data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        numNodes++;
    }

    public void addLast(Object data) {
        add(data);
    }

    public void remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            head = head.getNext();
        } else {
            Node prev = head;
            for (int i = 0; i < index - 1; i++) {
                prev = prev.getNext();
            }
            prev.setNext(prev.getNext().getNext());
        }
        numNodes--;
    }

    public void remove(Object data) {
        Node temp = head;
        Node prev = null;
        while (temp != null && !temp.getData().equals(data)) {
            prev = temp;
            temp = temp.getNext();
        }
        if (temp == null) {
            return;
        }
        if (prev == null) {
            head = head.getNext();
        } else {
            prev.setNext(temp.getNext());
        }
        numNodes--;
    }

    public Object get(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public int size() {
        return numNodes;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public MyLinkedList clone() {
        MyLinkedList newList = new MyLinkedList();
        Node temp = head;
        while (temp != null) {
            newList.add(temp.getData());
            temp = temp.getNext();
        }
        return newList;
    }

    public boolean contains(Object o) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public int indexOf(Object o) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.getData().equals(o)) {
                return index;
            }
            temp = temp.getNext();
            index++;
        }
        return -1;
    }

    private class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
