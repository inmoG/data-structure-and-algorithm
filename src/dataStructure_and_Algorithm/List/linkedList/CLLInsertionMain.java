package dataStructure_and_Algorithm.List.linkedList;

public class CLLInsertionMain {
    public static void main(String[] args) {
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.append(11);
        circularLinkedList.append(9);
        circularLinkedList.append(27);
        circularLinkedList.append(41);
        circularLinkedList.append(3);

        System.out.println("원형 단일 연결 리스트: ");
        circularLinkedList.printAll();

        System.out.println("노드 3을 삭제한 원형 단일 연결 리스트: ");
        circularLinkedList.delete(3);
        circularLinkedList.printAll();

        System.out.println("노드 11을 삭제한 원형 단일 연결 리스트: ");
        circularLinkedList.delete(11);
        circularLinkedList.printAll();

        System.out.println("노드 27을 삭제한 원형 단일 연결 리스트: ");
        circularLinkedList.delete(27);
        circularLinkedList.printAll();
    }
}
