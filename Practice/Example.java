class Example {
    static int num = 10; // Static variable

    // Constructor (no 'static' needed)
    Example() {
        num++; // Increment num each time an object is created
    }

    // Static method
    static void display() {
        System.out.println("Number is: " + num);
    }

    public static void main(String args[]) {
        new Example(); // Create an object (increments num)
        Example.display(); // Correct class name and method call
    }
}
