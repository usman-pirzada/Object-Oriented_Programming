import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char proceed;

        do {
            System.out.print("What are the Total Marks of each subject: ");
            int eachSubTot = sc.nextInt();

            int grandTotal = eachSubTot * 5;

            System.out.println("Enter Obtained Marks for 5 subjects:");
            System.out.print("Subject 1: ");
            int s1 = sc.nextInt();
            System.out.print("Subject 2: ");
            int s2 = sc.nextInt();
            System.out.print("Subject 3: ");
            int s3 = sc.nextInt();
            System.out.print("Subject 4: ");
            int s4 = sc.nextInt();
            System.out.print("Subject 5: ");
            int s5 = sc.nextInt();

            int total = s1 + s2 + s3 + s4 + s5;
            float percent = (float) (total / grandTotal * 100);

            System.out.println("Grade Report");
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percent);
            System.out.print("Grade: ");
            if(percent >= 0 && percent <= 100) {
                if(percent > 80) {
                    System.out.println("A");
                } else if(percent > 70) {
                    System.out.println("B");
                } else if(percent > 65) {
                    System.out.println("C");
                } else if(percent > 60) {
                    System.out.println("D");
                } else if(percent > 50) {
                    System.out.println("E");
                } else {
                    System.out.println("F");
                }
            }

            System.out.println("Generate another report? (y/n)");
            proceed = sc.next().charAt(0);
            
        } while(proceed == 'y');
    }
}