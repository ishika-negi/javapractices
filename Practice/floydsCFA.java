class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        this.next=null;
    }
}
public class floydsCFA{
    static Node head;
    public static boolean iscycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
        return false;

    }
    public static void removecycle(){
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }


        }if(cycle==false){
            return;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;
    }
    public static void main(String[] args) {
        head=new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next.next=temp;
        System.out.println(iscycle());
        removecycle();
        System.out.println(iscycle());

    }
}