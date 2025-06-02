class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList3 {
    Node head;

    // Add node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove last node
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null; // If only one element exists
            return;
        }
        
        Node temp = head;
        while (temp.next.next != null) { // Stop at second last node
            temp = temp.next;
        }
        temp.next = null; // Remove last node
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList3 list = new LinkedList3();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Before removing last:");
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> 50 -> NULL

        list.removeLast();

        System.out.println("After removing last:");
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> NULL
    }
}

