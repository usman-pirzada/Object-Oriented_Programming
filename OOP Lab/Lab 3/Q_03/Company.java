package Q_03;

import java.util.ArrayList;

public class Company {
    String name;
    String industryType;
    String jobRole;
    String[] requiredSkills = new String[3];
    ArrayList<String> scheduledStudents = new ArrayList<>();    // Holds scheduled-interview students & their rollno as String

    // Constructor
    Company(String name, String industryType, String jobRole, String[] requiredSkills) {
        this.name = name;
        this.industryType = industryType;
        this.jobRole = jobRole;
        this.requiredSkills = requiredSkills.clone();
    }

    // Methods
    boolean scheduleInterview(Student student) {
        boolean flag = false;

        for (String requiredSkill : this.requiredSkills) {
            for (String studentSkills : student.skills) {
                if (studentSkills.equals(requiredSkill)) {
                    flag = true;
                    this.scheduledStudents.add(student.name + " (" + student.rollNo + ")");
                    break;
                }
            }
        }

        return flag;
    }

    static void displayDetails(Company[] company) {
        System.out.println("\n----------------------------------");
        for (Company comp : company) {
            System.out.println("Company Name: " + comp.name);
            System.out.println("Industry Type: " + comp.industryType);
            System.out.println("Job Role: " + comp.jobRole);
            System.out.println("Skills Required: ");
            for (String skills : comp.requiredSkills) {
                System.out.println("   -" + skills);
            }
            System.out.println("----------------------------------");
        }
    }
}