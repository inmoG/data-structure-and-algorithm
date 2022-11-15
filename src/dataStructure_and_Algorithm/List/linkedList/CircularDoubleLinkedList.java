package dataStructure_and_Algorithm.List.linkedList;

public class CircularDoubleLinkedList {
    private Node head;
    private Node tail;

    public CircularDoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(int value) {
        if (this.head == null && this.tail == null) {
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            return;
        }

        Node temp = this.tail;
        temp.next = new Node(value);

        this.tail = temp.next;
        this.tail.prev = temp;
        this.tail.next = this.head;

        this.head.prev = this.tail;
    }

    public void delete(int value) {
        Node temp = this.head.next;
        if (this.head == this.tail && this.head.getValue() == value) {
            this.head = null;
            this.tail = null;
            return;
        }

        while (temp != this.head) {
            if (temp.getValue() != value) {
                temp = temp.next;
                continue;
            }

            if (temp == this.tail) {
                temp.prev.next = this.tail.next;
                temp.next.prev = this.tail.prev;
                this.tail = this.head.prev;
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            temp = null;
            break;
        }

        if (temp == this.head) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            this.head = this.tail.next;
        }
    }

    public void search(int value) {
        if (this.head == null || this.tail == null) {
            System.out.println(String.format("%s는(은) 존재하지 않습니다.", value));
            return;
        }

        Node temp = this.head.next;
        while (temp != this.head) {
            if (temp.getValue() != value) {
                temp = temp.next;
                continue;
            }

            System.out.println(String.format("%s는(은) 존재합니다.", value));
            break;
        }

        if (temp == this.head) {
            System.out.println(String.format("%s는(은) 존재하지 않습니다.", value));
        }
    }

    class Node {
        private int value;
        private Node prev;
        private Node next;

        Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }

        public int getValue() {
            return this.value;
        }
    }
}
