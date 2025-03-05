package OtherPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<Integer>();

        System.out.println("How many marks do you want to enter:");
        int n = sc.nextInt();

        System.out.println("Enter your marks below:");
        for(int i = 0; i < n; i++) {
            System.out.print("Marks #" + (i+1) + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("Sorting your marks...");
        for(int i=0; i< marks.size(); i++) {
            for(int j=i; j< marks.size() - 1; j++) {
                if(marks.get(j) > marks.get(j+1)) {
                    int temp = marks.get(j);
                    marks.set(j, marks.get(j+1));
                    marks.set((j+1), temp);
                }
            }
        }

        System.out.println("Your Marks After Sorting:");
        for(int i = 0; i < marks.size(); i++) {
            System.out.println("Marks #" + (i+1) + ": " + marks.get(i));
        }
    }
}