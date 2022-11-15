package dataStructure_and_Algorithm.List.linkedList;

/**
 * 원형 단일 연결 리스트 클래스
 */
public class CircularLinkedList {
    private Node head;
    private Node tail;

    CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * 원형 단일 연결 리스트 끝에 노드 추가
     *
     * @param value
     */
    public void append(int value) {
        // 첫 노드 삽입 일 때
        if (this.head == null && this.tail == null) {
            Node node = new Node(value);
            this.head = node;
            this.tail = node;
            return;
        }

        Node pointer = this.tail;
        // 마지막 위치에 새 노드 삽입
        pointer.next = new Node(value);

        // 새로 삽입한 노드를 tail로 재할당
        this.tail = pointer.next;
        // tail의 next 포인터를 head로 연결하여 원형 연결 리스트 조건 만족시킴
        this.tail.next = head;
    }

    /**
     * 원형 단일 연결 리스트 노드 삭제
     *
     * @param value
     */
    public void delete(int value) {
        Node pointer = this.head;

        if (pointer.getValue() == value) {
            Node removeNode = this.head;
            this.head = this.head.next;

            removeNode = null;
            return;
        }

        // 포인터가 tail이 아니며 값이 다를 때까지 반복
        Node temp = null;
        while (pointer.next != this.tail && pointer.getValue() != value) {
            temp = pointer;
            pointer = pointer.next;
        }

        // 삭제 할 노드가 tail일 경우 앞 노드를 tail로 재할당하고 next를 head로 연결
        if (pointer.next.getValue() == value) {
            this.tail = pointer;
            this.tail.next = this.head;
        } else {
            temp.next = pointer.next;
        }
        pointer = null;
    }

    /**
     * 모든 노드 출력
     */
    public void printAll() {
        Node pointer = this.head;

        StringBuilder builder = new StringBuilder();
        while (pointer != this.tail) {
            builder.append(pointer.getValue());
            builder.append(" -> ");
            pointer = pointer.next;
        }
        builder.append(pointer.getValue());
        builder.append("(tail) -> ");

        builder.append(this.head.getValue());
        builder.append("(head)");

        System.out.println(builder.toString());
    }

    class Node {
        private int value; // 값
        private Node next; // 다음 포인터

        Node(int value) {
            this.value = value;
            this.next = null;
        }

        public int getValue() {
            return this.value;
        }
    }
}

