import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = sc.nextInt();

        int sum = 0;
        while(num != 0) {
            sum += num % 10;
            num = num / 10;
        }

        System.out.println("The sum of its digits is " + sum);
    }
}