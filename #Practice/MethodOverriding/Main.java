package MethodOverriding;

public class Main {

    public static void main(String[] args) {

        Animal a1 = new Dog();  // Upcasting
        a1.sound();

        Animal a2 = new Cat();  // Upcasting
        a2.sound();


        // Downcasting
        Dog d = (Dog) a1;  // Downcasting Animal type to Dog
        d.sound();

        Cat c = (Cat) a2;  // Downcasting Animal type to Cat
        c.sound();

        a1 = new Cat();
        a1.sound();

        /*
         * Methods which are present in Child but not in parent class are not accessible by upcasting
         * But can be accessed after downcasting
         */
        Animal a3 = new Dog();  // Upcasting
        a3.sound(); // overriden method of Dog will run

        // Downcasting
        a3 = (Dog) a3;
        ((Dog) a3).sayHello();

        // Shadowiing
        ((Dog) a3).sayHello();
        Dog d1 = (Dog) a3;
        d1.sayHello();

        /*
         * If same variable exist in parent & child, then here parent variable will be printed
         * "catFood" variable can be accessed by shadowing/downcasting
         */
        Animal a4 = new Cat();
        System.out.println(a4.age); // animal age is printed
        a4.sound(); // cat sound method is activated
        System.out.println(((Cat) a4).age); // cat age variable is printed


        Cat c1 = new Cat();
        Animal a = (Cat) c1;    // Reference type & Object type
        System.out.println(a.age);  // animal age variable is printed
        a.sound();  // cat sound method is printed

        // ** This shows that overriden method is printed, but for variable the parent variable is printed after upcasting & before downcasting/shadowing
    }
}