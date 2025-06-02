class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class addlast {
    Node head;
    Node tail;
    
    public void addnum( int data){
        Node n=new Node( data);
        if(head==null){
            tail=head=n;
            return;

        }
        head=head.next;
        head.next=head.next.next;
    


    } 
    public void printlinkedlist(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        addlast ll=new addlast();
        ll.addnum(10);
        ll.addnum(20);
        ll.addnum(30);
        ll.addnum(40);
        ll.printlinkedlist();
        
    }

    
}
