// File Manager in JAVA by Sir Minhal Raza

import java.io.*;
import java.util.List;
import java.util.ArrayList;

class Student implements Serializable {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class StudentManager {
    static final String FILE_NAME = "students.txt";

    // Write all students to file
    static void writeToFile(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Read all students from file
    static List<Student> readFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (List<Student>) ois.readObject();
        } catch (Exception e) {
            return new ArrayList<>(); // return empty list if file not found or error
        }
    }

    // Add new student
    static void addStudent(Student student) {
        List<Student> students = readFromFile();
        students.add(student);
        writeToFile(students);
    }

    // Search student by ID
    static void searchStudent(int id) {
        List<Student> students = readFromFile();
        for (Student s : students) {
            if (s.id == id) {
                System.out.println("Found: " + s);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Update student by ID
    static void updateStudent(int id, String newName, int newAge) {
        List<Student> students = readFromFile();
        boolean updated = false;
        for (Student s : students) {
            if (s.id == id) {
                s.name = newName;
                s.age = newAge;
                updated = true;
                break;
            }
        }
        if (updated) {
            writeToFile(students);
            System.out.println("Student updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete student by ID
    static void deleteStudent(int id) {
        List<Student> students = readFromFile();
        boolean removed = students.removeIf(s -> s.id == id);
        if (removed) {
            writeToFile(students);
            System.out.println("Student deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Add students
        addStudent(new Student(1, "Ali", 20));
        addStudent(new Student(2, "Sara", 22));

        // Display all
        System.out.println("All Students:");
        readFromFile().forEach(System.out::println);

        // Search
        searchStudent(1);

        // Update
        updateStudent(1, "Ali Raza", 21);

        // Delete
        deleteStudent(2);

        // Display after changes
        System.out.println("After Update/Delete:");
        readFromFile().forEach(System.out::println);
    }
}


