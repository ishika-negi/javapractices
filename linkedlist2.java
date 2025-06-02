class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class linkedlist2 {
    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        
    }
    public int removefirst(){
        int val=head.data;
        head=head.next;
        return val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;

        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        linkedlist2 list=new linkedlist2();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        
        System.out.println("Before : ");
        list.display();
        list.removefirst();
        System.out.println("AFTER : ");
        list.display();
        
    }  
}
