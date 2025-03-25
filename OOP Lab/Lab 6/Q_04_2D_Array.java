import java.util.Scanner;

public class Q_04_2D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter no. of students:");
        int m = sc.nextInt();

        System.out.println("Enter no. of weeks:");
        int w = sc.nextInt();

        short[][] twoD_Array = new short[m][w];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < w; j++) {
                twoD_Array[i][j] = sc.nextShort(); // Fixed index issue
            }
        }

        // Calculate total attendance for each student
        int[] studentTotals = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < w; j++) {
                studentTotals[i] += twoD_Array[i][j];
            }
        }

        // Calculate weekly attendance across all students
        int[] weeklyTotals = new int[w];
        for (int j = 0; j < w; j++) {
            for (int i = 0; i < m; i++) {
                weeklyTotals[j] += twoD_Array[i][j];
            }
        }

        // Calculate average class attendance
        int totalAttendance = 0;
        for (int total : studentTotals) {
            totalAttendance += total;
        }
        double averageAttendance = (double) totalAttendance / (m * w);

        /*
         * todo:
         */
        // Identify students with best and worst attendance
        int bestStudentIndex = 0, worstStudentIndex = 0;
        for (int i = 1; i < m; i++) {
            if (studentTotals[i] > studentTotals[bestStudentIndex]) {
                bestStudentIndex = i;
            }
            if (studentTotals[i] < studentTotals[worstStudentIndex]) {
                worstStudentIndex = i;
            }
        }

        // Display results
        System.out.println("Total attendance for each student:");
        for (int i = 0; i < m; i++) {
            System.out.println("Student " + (i + 1) + ": " + studentTotals[i]);
        }

        System.out.println("\nWeekly attendance across all students:");
        for (int j = 0; j < w; j++) {
            System.out.println("Week " + (j + 1) + ": " + weeklyTotals[j]);
        }

        System.out.println("\nAverage class attendance: " + averageAttendance);

        System.out.println("\nBest attendance: Student " + (bestStudentIndex + 1) + " with " + studentTotals[bestStudentIndex]);
        System.out.println("Worst attendance: Student " + (worstStudentIndex + 1) + " with " + studentTotals[worstStudentIndex]);
        
    }
}