class Animal {
    public void sound() {
        System.out.println("Some sound.");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
