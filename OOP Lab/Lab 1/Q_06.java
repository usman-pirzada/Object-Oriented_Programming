import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'a': ");
        int a = sc.nextInt();
        System.out.print("Enter the value of 'b': ");
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("\n  Result After Swapping:-");
        System.out.println("Now the value of 'a' is " + a);
        System.out.println("Now the value of 'b' is " + b);
    }
}