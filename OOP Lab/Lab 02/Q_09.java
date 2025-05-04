import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char proceed;

        do {
            System.out.print("What are the Total Marks of each subject: ");
            int eachSubTot = sc.nextInt();

            int grandTotal = eachSubTot * 5;

            int[] sub = new int[5];

            System.out.println("Enter Obtained Marks for 5 subjects:");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i+1) + ": ");
                sub[i] = sc.nextInt();
                if(sub[i] > eachSubTot) {
                    System.out.println("Obtained marks can not be greater than Total Marks! Enter Again:");
                    i--;
                }
            }

            int total = 0;
            
            for (int eachSub : sub) {
                total += eachSub;
            }
            
            float percent = (total / (float) grandTotal) * 100; // It [(float) (total / grandTotal * 100)] will not work

            System.out.println("\nGrade Report");
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