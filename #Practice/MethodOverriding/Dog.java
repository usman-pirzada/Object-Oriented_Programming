package MethodOverriding;

public class Dog extends Animal {
    String age = "Dog Age";

    @Override
    void sound() {
        System.out.println("Dog produces Woof Woof");
    }

    void sayHello() {
        System.out.println("Dog says Hello!");
    }
}