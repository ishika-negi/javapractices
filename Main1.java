
interface Engine {
    void engineType();
}

interface Features {
    void carFeatures();
}
class Vehicle {
    void category() {
        System.out.println("This is a Vehicle");
    }
}
class Sedan extends Vehicle implements Engine{
    public void engineType() {
        System.out.println("Sedan Engine: Hybrid");
    }
}
class SUV extends Vehicle implements Engine {
    public void engineType() {
        System.out.println("SUV Engine: Diesel");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Sedan mySedan = new Sedan();
        mySedan.category();     
        mySedan.engineType();    
        SUV mySUV = new SUV();
        mySUV.category();       
        mySUV.engineType();     
    }
}

