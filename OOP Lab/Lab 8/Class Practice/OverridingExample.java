package Class_Practice;

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meaows");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow moo");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();

        animal.sound();
        dog.sound();
        cat.sound();
        cow.sound();
    }
}