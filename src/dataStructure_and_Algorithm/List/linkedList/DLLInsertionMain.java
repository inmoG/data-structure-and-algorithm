package dataStructure_and_Algorithm.List.linkedList;

public class DLLInsertionMain {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.append(1);
        doubleLinkedList.append(3);
        doubleLinkedList.append(2);
        doubleLinkedList.append(20);
        doubleLinkedList.append(19);

        System.out.println("원본 이중 연결 리스트: ");

        doubleLinkedList.printAll();
//        doubleLinkedList.printPrevNode(2);
//        doubleLinkedList.printPrevNode(1);
//        doubleLinkedList.printPrevNode(19);

        doubleLinkedList.delete(1);
        System.out.println("노드 1을 삭제한 이중 연결 리스트");
        doubleLinkedList.printAll();

        doubleLinkedList.delete(2);
        System.out.println("노드 2를 삭제한 이중 연결 리스트");
        doubleLinkedList.printAll();

        doubleLinkedList.delete(19);
        System.out.println("노드 19를 삭제한 이중 연결 리스트");
        doubleLinkedList.printAll();


    }
}