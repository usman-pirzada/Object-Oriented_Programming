package Q_02;

public class Student {
    private String name;
    private int id;
    private float gpa;

    Student() {    // Default Constructor
        this.name = "Default";
        this.id = 0000;
        this.gpa = 0.0f;
    }

    Student(String name, int id, float gpa) {    // Parameterized constructor
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    protected void finalize() {
        System.out.println("\nStudent \"" + name + "\" has been deleted successfully!");
    }

    @Override
    public String toString() {
        return "Student Name: " + name + "\nID: " + id + "\nGPA: " + gpa;
    }
}