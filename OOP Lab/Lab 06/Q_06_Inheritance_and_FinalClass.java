class Employee {
    int ID;
    String name;
    double salary;

    static int employeeCount;

    Employee(String name, double salary) {
        this.ID = ++employeeCount;
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    String prog_lang;
    private boolean isProficient;

    Developer(String name, double salary, String prog_lang, boolean isProficient) {
        super(name, salary);
        this.prog_lang = prog_lang;
        this.isProficient = isProficient;
    }

    boolean checkProficiency() {
        if(this.isProficient) return true;
        
        return false;
    }
}

final class SoftwareArchitect extends Developer {
    int projectsCount;

    SoftwareArchitect(String name, double salary, String prog_lang, boolean isProficient, int projectsCount) {
        super(name, salary, prog_lang, isProficient);
        this.projectsCount = projectsCount;
    }

    boolean checkEligibility() {
        if(this.projectsCount >= 5) return true;
        
        return false;
    }
}

public class Q_06_Inheritance_and_FinalClass {
    public static void main(String[] args) {

        // Create an Employee object
        Employee emp = new Employee("Hammad", 50000);
        System.out.println("Employee Details:");
        System.out.println("ID: " + emp.ID);
        System.out.println("Name: " + emp.name);
        System.out.println("Salary: " + emp.salary);
        System.out.println();

        // Create a Developer object
        Developer dev = new Developer("Ali", 70000, "Java", true);
        System.out.println("Developer Details:");
        System.out.println("ID: " + dev.ID);
        System.out.println("Name: " + dev.name);
        System.out.println("Salary: " + dev.salary);
        System.out.println("Programming Language: " + dev.prog_lang);
        System.out.println("Proficient in Java: " + dev.checkProficiency());
        System.out.println();

        // Create a SoftwareArchitect object
        SoftwareArchitect architect = new SoftwareArchitect("Hamza", 120000, "Java", true, 6);
        System.out.println("Software Architect Details:");
        System.out.println("ID: " + architect.ID);
        System.out.println("Name: " + architect.name);
        System.out.println("Salary: " + architect.salary);
        System.out.println("Programming Language: " + architect.prog_lang);
        System.out.println("Proficient in Java: " + architect.checkProficiency());
        System.out.println("Projects Count: " + architect.projectsCount);
        System.out.println("Eligible for Promotion: " + architect.checkEligibility());
    }
}