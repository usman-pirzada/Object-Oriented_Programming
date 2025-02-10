package Q_04;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course course = new Course();

        System.out.println("\tWelcome to Course Enrollment System!");

        System.out.print("Enter Course Name: ");
        course.setName(sc.nextLine());

        System.out.print("Enter Course Code: ");
        course.setCode(sc.next());

        System.out.print("Enter credit hours of the course: ");
        course.setCreditHours(sc.nextInt());

        System.out.println();
        System.out.println("Course with the following details have been saved!");
        System.out.println(" ->Course Name: " + course.getName());
        System.out.println(" ->Course Code: " + course.getCode());
        System.out.println(" ->Credit Hours: " + course.getCreditHours());
    }
}
