public class recursivelinkedlistsearch {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    // Constructor to initialize an empty linked list
    public recursivelinkedlistsearch() {
        head = null;
        tail = null;
    }

    // Recursive search function
    public boolean recurssivesearch(Node startNode, int searchdata) {
        if (startNode == null) {
            return false;
        } else if (startNode.data == searchdata) {
            return true;
        } else {
            return recurssivesearch(startNode.next, searchdata);
        }
    }

    // Add node at the end
    public void addlast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Print linked list
    public void printlinkedlist() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        recursivelinkedlistsearch n = new recursivelinkedlistsearch();
        n.addlast(10);
        n.addlast(20);
        n.addlast(30);
        n.addlast(40);
        n.addlast(50);

        n.printlinkedlist();
        System.out.println(n.recurssivesearch(n.head, 30)); // ✅ Correct way to call the search function
        System.out.println(n.recurssivesearch(n.head, 100)); // ❌ Should return false
    }
}

