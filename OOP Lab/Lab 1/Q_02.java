import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if(num % 2 == 0) {
            System.out.println("Your have entered an even Integer");
        } else {
            System.out.println("You have entered an odd Integer");
        }
    }
}