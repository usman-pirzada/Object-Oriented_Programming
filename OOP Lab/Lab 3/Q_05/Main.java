package Q_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item(1, "Mango", 3, 150));
        items.add(new Item(2, "Gala Biscuit", 10, 100));
        items.add(new Item(3, "Lays", 25, 60));
        items.add(new Item(4, "Salanty", 40, 30));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to Inventory Management System!");
            System.out.println("Enter a number to select an option:");
            System.out.println(" 1) Search Item");
            System.out.println(" 2) Display Stock Items");
            System.out.println(" 3) Purchase Items");
            System.out.println(" 4) Update stock/prices");
            System.out.println(" 5) Exit");
            System.out.print("Enter option number to select: ");
            int option = sc.nextInt();
            switch (option) {
                case 1: // Search Item
                    System.out.println("How would you like to search the item?");
                    System.out.println(" 1) By ID");
                    System.out.println(" 2) By Name");
                    System.out.println(" 3) Cancel Search");
                    System.out.print("Enter option number to select: ");
                    switch (sc.nextInt()) {
                        case 1: // By ID
                            System.out.print("Enter item's ID to search: ");
                            int idSearch = sc.nextInt();
                            if (Item.searchItem(idSearch, items) != -1) {   // todo:
                                System.out.print("Do you want to purchase this item? (y/n): ");
                                char ch = sc.next().charAt(0);
                                if (ch == 'y' || ch == 'Y') Item.purchase(idSearch, items);
                            }
                            break;

                        case 2: // By Name
                            System.out.print("Enter item's name to search: ");
                            String nameSearch = sc.next();
                            if (Item.searchItem(nameSearch, items) != -1) {   // todo:
                                System.out.print("Do you want to purchase this item? (y/n): ");
                                char ch = sc.next().charAt(0);
                                if (ch == 'y' || ch == 'Y') Item.purchase(nameSearch, items);
                            }
                            break;

                        case 3: // Cancel Search
                            System.out.println("\n Searching cancelled!");
                            continue;

                        default:
                            System.out.println("\n Invalid Input!! Try Again.");
                    }

                    break;

                case 2: // Display Items in Stock
                    Item.displayStockedItems(items);
                    break;

                case 3: // Purchase
                    System.out.println("\t ********** Items List **********");
                    Item.displayStockedItems(items);
                    System.out.print("\nWhich item do you want to purchase? (Start entering items & Write null in item's name to end): ");
                    while (true) {
                        System.out.print("Enter Item's Name: ");
                        Item.itemsInCard.add(sc.next());
                        if(Item.itemsInCard.getLast().equals("null")) break;

                        int foundIndex = Item.searchItem(Item.itemsInCard.getLast(), items);
                        if(foundIndex != -1) {
                            System.out.println("Enter Quantity: ");
                            Item.purchasedQty.add(sc.nextInt());
                        } else {
                            Item.itemsInCard.removeLast();
                            System.out.println("Item not found in stock!!");
                        }
                    }

                    Item.generateBill(items);
                    break;

                case 4: // Update Stock/Price    // todo:
                    // todo: update stock/prices fn
                    Item.displayStockedItems(items);
                    items.get(0).updateStock(sc);
                    break;

                case 5: // Exit
                    System.out.println("Good Bye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Input!! Try Again.");
            }
        }
    }
}
