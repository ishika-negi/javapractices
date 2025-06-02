import java.util.*;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class palindromestack {

    public static boolean isPalindrome(Node head) {
        Node temp = head;
        
        // Push all elements to stack
        Stack<Integer> s = new Stack<>();
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        // Compare again with the original list
        temp = head;
        while (temp != null) {
            if (temp.data != s.pop()) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        boolean result = isPalindrome(head);
        if (result) {
            System.out.println("Linked list is a palindrome.");
        } else {
            System.out.println("Linked list is not a palindrome.");
        }
    }
}
