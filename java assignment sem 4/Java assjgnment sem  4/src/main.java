import java.util.*;

public class main {


    public static void main(String[] args) {
        mainScreen();
    }

    public static void mainScreen(){
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1. New Order");
            System.out.println("2. Inventory");
            System.out.println("3. Check Cart");
            System.out.println("4. Payment");
            System.out.println("5. Print Receipt");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    newOrder.newOrder();
                    break;
                case 2:
                    Stock.Stock();
                    break;
                case 3:
                    cartMethod.checkCart();
                    break;
                case 4:
                    paymentDriver.paymentDriver();
                    break;
                case 5:
                    ReceiptDriver.receiptDriver();
                    break;
                case 6:
                    System.out.println("Thank you for shopping with us!");
                    System.exit(0);
                    break;
                    //exit program
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while(true);
    }
}

