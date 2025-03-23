class MedicalRecord {
    String illnessHistory;
    String prescriptions;
    String doctorNotes;
    String testResults;

    MedicalRecord() {

    }

    MedicalRecord(MedicalRecord medicalRecord) {
        this.illnessHistory = medicalRecord.illnessHistory;
        this.prescriptions = medicalRecord.prescriptions;
        this.doctorNotes = medicalRecord.doctorNotes;
        this.testResults = medicalRecord.testResults;
    }

    @Override
    public String toString() {
        return "  Illness History: " + illnessHistory +
                "\n  Prescriptions: " + prescriptions +
                "\n  Doctor Notes: " + doctorNotes +
                "\n  Test Results: " + testResults;
    }
}

class Patient {
    String name;
    int ID;
    static int totPatients;
    MedicalRecord mRecord;

    Patient(String name, MedicalRecord mRecord) {
        this.name = name;
        this.mRecord = mRecord;
        this.ID = totPatients++;
    }

    @Override
    public String toString() {
        return "Patient Name: " + name +
                "\nPatient ID: " + ID +
                "\n\tMedical Record:" + "\n\t==============\n" + mRecord.toString();
    }
}

public class Q_02 {
    public static void main(String[] args) {
        
        MedicalRecord medicalRecord = new MedicalRecord();
        medicalRecord.illnessHistory = "Flu, Cold";
        medicalRecord.prescriptions = "Paracetamol, Vitamin C";
        medicalRecord.doctorNotes = "Patient needs rest and hydration.";
        medicalRecord.testResults = "Blood test normal";

        Patient patient = new Patient("Hammad", medicalRecord);

        System.out.println(patient);

    }
}