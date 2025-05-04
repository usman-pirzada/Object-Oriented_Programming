import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many students do you wish to process grades for? ");
        int numOfSt = sc.nextInt();

        int[] marks = new int[numOfSt];

        for(int i=0; i<marks.length; i++) {
            System.out.print("Enter grade for student-" + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }

        int total = 0;
        for(int value: marks) {
            total += value;
        }

        int avg = total/numOfSt;

        int failed = 0;
        for(int value: marks) {
            if(value < 60) failed++;
        }
        int passed = numOfSt - failed;

        System.out.println("************* Results **************");
        System.out.println("Total number of students: " + numOfSt);
        System.out.println("Average grade: " + avg);
        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed (grade < 60): " + failed);
    }
}
