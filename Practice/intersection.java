class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class intersection {
 
    public Node intersection(Node head1,Node head2){
         Node temp1=head1,temp2=head2;
       
        while(temp1!=null){
            
            while(temp2!=null){
               
                if(temp1==temp2){
                    return temp1;
                }
                 temp2=temp2.next;
            }
               temp2=head2;
               temp1=temp1.next;

        }
        return null;
           
       
    }
   public static void main(String[] args) {
     intersection ll=new intersection();
    Node common=new Node(6);
    common.next=new Node(7);
    Node head1=new Node(1);
    head1.next=new Node(2);
    head1.next.next=new Node(3);
    head1.next.next.next=common;
    
   
    Node head2=new Node(4);
    head2.next=new Node(5);
    head2.next.next=common;
    
    Node result=ll.intersection(head1, head2);
    System.out.println(result.data);


    
   }
}
