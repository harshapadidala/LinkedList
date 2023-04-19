package org.example;

public class DoublyLinkedList {
    private class Node {
        private int value;
        private Node next;
        private Node prev;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        //empty linked list
        if(head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        //empty linked list
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAfterNodeWithValue(int value, int nodeValue) {
        Node newNode = new Node(nodeValue);
        Node temp = head;

        while (temp == null || temp.value != value) {
            temp = temp.next;
        }

        if(temp == null) {
            System.out.println("No node with value found");
            return;
        }

        newNode.next = temp.next;
        //this is case when value given is of last node
        if(temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayReverse() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.value + "--->");
            temp = temp.prev;
        }
        System.out.println("null");
    }
}
