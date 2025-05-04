import java.util.Scanner;

class BudgetOverflowException extends Exception {
    BudgetOverflowException(String msg) {
        super(msg);
    }
}

public class Task_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PSL Budget Calculation");
        System.out.println("For how many modules do you want to set budget?");
        int mod_count = sc.nextInt();
        
        sc.nextLine();

        double tot_budget = 0;
        try {
            for (int i = 0; i < mod_count; i++) {
                System.out.print("\nEnter budget for module-" + (i+1) + " in PKR: ");
                String budgetPrice = sc.nextLine();
                try {
                    if(budgetPrice.isBlank()) {
                        throw new IllegalArgumentException("Your input seems empty!");
                    }

                    double price = Double.parseDouble(budgetPrice);
                    if (price > 10000000) {
                        throw new BudgetOverflowException("The budget for the module exceeded 10 million PKR!!");
                    }

                    tot_budget += price;
                    

                } catch (NumberFormatException e) {
                    System.out.println("Your input contains non-numeric values!");
                } catch (NullPointerException e) {
                    System.out.println("NullPointerException: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Input: " + e.getMessage());
                } catch (BudgetOverflowException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }


        } finally {
            System.out.println("Budgeting round completed!");
            System.out.println("\nYour total budget is PKR: " + tot_budget);
        }
    }
}
