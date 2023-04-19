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

//    Input:
//    LinkedList = 1 <--> 3 <--> 4
//    x = 3
//    Output: 1 3
    public Node deleteNode(int position) {
        Node temp = head;

        for(int i=1; i<position; i++) {
            temp = temp.next;
        }

        //this is case when temp is first node
        if(temp.prev != null) {
            temp.prev.next = temp.next;
        }
        else {
            head = temp.next;
        }
        //this is case when temp is last node
        if(temp.next != null) {
            temp.next.prev = temp.prev;
        }

        return head;
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
