package Q_04;

public class Employee {
    int id;
    String name;
    double basicSalary;
    float taxPercent;
    double bonusAmount;
    double netSalary;

    Employee() {
        this.id = 0000;
        this.name = "Unknown";
        this.basicSalary = 0.0;
        this.taxPercent = 0;
        this.bonusAmount = 0.0;
        this.netSalary = 0.0;
    }

    Employee(int id, String name, double basicSalary, float taxPercent, double bonusAmount) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.taxPercent = taxPercent;
        this.bonusAmount = bonusAmount;
        this.netSalary = basicSalary - (basicSalary * taxPercent/100) + bonusAmount;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nName: " + name + "\nBasic Salary: " + basicSalary + "\nTax Deduction: " + taxPercent + "%\nBonus: " + bonusAmount + "\nNet Salary: " + netSalary;
    }

    @Override
    protected void finalize() {
        System.out.println("\nEmployee record deleted: " + this.id);
    }
}
