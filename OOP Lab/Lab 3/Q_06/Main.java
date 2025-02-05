package Q_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to message displayer. Enter the required details below:");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        System.out.print("Enter your course: ");
        String course = sc.nextLine();

        Student st = new Student(name, age, course);

        System.out.println(st);
    }
}