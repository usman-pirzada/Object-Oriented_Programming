import java.util.ArrayList;

class Course {
    String courseName;
    String courseCode;
    ArrayList<Student> enrolledStudents;
    ArrayList<Instructor> instructors;
    ArrayList<Assignment> assignments;

    Course(String courseName, String courseCode, ArrayList<Student> enrolledStudents, ArrayList<Instructor> instructors, ArrayList<Assignment> assignments) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>(enrolledStudents);
        this.instructors = new ArrayList<>(instructors);
        this.assignments = new ArrayList<>(assignments);
    }

    void viewDetails() {
        System.out.println("Name: " + courseName + " (" + courseCode + ")");
        System.out.println("Enrolled Students: " + enrolledStudents.size());
        System.out.println("Assignments: " + assignments.size());
    }
}

class Assignment {
    String title;
    String dueDate;
    String description;
    Course course;

    Assignment(String title, String dueDate, String description, Course course) {
        this.title = title;
        this.dueDate = dueDate;
        this.description = description;
        this.course = course;
    }
}

class Instructor {
    String instructorID;
    String name;
    ArrayList<Course> courses;

    Instructor(String instructorID, String name, ArrayList<Course> courses) {
        this.instructorID = instructorID;
        this.name = name;
        this.courses = new ArrayList<>(courses);
    }

    void displayDetails() {
        System.out.println("Name: " + name + " (" + instructorID + ")");
        System.out.println("Teaching Courses: " + courses.size());
    }
}

class Student {
    String id;
    String name;
    ArrayList<Assignment> pendingAssignments;
    ArrayList<Course> enrolledCourses;

    Student(String id, String name, ArrayList<Assignment> pendingAssignments, ArrayList<Course> enrolledCourses) {
        this.id = id;
        this.name = name;
        this.pendingAssignments = new ArrayList<>(pendingAssignments);
        this.enrolledCourses = new ArrayList<>(enrolledCourses);
    }

    void viewDetails() {
        System.out.println("Name: " + name + " (" + id + ")");
        System.out.println("Enrolled Courses: " + enrolledCourses.size());
        System.out.println("Pending Assignments: " + pendingAssignments.size());
    }
}

public class Q_02 {
    public static void main(String[] args) {
        
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Instructor> instructors = new ArrayList<>();
        ArrayList<Assignment> assignments = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        // Create students
        Student s1 = new Student("S001", "John", new ArrayList<>(), new ArrayList<>());
        Student s2 = new Student("S002", "Alice", new ArrayList<>(), new ArrayList<>());
        students.add(s1);
        students.add(s2);

        // Create instructors
        Instructor i1 = new Instructor("I001", "Dr. Smith", new ArrayList<>());
        instructors.add(i1);

        // Create course
        Course c1 = new Course("Programming", "CS101", students, instructors, assignments);

        // Create assignments
        Assignment a1 = new Assignment("Lab 1", "2024-03-01", "Basic Programming", c1);
        assignments.add(a1);

        // Update relationships
        s1.enrolledCourses.add(c1);
        s2.enrolledCourses.add(c1);
        s1.pendingAssignments.add(a1);
        s2.pendingAssignments.add(a1);
        i1.courses.add(c1);

        

    }
}