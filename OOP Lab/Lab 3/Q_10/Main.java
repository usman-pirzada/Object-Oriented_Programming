package Q_10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println();

        while (true) {
            System.out.println("\n  Operations");
            System.out.println(" 1) Enroll new student");
            System.out.println(" 2) List all students");
            System.out.println(" 3) Update student's name");
            System.out.println(" 4) Unroll a course");
            System.out.println(" 5) Unroll a student");
            System.out.println(" 6) Exit");
            System.out.print("Enter option number to select: ");
            switch (sc.nextInt()) {
                case 1: // Enroll
                    sc.nextLine();
                    System.out.print("Enter student's name to enroll: ");
                    Student.enroll(students, sc.nextLine(), sc);
                    break;

                case 2: // List All Students
                    if (students.isEmpty()) {
                        System.out.println("No students added yet!");
                        break;
                    }
                    Student.displayStudents(students);
                    break;

                case 3: // Update details
                    if (students.isEmpty()) {
                        System.out.println("No students added yet!");
                        break;
                    }
                    System.out.print("Enter student no. to update his name: ");
                    int index = (sc.nextInt()) - 1;
                    if(index > students.size() || index < 0) {
                        System.out.println("Invalid Input!!");
                        break;
                    }
                    students.get(index).updateName(sc);
                    break;

                case 4: // Unroll Course
                    if (students.isEmpty()) {
                        System.out.println("No students added yet!");
                        break;
                    }
                    Student.displayStudents(students);
                    System.out.print("Enter student no.: ");
                    int i = (sc.nextInt()) - 1;
                    if(i > students.size() || i < 0) {
                        System.out.println("Invalid Input!!");
                        break;
                    }
                    System.out.print("Enter course no.: ");
                    int j = (sc.nextInt()) - 1;
                    if(j > students.get(i).courses.size() || j < 0) {
                        System.out.println("Invalid Input!!");
                        break;
                    }

                    students.get(i).courses.remove(j);
                    System.out.println("\nCourse removed successfully!");
                    break;

                case 5: // Unroll Student
                    if (students.isEmpty()) {
                        System.out.println("No students added yet!");
                        break;
                    }
                    Student.displayStudents(students);
                    System.out.print("Enter student no. to remove: ");
                    int k = (sc.nextInt()) - 1;
                    if(k > students.size() || k < 0) {
                        System.out.println("Invalid Input!!");
                        break;
                    }

                    students.remove(k);
                    System.out.println("\nStudent removed successfully!");
                    break;

                case 6: // Exit
                    System.out.println("Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!!");
            }
        }
    }
}
