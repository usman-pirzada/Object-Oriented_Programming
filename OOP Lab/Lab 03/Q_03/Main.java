package Q_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Hardcoded Companies
        Company[] company = new Company[2];
        company[0] = new Company("Systems Limited", "IT", "Software Engineers", new String[]{"Java", "Python", "SQL"});
        company[1] = new Company("Folio3", "IT", "Data Analysts", new String[]{"Machine Learning", "Python", "Power BI"});

        // Hardcoded Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Zeeshan", "20K-4012", "Software Engineer", new ArrayList<>(Arrays.asList("Python", "C++"))));
        students.add(new Student("Abuzar", "21K-3576", "Data Analyst", new ArrayList<>(Arrays.asList("Typescript", "Machine Learning"))));
        students.add(new Student("Nabeel", "22K-1022", "Software Engineer", new ArrayList<>(Arrays.asList("Machine Learning", "C++"))));
        students.add(new Student("Adeel", "21K-2312", "Data Analyst", new ArrayList<>(Arrays.asList("Power BI", "C++"))));
        students.add(new Student("Nadeem", "23K-5446", "Software Engineer", new ArrayList<>(Arrays.asList("Python", "React"))));

        while (true) {
            System.out.println("\n\t\tMenu");
            System.out.println("1) Schedule an interview");
            System.out.println("2) Display all companies details");
            System.out.println("3) View All Scheduled Interviews");
            System.out.println("4) Exit");
            System.out.print("Enter a number to select an option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1: // Schedule Interview
                    System.out.println();
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i+1) + ") " + students.get(i));
                    }

                    System.out.print("For which student do you want to schedule interview: ");
                    int stNum = (sc.nextInt());
                    if(stNum > students.size() || stNum < 0) {
                        System.out.println("\n Input Invalid!!");
                        continue;
                    }
                    stNum--;

                    System.out.println("Select company to schedule interview with:");
                    for (int i = 0; i < company.length; i++) {
                        System.out.println((i+1) + ") " + company[i].name);
                    }
                    int cmpNum = sc.nextInt();
                    if(cmpNum > company.length || cmpNum < 0) {
                        System.out.println("\n Input Invalid!!");
                        continue;
                    }
                    cmpNum--;

                    if(company[cmpNum].scheduleInterview(students.get(stNum))) {
                        System.out.println("Interview scheduled succssfully!");
                    } else {
                        System.out.println("Unable to schedule interview! (No skills matched with the company's requirements.)");
                    }

                    break;

                case 2: // Display Company Details
                    Company.displayDetails(company);
                    break;

                case 3: // Display Sheduled Events
                    System.out.println("\n----------------------------------");
                    System.out.println("   Scheduled Interviews");
                    for (int i = 0; i < company.length; i++) {
                        System.out.println("\nCompany Name: " + company[i].name);
                        System.out.println("Interview Scheduled:");
                        if(company[i].scheduledStudents.isEmpty()) {
                            System.out.println("   No Interview Scheduled!!");
                            System.out.println("\n----------------------------------");
                            continue;
                        }

                        for (int j = 0; j < company[i].scheduledStudents.size(); j++) {
                            System.out.println("   -" + company[i].scheduledStudents.get(j));
                        }
                        System.out.println("\n----------------------------------");
                    }

                    break;

                case 4: // Exit
                    System.out.println("ThankYou for using this program. Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}