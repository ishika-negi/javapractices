class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class zigzag {
    public void printll(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public void zigzag(Node head){
        if (head == null || head.next == null){
            return;

        } 


        
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        }
        Node mid=slow;
        //reverse secong half
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev; 
        Node nextl,nextr;
        //alt merge
        while(left!=null&&right!=null){
            nextl=left.next;
            left.next=right;
            nextr=right.next;
            right.next=nextl;
            left=nextl;
            right=nextr;


        }

    }
    public static void main(String[] args) {
        zigzag ll=new zigzag();
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next=new Node(6);
        System.out.println("Original ll : ");
        ll.printll(head);
        ll.zigzag(head);
        System.out.println("Zig Zag LinkedList : ");
        ll.printll(head);

        

    }
    
}
