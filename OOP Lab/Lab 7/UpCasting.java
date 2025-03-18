//Upcasting
class Employee {
    void calculateSalary() {
        System.out.println("Employee Salary");
    }
}

class FullTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Full-Time Employee Salary");
    }
}

class PartTimeEmployee extends Employee {
    void calculateSalary() {
        System.out.println("Part-Time Employee Salary");
    }
}

public class UpCasting {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();

        e1.calculateSalary();
        e2.calculateSalary();
    }
}
