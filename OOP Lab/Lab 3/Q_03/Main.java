package Q_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Company[] company = new Company[2];

        ArrayList<Student> students = new ArrayList<>();

        // Hardcoded Companies
        Company c1 = new Company("Systems Limited", "IT", "Software Engineers", new String[]{"Java", "Python", "SQL"});
        Company c2 = new Company("Folio3", "IT", "Data Analysts", new String[]{"Machine Learning", "Python", "Power BI"});
        // Hardcoded Students
        students.add(new Student("Zeeshan", "Software Engineer", new ArrayList<>(Arrays.asList("Python", "C++"))));
        students.add(new Student("Abuzar", "Data Analyst", new ArrayList<>(Arrays.asList("Typescript", "Machine Learning"))));
        students.add(new Student("Nabeel", "Software Engineer", new ArrayList<>(Arrays.asList("Machine Learning", "C++"))));
        students.add(new Student("Adeel", "Data Analyst", new ArrayList<>(Arrays.asList("Power BI", "C++"))));
        students.add(new Student("Nadeem", "Software Engineer", new ArrayList<>(Arrays.asList("Python", "React"))));

        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("\nSelect an option to proceed:");
            System.out.println("1) Schedule an interview");
            System.out.println("2) Display company details");
            System.out.println("3) Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    Student.displayDetails(students);
                    System.out.println("For which student do you want to schedule interview:");
                    break;

                case 2:
                    Company.displayCompanyDetails();
                    break;

                case 3:
                    System.out.println("ThankYou for using this program. Good Bye!");
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}