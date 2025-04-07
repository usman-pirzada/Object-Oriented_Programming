package Q_04;

import java.util.ArrayList;

class TA extends Student {
    ArrayList<Student> assignedStudents;

    TA(String name, int id, String email, String pass) {
        super(name, id, email, pass);
        assignedStudents = new ArrayList<>();
    }

    TA(String name, int id, String email, String pass, ArrayList<String> permissions) {
        super(name, id, email, pass);
        permissions = new ArrayList<>(permissions);
    }
    
    void viewProjects() {

    }

    void assignStudent(Student student) {
        if(assignedStudents.size() <= 2) {
            this.assignedStudents.add(student);
        } else {
            System.out.println("Unable to assign the student. (No more tha two students can be assigned to a TA)");
        }
    }

    void manageStudents() {

    }

    @Override
    void display() {
        System.out.print("TA & ");
        super.display();
    }
}