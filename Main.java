class Car {
    void Colour() {
        System.out.println("Red");
        
        }
        void modelno(){
            System.out.println("25");
    }
    void engine(){
        System.out.println("r20");
    }
}
class Bmw extends Car {
    void Colour() {  
        System.out.println("Colour is red");
    }
    void engine(){
        System.out.println("rj");
    }
}
public class Main {
    public static void main(String[] args) {
        Car c = new Bmw();  
        c.Colour(); 
        Car d=new Bmw();
        d.engine();
    }
}


