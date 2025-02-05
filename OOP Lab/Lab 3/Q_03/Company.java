package Q_03;

public class Company {
    String name;
    String industryType;
    String jobRole;
    String[] requiredSkills = new String[3];

    void scheduleInterview(Student students) {
        boolean flag;

        if(jobRole.equals(students.jobRole)) {
            int i=0;

            for(String studentSkills: students.skills) {
                if(studentSkills.equals(requiredSkills[i])) flag=true;
                i++;
            }
        }
    }

    void displayCompanyDetails() {

    }
}