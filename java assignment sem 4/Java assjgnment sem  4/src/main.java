import java.util.*;

public class main {


    public static void main(String[] args) {
        mainLogin.login();
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("1. New Order");
            System.out.println("2. Inventory");
            System.out.println("3. Exit");
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
                    System.out.println("Thank you for shopping with us!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        }while(true);




    }

}

