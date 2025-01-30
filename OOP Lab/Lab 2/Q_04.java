import java.util.ArrayList;
import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter integers from 1 to 100 below: (Enter -1 to terminate)");
        while(true) {
            int num = sc.nextInt();

            if(num == -1) break;
            if(num < 1 || num > 100) {
                System.out.println("Invalid Input!!");
                continue;
            }

            arr.add(num);
        }

        int evenSum = 0;
        int oddSum = 0;

        for(int value: arr) {
            if(value % 2 == 0) {
                evenSum += value;
            } else {
                oddSum += value;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
