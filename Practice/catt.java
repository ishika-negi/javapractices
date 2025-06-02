class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow meow!");
    }
}

public class catt {
    public static void main(String[] args) {
        Cat myAnimal = new Cat(); // Runtime polymorphism
        myAnimal.makeSound(); // Calls overridden method
    }
}
