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
        students.add(new Student("Zeeshan", "Software Engineer", new ArrayList<>(Arrays.asList("Python", "C++"))));
        students.add(new Student("Abuzar", "Data Analyst", new ArrayList<>(Arrays.asList("Typescript", "Machine Learning"))));
        students.add(new Student("Nabeel", "Software Engineer", new ArrayList<>(Arrays.asList("Machine Learning", "C++"))));
        students.add(new Student("Adeel", "Data Analyst", new ArrayList<>(Arrays.asList("Power BI", "C++"))));
        students.add(new Student("Nadeem", "Software Engineer", new ArrayList<>(Arrays.asList("Python", "React"))));

        while (true) {
            System.out.println("\nSelect an option to proceed:");
            System.out.println("1) Schedule an interview");
            System.out.println("2) Display all companies details");
            System.out.println("3) View All Scheduled Interviews");
            System.out.println("3) Exit");
            int option = sc.nextInt();
            switch (option) {
                case 1:
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
                    }
                    break;

                case 2:
                    Company.displayDetails(company);
                    break;

                case 3:
                    System.out.println(); // schedules
                    break;

                case 4:
                    System.out.println("ThankYou for using this program. Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}