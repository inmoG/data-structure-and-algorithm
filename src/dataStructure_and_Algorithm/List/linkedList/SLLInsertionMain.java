package dataStructure_and_Algorithm.List.linkedList;

public class SLLInsertionMain {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.append(85);
        singlyLinkedList.append(59);
        singlyLinkedList.append(70);
        singlyLinkedList.append(23);
        singlyLinkedList.append(65);

        System.out.println("단일 연결 리스트: ");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(85);
        System.out.println("노드 85를 삭제한 단일 연결 리스트");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(70);
        System.out.println("노드 70을 삭제한 단일 연결 리스트");
        singlyLinkedList.printAll();

        singlyLinkedList.delete(65);
        System.out.println("노드 65를 삭제한 단일 연결 리스트");
        singlyLinkedList.printAll();
    }
}
