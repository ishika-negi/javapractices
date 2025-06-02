class Student{
    String name;
    int roll;
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
public class Constructor {
    public static void main(String args[]){
        Student s1=new Student("ishika");
        System.out.println(s1.name);
        Student s2=new Student(40);
        System.out.println(s2.roll);
    }
    
}

