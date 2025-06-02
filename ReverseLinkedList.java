
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ReverseLinkedList {
    Node head,tail;
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
        head=newNode;
       }
       else{
        newNode.next=head;
        head=newNode;
       }
       }
       public void reverse  (){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next; 
        }
        head=prev;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ReverseLinkedList ll=new ReverseLinkedList();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.addfirst(50);
        ll.print();
        ll.reverse();
        ll.print();
        

    }
}
    

