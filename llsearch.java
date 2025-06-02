class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }
}
public class llsearch{
    Node head;
    public void addfirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;
    }
    public void printll(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" - > ");
            temp=temp.next;


        }
        System.out.println("null");
    }
    public void search(int key){
        Node temp=head;
        int count=0;
        boolean found=false;
        while(temp!=null){
            if(key==temp.data){
                System.out.println("key found at idx : " + count);
                found=true;
                break;
            }
            temp=temp.next;
            count++;
        }
        if(!found){
            System.out.println("key not found");
        }
    }
    public static void main(String[] args) {
        llsearch ll=new llsearch();
        ll.addfirst(10);
        ll.addfirst(20);
        ll.addfirst(30);
        ll.addfirst(40);
        ll.printll();
        ll.search(30);
    }
}
