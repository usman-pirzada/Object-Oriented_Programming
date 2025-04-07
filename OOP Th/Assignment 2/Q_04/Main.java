package Q_04;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Permissions
        ArrayList<String> student_permissions = new ArrayList<>() {{ add("submit assignment"); }};
        ArrayList<String> ta_permissions = new ArrayList<>() {{ add("view projects"); add("manage students"); }};
        ArrayList<String> prof_permissions = new ArrayList<>() {{ add("assign projects"); add("access lab"); }};

        // Creating users
        Student student = new Student("Usman", 646, "student@email.com", "a978ojx", student_permissions);
        TA ta = new TA("Raza", 134, "ta@student.com", "af544", ta_permissions);
        Professor prof = new Professor("Abdullah", 458, "prof@email", "e44R46", prof_permissions);

        User.authenticateAndPerformAction(student, "view projects");
    }
}