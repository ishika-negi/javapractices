public class Copycons {
    public static void main(String args[]) {
        Student s1 = new Student();  // This will now work
        s1.name = "ishika";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1); // Copy constructor is called here
        s2.password = "xyz"; // Modify password for s2

        // Print s2 marks
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // No-argument constructor
    Student() {
        marks = new int[3]; // Initialize marks array with default size
    }

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;

        // Deep copy of marks array
        this.marks = new int[s1.marks.length]; // Ensure to copy the size of the original array
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
