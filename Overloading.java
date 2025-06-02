public class Overloading {
    public class Method {
        public void print() {
            System.out.println("Empty print method");
        }
        
        public void print(String message) {
            System.out.println("The message is: " + message);
        }
        
        public void print(int number) {
            System.out.println("The integer value is: " + number);
        }
        
        public void print(double number) {
            System.out.println("The double value is: " + number);
        }
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        Method methodObj = obj.new Method();
        methodObj.print();
        methodObj.print("Hello, World!");
        methodObj.print(42);
        methodObj.print(30.);
    }
}
