package Q_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student st1 = new Student();
        System.out.println("\nDefault student created successfully!");

        System.out.println();
        System.out.println("Now create another student");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your ID: ");
        int id = sc.nextInt();
        System.out.print("Enter your GPA: ");
        float gpa = sc.nextFloat();
        System.out.println("Now creating another student with provided details...");
        Student st2 = new Student(name, id, gpa);

        System.out.println("\nDetails of the students created:");
        System.out.println("\n\tStudent 1");
        System.out.println(st1);
        System.out.println("\n\tStudent 2");
        System.out.println(st2);

        st1.finalize();
        st1 = null;
        st2.finalize();
        st2 = null;

        /*
        System.gc() was not executing the overridden finalize method, so finalize method is explicitly called.
        But after doing so, the System.gc() also started executing overridden finalize method.
        */

        System.gc();
    }
}