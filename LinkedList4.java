// Define Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define LinkedList class
public class LinkedList4 {
    Node head;

    // Add node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) { // If list is empty
            head = newNode;
        } else {
            newNode.next = head; // Point new node to old head
            head = newNode; // Update head
        }
    }

    // Search for a key iteratively
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1; // Element not found
    }

    // Print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list
    public static void main(String[] args) {
        LinkedList4 ll = new LinkedList4();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);

        // Print linked list
        ll.printList(); // Expected output: 1 -> 2 -> 3 -> null

        // Search for a value
        System.out.println("Index of 2: " + ll.itrSearch(2)); // Expected: 1
        System.out.println("Index of 4: " + ll.itrSearch(4)); // Expected: -1
    }
}
