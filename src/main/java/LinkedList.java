public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;

        if(tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        }
        else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public void insertAtIndex(int index, int value) {
         if(index > size) {
             System.out.print("Invalid Index");
             return;
         }
         if(index == 0) {
            insertAtBeginning(value);
            return;
        }
        if(index == size) {
            insertAtEnd(value);
            return;
        }

        Node newNode = new Node(value);
        Node temp = head;

        for(int i=1; i<index; i++) {
            temp = temp.next;
        }

        Node next = temp.next;
        temp.next = newNode;
        newNode.next = next;
        size++;
    }

    //insert using recursion
    public void insertRec(int index, int value) {
        head = insertRec(index, value, head);
    }

    private Node insertRec(int index, int value, Node node) {
        if(index == 0) {
            Node newNode = new Node(value);
            newNode.next = node;
            size++;
            return newNode;
        }

        node.next = insertRec(index--, value, node.next);
        return node;
    }

    public int deleteFirst() {
        if(head == null) return -1;

        int val = head.value;
        head = head.next;
        //If there is only one element
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if(head == null) return -1;
        int val = tail.value;

        if(head == tail) {
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public int deleteAtIndex(int index) {
        if(index == 0) {
            return deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        Node temp = head;
        for(int i=1; i<index; i++) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = temp.next.next;

        return value;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + "--->");
            temp = temp.next;
        }

        System.out.println("null");
    }

}
