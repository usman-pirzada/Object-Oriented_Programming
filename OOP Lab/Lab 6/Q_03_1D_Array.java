import java.util.Scanner;

public class Q_03_1D_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        double[] marksArr = new double[n];
        double sum = 0;
        double highest = Double.MIN_VALUE;
        double lowest = Double.MAX_VALUE;

        // Input marks in array
        for (int i = 0; i < n; i++) {
            while(true) {
                System.out.print("Enter marks for student #" + (i + 1) + " (0-100 marks): ");
                double marks = scanner.nextDouble();
                if (marks >= 0 && marks <= 100) {
                    marksArr[i] = marks;
                    sum += marks;
                    if (marks > highest) highest = marks;
                    if (marks < lowest) lowest = marks;
                    break;
                } else {
                    System.out.println("Invalid marks. Please enter a value between 0 and 100.");
                }
            }
        }

        // Calculating average marks of the class
        double average = sum / n;

        // Counting above average students
        int aboveAverageCount = 0;
        for (double marks : marksArr) {
            if (marks > average) {
                aboveAverageCount++;
            }
        }

        System.out.println("\n\tClass Statistics:");
        System.out.println("\t================");
        System.out.println("Average marks: " + average);
        System.out.println("Highest marks: " + highest);
        System.out.println("Lowest marks: " + lowest);
        System.out.println("Number of Students Above Average: " + aboveAverageCount);

    }
}
