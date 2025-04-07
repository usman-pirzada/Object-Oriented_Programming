package MethodOverriding;

public class Cat extends Animal {
    String age = "Cat Age";
    String catFood = "Cat Food";

    @Override
    void sound() {
        System.out.println("Cat produces Meow Meow");
    }
}