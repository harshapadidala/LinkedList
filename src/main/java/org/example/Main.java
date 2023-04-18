package org.example;

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
    }
}