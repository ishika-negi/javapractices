public class LinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add a node at the beginning of the linked list
    public void addFirst(int data) {
        Node ishika = new Node(data);
        if (head == null) {
            head = tail = ishika;
            return;
        }
        ishika.next = head; // Link newNode to the current head
        head = ishika; // Update head
    }

    // Method to print the LinkedList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);

        // Print the linked list
        ll.printList();
    }
}

