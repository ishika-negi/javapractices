public class Oops {
   public static void main(String[] args) {
       System.out.println("This is our custom class");
       employee ishika =new employee();
       ishika.id=27;
       ishika.name="Rohan";
       employee rohan=new employee();
       rohan.id=9;
       rohan.name="ishika";
   ishika.printdetails();
   rohan.printdetails();
   }
   
    
}
class employee{
    int id;
    String name;
    public void printdetails(){
        System.out.println("my id is "+id);
        System.out.println("and my name is "+name);
    }
}

