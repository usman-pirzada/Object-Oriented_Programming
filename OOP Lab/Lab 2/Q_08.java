import java.util.ArrayList;
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {

        char proceed;

        do{
            Scanner sc = new Scanner(System.in);

            System.out.print("How many items do you want to input: ");
            int itemCount = sc.nextInt();

            ArrayList<Integer> priceList = new ArrayList<>();

            for(int i=0; i < itemCount; i++) {
                sc.nextLine();

                System.out.println("\n Item " + (i+1));
                System.out.print("Enter Item Name: ");
                sc.nextLine();
                System.out.print("Enter Price: ");
                priceList.add(sc.nextInt());
            }

            double subTot = 0;

            for(int eachPrice: priceList) {
                subTot += eachPrice;
            }

            int disPercent;
            disPercent = (subTot > 500)? 10 : 5;

            double disAmount = (disPercent / 100.0) * subTot;
            double payable = subTot - disAmount;

            System.out.println("\n SHOPPING RECEIPT");
            System.out.println("Subtotal: " + subTot);
            System.out.println("Discount Percent: " + disPercent);
            System.out.println("Discount Amount: " + disAmount);
            System.out.println("Payable Amount after discount: " + payable);

            System.out.println("\nGenerate another receipt? (y/n)");
            proceed = sc.next().charAt(0);

        } while(proceed == 'y');
    }
}
