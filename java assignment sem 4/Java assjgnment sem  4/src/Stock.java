import java.util.*;
public class Stock extends Items {

    public static void Stock() {


        do{
            System.out.println("StockList Main Menu");
            System.out.println("*******************");
            System.out.println("1. Add an Item");
            System.out.println("2. Delete an Item");
            System.out.println("3. Update Item Price");
            System.out.println("4. Update Item Quantity");
            System.out.println("5. Print Stock List");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch(option){
                case 1:
                    addItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    updateItemPrice();
                    break;
                case 4:
                    updateItemQuantity();
                    break;
                case 5:
                    printStockList();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(true);

    }

    public static void printStockList(){

        //implement toString method
        //ask user which category to print
        //print the list of items in that category
        //scanner sc
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("1. CPU");
            System.out.println("2. RAM");
            System.out.println("3. GPU");
            System.out.println("4. Casing");
            System.out.println("5. PSU");
            System.out.println("6. Storage");
            System.out.println("7. Motherboard");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (Items i : globalInventory.cpu) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (Items i : globalInventory.ram) {
                        System.out.println(i);
                    }
                    break;
                case 3:
                    for (Items i : globalInventory.gpu) {
                        System.out.println(i);
                    }
                    break;
                case 4:
                    for (Items i : globalInventory.casing) {
                        System.out.println(i);
                    }
                    break;
                case 5:
                    for (Items i : globalInventory.psu) {
                        System.out.println(i);
                    }
                    break;
                case 6:
                    for (Items i : globalInventory.storage) {
                        System.out.println(i);
                    }
                    break;
                case 7:
                    for (Items i : globalInventory.motherboard) {
                        System.out.println(i);
                    }
                    break;
                case 8:
                    x = 1;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }while(x == 0);



    }

    public static void addItem(){
        //ask user which category to add
        //ask user to enter item details
        //create new object for the item and add to the array
        //scanner sc
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do {
            System.out.println("1. CPU");
            System.out.println("2. RAM");
            System.out.println("3. GPU");
            System.out.println("4. Casing");
            System.out.println("5. PSU");
            System.out.println("6. Storage");
            System.out.println("7. Motherboard");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //get itemID for cpu
                    int itemID = globalInventory.cpu.size() + 1;





                    System.out.print("Enter item name: ");
                    String name = sc.next();
                    System.out.print("Enter item price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter item brand: ");
                    String brand = sc.next();
                    System.out.print("Enter item core: ");
                    int core = sc.nextInt();
                    System.out.print("Enter item thread: ");
                    int thread = sc.nextInt();
                    System.out.print("Enter item frequency: ");
                    String frequency = sc.nextLine();
                    //add all the details into the array
                case 8:
                    x = 1;
                    break;


            }
        }while(x == 0);
    }


}