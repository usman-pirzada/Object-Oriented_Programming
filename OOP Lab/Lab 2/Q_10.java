
import java.util.Scanner;
import java.util.ArrayList;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees to evaluate: ");
        int tot_emp = sc.nextInt();

        ArrayList<Integer> emp_sal = new ArrayList<>();
        ArrayList<Integer> emp_attend = new ArrayList<>();
        ArrayList<String> perf = new ArrayList<>();

        for(int i=0; i < tot_emp; i++) {
            System.out.println("\n Employee " + (i+1) + ":");
            System.out.print("Enter monthly sales: ");
            emp_sal.add(sc.nextInt());
            System.out.print("Enter attendance percentage: ");
            emp_attend.add(sc.nextInt());

            if(emp_sal.get(i) > 10000) {
                if (emp_attend.get(i) > 90) {
                    perf.add("Outstanding");

                } else if (emp_attend.get(i) > 75) {
                    perf.add("Satisfactory");
                } else if(emp_attend.get(i) >= 0){
                    perf.add("Needs Improvement");
                }
            } else if(emp_sal.get(i) > 5000) {
                if (emp_attend.get(i) > 80) {
                    perf.add("Satisfactory");
                } else if(emp_attend.get(i) >= 0) {
                    perf.add("Needs Improvement");
                }
            } else if(emp_sal.get(i) >= 0) 
                perf.add("Needs Improvement");

            System.out.println("Result: " + perf.get(i));
        }

        System.out.println("\n Final Report:");
        System.out.println("+----------------+---------------+-------------+");
        System.out.println("| Employee Number| Monthly Sales | Performance |");
        System.out.println("+----------------+---------------+-------------+");
        for (int i = 0; i < tot_emp; i++) {
            System.out.println("| " + (i+1) + "\t\t | " + emp_sal.get(i) + "\t |" + perf.get(i) + " |");
        }
        System.out.println("+----------------+---------------+-------------+");
    }
}
