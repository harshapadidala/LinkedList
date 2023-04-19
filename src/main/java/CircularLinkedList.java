public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

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

    public void insert(int value) {
        Node newNode = new Node(value);

        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void delete(int value) {
        if(head == null) {
            return;
        }
        Node prev = null;
        Node temp = head;

        while (temp.value != value) {
            prev = temp;
            temp = temp.next;
        }

        //we are deleting head node
        if(temp == head) {
            head = head.next;
            tail.next = head;
            return;
        }

        //we are deleting the tail node
        if(temp == tail) {
            tail = prev;
        }

        prev.next = temp.next;
    }

    public void display() {
        Node temp = head;

        while (temp.next != head) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }

        System.out.print(temp.value + "-->HEAD ");
    }

    public int head(){
        return head.value;
    }

    public int tail() {
        return tail.value;
    }

}
