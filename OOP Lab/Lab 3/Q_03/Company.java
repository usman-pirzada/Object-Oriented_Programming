package Q_03;

import java.util.ArrayList;

public class Company {
    String name;
    String industryType;
    String jobRole;
    String[] requiredSkills = new String[3];

    // Constructor
    Company(String name, String industryType, String jobRole, String[] requiredSkills) {

    }

    // Methods
    boolean scheduleInterview(Student student) {
        boolean flag = false;

//        Student st = (Student) student;

        if(jobRole.equals(student.jobRequired)) {
            int i=0;

            for(String studentSkills: student.skills) {
                if(studentSkills.equals(requiredSkills[i])) flag=true;
                i++;
            }
        }

        return flag;
    }

    static void displayAllCompaniesDetails(Company[] company) {
        for(Company comp: company) {
            System.out.println("\nCompany Name: " + comp.name);
            System.out.println(comp.industryType);
            System.out.println(comp.jobRole);
            for (String skills: comp.requiredSkills) {
                System.out.println("   -" + skills);
            }
        }
    }
}