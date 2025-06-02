public class Calculator {
    public int calc(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public void calc(double a, double b) {
        System.out.println("Subtraction: " + (a - b));
    }
    public void calc(int a, int b, int c) {
        System.out.println("Multiplication: " + (a * b * c));
    }
    public void calc(double a, double b, double c) {
        System.out.println("Division: " + (a / b / c));
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();  
        int sum = obj.calc(5, 3);
        System.out.println("Sum of 5 + 3 = " + sum);  // Print the sum
        obj.calc(5.5, 3.2);  
        obj.calc(2, 3, 4);     
        obj.calc(12.0, 4.0, 3.0);  
    }
}
