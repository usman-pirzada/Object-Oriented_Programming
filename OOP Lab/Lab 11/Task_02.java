import java.util.ArrayList;
import java.util.List;

class AdmissionRecords<T> {
    private List<T> records;

    AdmissionRecords() {
        this.records = new ArrayList<>();
    }

    void addRecord(T record) {
        this.records.add(record);
    }

    void printRecords() {
        System.out.println();
        for (T record : records) {
            System.out.println(record);
        }
    }
}

class Task_02 {
    public static void main(String[] args) {

        AdmissionRecords<String> nameRecords = new AdmissionRecords<>();
        nameRecords.addRecord("Zeeshan");
        nameRecords.addRecord("Hamza");
        nameRecords.addRecord("Bilal");
        nameRecords.addRecord("Huzaifa");

        AdmissionRecords<Double> scoreRecords = new AdmissionRecords<>();
        scoreRecords.addRecord(89.2);
        scoreRecords.addRecord(74.5);
        scoreRecords.addRecord(87.3);
        scoreRecords.addRecord(88.0);


        nameRecords.printRecords();
        scoreRecords.printRecords();
    }
}