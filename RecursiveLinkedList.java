public class RecursiveLinkedList {
    // Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head; // Head of the linked list

    // Recursive search method
    public boolean recursiveSearch(Node startNode, int searchData) {
        if (startNode == null) {
            return false; // Base case: If we reach the end, element is not found
        } else if (startNode.data == searchData) {
            return true; // Base case: If current node has the data, return true
        } else {
            return recursiveSearch(startNode.next, searchData); // Recursive call on next node
        }
    }

    // Method to add elements to the linked list
    public void addLast(int data) {
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

    public static void main(String[] args) {
        RecursiveLinkedList list = new RecursiveLinkedList();

        // Adding elements to the linked list
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        // Searching for elements
        System.out.println("Is 20 in the list? " + list.recursiveSearch(head, 20)); // true
        System.out.println("Is 50 in the list? " + list.recursiveSearch(head, 50)); // false
    }
}

