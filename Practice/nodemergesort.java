class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class nodemergesort{
    
    public Node findmid(Node head){
        Node slow=head;
        Node fast=head.next;
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    

    }
    return slow;
    
}
public Node merge(Node head1,Node head2){
   
        Node mergell=new Node(-1);//creating dummy node
        Node temp=mergell;//pointer temp that points towards mergell
         while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
            }
            temp=temp.next;

         }
         if(head1!=null){
            temp.next=head1;
         }else{
            temp.next=head2;
         }
         return mergell.next;


    
}
    public Node mergesort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid=findmid(head);
        Node righthead=mid.next;
         mid.next=null;
         Node leftsorted=mergesort(head);
         Node rightsorted=mergesort(righthead);
         return merge(leftsorted,rightsorted);
        
    }
    public void printll(Node head){
        while(head!=null){
            System.out.print(head.data+"->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        nodemergesort ll =new nodemergesort();
        Node head=new Node(38);
        head.next=new Node(27);
        head.next.next=new Node(43);
        head.next.next.next=new Node(3);
        head.next.next.next.next=new Node(9);
        head.next.next.next.next.next=new Node(82);
        head.next.next.next.next.next.next=new Node(10);
        System.out.println("Original List : ");
        ll.printll(head);
        head=ll.mergesort(head);
        System.out.println("Sorted LinkedList : ");
        ll.printll(head);

    }
}