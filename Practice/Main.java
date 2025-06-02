interface animal{
    void speaks();
}
class Dog implements animal{
    public void speaks(){
        System.out.println("woof woof !");
    }
    
}
public class Main{
    public static void main(String args[]){
        Dog dg=new Dog();
        dg.speaks();
    }
}
