package Q_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Student {
    String name;
    int rollNo;
    ArrayList<String> courses = new ArrayList<>();   // Max. 8 courses allowed

    Student() { // Default Constructor (to be used in enroll method)
    }

    Student(String name, int rollNo, String[] courses) {   // Parameterized Constructor
        this.name = name;
        this.rollNo = rollNo;

        /* In this context, a shallow copy is sufficient because String objects in Java are immutable.
           This means that even if you copy the reference to the String object,
           the original and the copy cannot be modified, ensuring data integrity.
           Therefore, you can simplify the code by directly adding the String objects to the courses list
           without creating new instances.
         */
        this.courses.addAll(Arrays.asList(courses));

//        todo: understand here for deep & shallow copy d/f & usage
//        for(String course: courses) {
//            this.courses.add(new String(course));   // new used to ensure deep copy
//        }
    }


    // ****** Methods ******
    static void enroll(ArrayList<Student> students, String name, Scanner sc) {
        students.add(new Student());

        students.getLast().name = name;
        students.getLast().rollNo = students.size();

        System.out.println("Enter your courses below: (Write \"end\" to finish)");
        System.out.print("Enter course name: ");
        while(true) {
            String course = sc.nextLine();
            if(course.equalsIgnoreCase("end")) break;

            students.getLast().courses.add(course);

            System.out.print("Enter next course: ");
        }

        System.out.println("\n" + students.getLast().name + " has been enrolled in FAST NUCES Karachi Campus!");
    }

    void updateName(Scanner sc) {
        String newName;

        sc.nextLine();
        System.out.print("Enter new name: ");
        newName = sc.nextLine();

        this.name = newName;
        System.out.println("\n Name of the student changed successfully!");
    }

    static void displayStudents(ArrayList<Student> students) {
        System.out.println();
        System.out.println("  Students");
        for(int i=0; i<students.size(); i++) {
            System.out.print(" " + (i+1) + ") " + students.get(i).name + " (Roll# " + students.get(i).rollNo + ")");
            System.out.println(" [Courses Enrolled: " + students.get(i).courses + "]");
        }
    }
}