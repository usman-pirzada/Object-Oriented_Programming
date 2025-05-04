import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd Integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd Integer: ");
        int num3 = sc.nextInt();

//        Integer.max(num1, num2)

        if(num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest Integer.");
        } else if(num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest Integer.");
        } else {
            System.out.println(num3 + " is the largest Integer.");
        }
    }
}