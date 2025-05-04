package Practice;

import java.util.Scanner;

public class ConstructorChaining {
    String studentName;
    String id;
    int semesterNo;

    ConstructorChaining(String studentName, String id) {
        this.studentName = studentName;
        this.id = id;
        this.semesterNo = 4;
    }

    ConstructorChaining(String studentName, String id, int semesterNo) {
        this(studentName, id);
        this.semesterNo = semesterNo;
    }

    public String toString() {
        return "\nName: " + studentName + "\nID: " + id + "\nSemester No: " + semesterNo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\tRegistering 4th semester students for Procom....");
        System.out.print("Enter your Name: ");
        String stName = sc.nextLine();
        System.out.print("Enter your ID: ");
        String id = sc.nextLine();
        ConstructorChaining student1 = new ConstructorChaining(stName, id);

        System.out.println();
        System.out.println("\tRegistering other FASTians for Procom....");
        System.out.print("Enter your Name: ");
        stName = sc.nextLine();
        System.out.print("Enter your ID: ");
        id = sc.nextLine();
        System.out.print("Enter your semester number: ");
        int sem = sc.nextInt();
        ConstructorChaining student2 = new ConstructorChaining(stName, id, sem);

        System.out.println("\n1st Student:" + student1);
        System.out.println("\n2nd Student:" + student2);
    }
}