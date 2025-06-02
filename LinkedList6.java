class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedList6{
    Node head;
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
   public int itrsearch(int key){
    Node temp=head;
    int i=0;
    while(temp!=null){
        if(temp.data==key){
            return i;
        }
        temp=temp.next;
        i++;
    }
    return -1;
   }
   public void printlinkedlist(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" -> ");
        temp=temp.next;
    }
        System.out.println("null");
   }
   public static void main(String[] args) {
    LinkedList6 ll=new LinkedList6();
    ll.addfirst(10);
    ll.addfirst(20);
    ll.addfirst(30);
    ll.addfirst(40);
    ll.addfirst(50);
    ll.printlinkedlist();
    System.out.println("The index of the key is : "+ll.itrsearch(20) );

   }
   


}
