package Q_03;

public class Company {
    String name;
    String industryType;
    String jobRole;
    String[] requiredSkills = new String[3];

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
                    break;
                }
            }
        }

        return flag;
    }

    static void displayDetails(Company[] company) {
        for(Company comp: company) {
            System.out.println("\nCompany Name: " + comp.name);
            System.out.println(comp.industryType);
            System.out.println(comp.jobRole);
            for (String skills: comp.requiredSkills) {
                System.out.println("   -" + skills);
            }
        }
    }

//    static void displayNames(Company[] company) {
//
//    }
}