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
    ArrayList<Patient> patients = new ArrayList<>();

    Doctor(String name, int age, String specialization, int doctorID) {
        super(name, age);
        this.specialization = specialization;
        this.doctorID = doctorID;
    }

    void displayDetails() {
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor Age: " + age);
        System.out.println("Doctor Specialization: " + specialization);
        System.out.println("Doctor ID: " + doctorID);
        System.out.println();
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
        System.out.println("Doctor Assigned: " + doctor.name);
        System.out.println();
    }
}

class Department {
    String name;
    String location;
    ArrayList<Doctor> doctors = new ArrayList<>();

    Department(String name, String location, Doctor d) {
        this.name = name;
        this.location = location;
        this.doctors.add(d);
    }

    void displayDetails() {
        System.out.println("Department Name: " + name);
        System.out.println("Department Location: " + location);
        System.out.println("Doctors: " + doctors);
        System.out.println();
    }
}

public class Task_08 {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Hassaan", 40, "Cardiologist", 3654);
        Department dept = new Department("Cardiology", "Karachi", doctor);

        Patient patient = new Patient("Imran", 28, 979, "Bone Fracture");
        patient.doctor = doctor;

        doctor.displayDetails();
        dept.displayDetails();

        patient.displayDetails();
    }
}
