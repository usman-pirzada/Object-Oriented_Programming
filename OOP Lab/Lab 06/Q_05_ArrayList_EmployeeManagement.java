import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    private static int employeeCount;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.id = ++employeeCount;
    }
}

public class Q_05_ArrayList_EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Employee e1 = new Employee("Ahmed Ali", "IT", 75000);
        Employee e2 = new Employee("Hassan Raza", "Finance", 80000);
        Employee e3 = new Employee("Usman Tariq", "HR", 72000);
        Employee e4 = new Employee("Bilal Khan", "Marketing", 68000);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Search Employees by Department");
            System.out.println("4. Calculate Average Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    employees.add(new Employee(name, department, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    System.out.println("Employee List:");
                    for (Employee emp : employees) {
                        System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Department: " + emp.department + ", Salary: " + emp.salary);
                    }
                    break;

                case 3:
                    System.out.print("Enter department to search: ");
                    String searchDept = scanner.nextLine();
                    System.out.println("Employees in " + searchDept + " department:");
                    boolean found = false;
                    for (Employee emp : employees) {
                        if (emp.department.equalsIgnoreCase(searchDept)) {
                            System.out.println("-> ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("No employees found in " + searchDept + " department.");
                    }
                    break;

                case 4:
                    double totalSalary = 0;
                    for (Employee emp : employees) {
                        totalSalary += emp.salary;
                    }
                    double averageSalary = employees.isEmpty() ? 0 : totalSalary / employees.size();
                    System.out.println("Average Salary: " + averageSalary);
                    break;

                case 5:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}