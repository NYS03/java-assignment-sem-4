import java.util.*;
public class Stock extends Items {

    public void Stock() {

        Stock
        System.out.println("StockList Main Menu");
        System.out.println("*******************");
        System.out.println("1. Add an Item");
        System.out.println("2. Delete an Item");
        System.out.println("3. Update Item Price");
        System.out.println("4. Update Item Quantity");
        System.out.println("5. Print Stock List");
        System.out.println("6. Exit");
        System.out.print("Select an option: ");

    }

    private <StockItem> void addItems(){
        //adds item to end of stock list
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the item name: ");
        String name = input.nextLine();
        System.out.print("Enter the item price: ");
        double price = input.nextDouble();
        System.out.print("Enter the item quantity: ");
        int quantity = input.nextInt();
    }
}