import java.util.ArrayList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Doctor extends Person {
    String specialization;
    int doctorID;
    ArrayList<Patient> patients = new ArrayList<>();    // Aggregation
    Department department;  // Composition

    Doctor(String name, int age, String specialization, int doctorID, Department d) {
        super(name, age);
        this.specialization = specialization;
        this.doctorID = doctorID;
        this.department = d;
    }

    void displayDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor Age: " + age);
        System.out.println("Doctor Specialization: " + specialization);
        System.out.println("Doctor ID: " + doctorID);
        System.out.println("Department: " + department);
        System.out.println();
    }

    @Override
    public String toString() {
        return name + " (" + specialization + ")";
    }
}

class Patient extends Person {
    int patientID;
    String disease;
    Doctor doctor;

    Patient(String name, int age, int patientID, String disease) {
        super(name, age);
        this.patientID = patientID;
        this.disease = disease;
    }

    void displayDetails() {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Patient ID: " + patientID);
        System.out.println("Patient Disease: " + disease);
        System.out.println("Doctor Assigned: " + doctor);
        System.out.println();
    }
}

class Department {
    String name;
    String location;

    Department(String name, String location) {
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return name + " (" + location + ")";
    }
}

public class Task_07 {
    public static void main(String[] args) {

        Department dept = new Department("Cardiology", "Karachi");
        Doctor doctor = new Doctor("Hassaan", 40, "Cardiologist", 3654, dept);

        Patient patient = new Patient("Imran", 28, 979, "Bone Fracture");
        patient.doctor = doctor;

        doctor.displayDetails();

        patient.displayDetails();
    }
}