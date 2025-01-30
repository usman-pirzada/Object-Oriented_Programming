package Question_05;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=num; i++){
            fact *= i;
        }

        System.out.println("The factorial of the given number is " + fact);
    }
}