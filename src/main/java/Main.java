public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(5);
        linkedList.insertAtBeginning(10);
        linkedList.insertAtBeginning(15);
        linkedList.insertAtBeginning(20);
        linkedList.insertAtBeginning(25);

        linkedList.insertAtEnd(4);
        linkedList.insertAtEnd(3);

        linkedList.insertAtIndex(3, 99);
        linkedList.insertAtIndex(4, 100);

        linkedList.display();

        System.out.println(linkedList.deleteFirst());

        linkedList.display();

        System.out.println(linkedList.deleteLast());

        linkedList.display();

        System.out.println(linkedList.deleteAtIndex(2));

        linkedList.display();

        linkedList.insertRec(4, 220);

        linkedList.display();
        /*
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtBeginning(5);
        dll.insertAtBeginning(4);
        dll.insertAtBeginning(3);

        dll.insertAtEnd(6);
        dll.insertAtEnd(7);
        dll.insertAtEnd(8);

        dll.insertAfterNodeWithValue(6, 100);
        dll.insertAfterNodeWithValue(7, 120);
        dll.insertAfterNodeWithValue(8, 1000);

        dll.display();

        dll.deleteNode(1);
        dll.deleteNode(5);

        dll.display();
         */

        /*
        CircularLinkedList cll = new CircularLinkedList();

        cll.insert(1);
        cll.insert(2);
        cll.insert(3);
        cll.insert(4);
        cll.insert(5);

        cll.display();

        cll.delete(3);

        System.out.println();
        cll.display();
        System.out.println();
        System.out.println("HEAD " + cll.head());
        System.out.println("TAIL " + cll.tail());

         */
    }
}