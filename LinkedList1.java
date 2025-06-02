class Node{
    int data;
    Node next;
    public Node(int data){
      this.data=data;
      this.next=null;
    }
}

class LinkedList1 {
    Node head;

    // Add a node at the end (for testing)
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

    // Remove first node (head)
    public int removeFirst() {
        int val=head.data;
        head=head.next;
        return val; // Move head to next node
    }

    // Print the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Before removing first:");
        list.display(); // Output: 10 -> 20 -> 30 -> NULL

        list.removeFirst();

        System.out.println("After removing first:");
        list.display(); // Output: 20 -> 30 -> NULL
    }
}

