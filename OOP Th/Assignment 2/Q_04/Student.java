package Q_04;

import java.util.ArrayList;

class Student extends User {
    private ArrayList<String> assignments;
    int assignmentSubmitStatus = 0;

    Student(String name, int id, String email, String pass) {
        super(name, id, email, pass);
        this.assignments = new ArrayList<>();
    }

    Student(String name, int id, String email, String pass, ArrayList<String> permissions) {
        super(name, id, email, pass);
        permissions = new ArrayList<>(permissions);
    }

    void assignAssignment(String assignment) {
        this.assignments.add(assignment);
        if(assignmentSubmitStatus == 1) assignmentSubmitStatus = 0;
    }

    void submitAssignment(int index) {
        this.assignments.remove(index);
        if(assignments.isEmpty()) assignmentSubmitStatus = 1;
    }

    void viewAssignments() {
        System.out.println("Pending Assignments:");
        for (int i = 0; i < assignments.size(); i++) {
            System.out.println(" "+ (i+1) + ") " + assignments.get(i));
        }
    }

    @Override
    void display() {
        System.out.print("Student ");
        super.display();
    }
}
