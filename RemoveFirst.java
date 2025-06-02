class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListt {
    Node head;

    // Remove first element
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;  // Move head to the next node
    }

    // Print Linked List
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class RemoveFirst {
    public static void main(String[] args) {
        LinkedListt list = new LinkedListt();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.println("Before removing:");
        list.printList();

        list.removeFirst();  // Removes 10

        System.out.println("After removing:");
        list.printList();
    }
}

    
    

