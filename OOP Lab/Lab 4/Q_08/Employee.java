package Q_08;

class Employee {
    String name;
    int id;
    String department;

    Employee() {
        this.name = "Unknown";
        this.id = 0;
        this.department = "General";
    }

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }
}