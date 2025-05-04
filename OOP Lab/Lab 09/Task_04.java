abstract class Animal {

    abstract void says();
}

class Cat extends Animal {

    void says() {
        System.out.println("Cat says meow meow");
    }
}

class Dog extends Animal {

    void says() {
        System.out.println("Dog barks");
    }
}

public class Task_04 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.says();

        Dog dog = new Dog();
        dog.says();
    }
}