import java.util.Scanner;

class TooManyOversException extends Exception {

    TooManyOversException(String msg) {
        super(msg);
    }
}

public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PSL 2025 Merchandise Order Processing");
        System.out.println("====================================");

        System.out.println("Enter number of overs:");
        int overs = sc.nextInt();
        sc.nextLine();

        try {
            if (overs > 20) {
                throw new TooManyOversException("Too many overs! Maximum 20 overs are allowed.");
            }

            String score;
            int tot_scores = 0;

            for (int i = 0; i < (6 * overs); i++) {
                try {
                    System.out.print("Enter score for ball #" + (i+1) + ": ");
                    score = sc.nextLine();

                    if (score.isBlank()) {
                        throw new IllegalArgumentException("Your input seems empty!");
                    }

                    tot_scores += Integer.parseInt(score);

                } catch (NumberFormatException e) {
                    System.out.println("Non-numeric value found: " + e.getMessage());
                } catch (NullPointerException e) {
                    System.out.println("Invalid input: Your String is null");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            System.out.println("Total Scores: " + tot_scores);
            
        } catch (TooManyOversException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
