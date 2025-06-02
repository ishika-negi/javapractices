public class Traversal{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

    }
    
    }

public static Node head;
public void printlinkedlist(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"-->");
        temp=temp.next;
    }
    System.out.println("null");
    
}
public void addlast(int data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;

    }
    temp.next=newNode;
}
public static void main(String[] args) {
    Traversal list=new Traversal();
    list.addlast(1);
    list.addlast(2);
    list.addlast(3);
    list.addlast(4);
    list.printlinkedlist();
}
}
