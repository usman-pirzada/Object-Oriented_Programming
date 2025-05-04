package OtherPractice;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];

        System.out.println("Enter values in 3x3 matrix:");
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("Matrix Index (" + (i+1) + ", " + (j+1) + "): ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Your 3x3 matrix:");

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Find Maximum
        int max = matrix[0][0];

        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The maximum number is: " + max);
    }
}