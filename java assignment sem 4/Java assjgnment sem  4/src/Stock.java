import java.util.*;
public class Stock extends Items {

    public static void Stock() {


        do {
            System.out.println("StockList Main Menu");
            System.out.println("*******************");
            System.out.println("1. Add an Item");
            System.out.println("2. Delete an Item");
            System.out.println("3. Update Item Price");
            System.out.println("4. Print Stock List");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    break;
                case 3:
                    updateStock();
                    break;
                case 4:
                    printStockList();
                    break;
                case 5:
                    main.mainScreen();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (true);

    }

    public static void printStockList() {

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
        } while (x == 0);


    }

    /*public static void addItem(){
        Scanner input = new Scanner(System.in);
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
                    System.out.print("Enter item name: ");
                    String name = sc.next();
                    System.out.print("Enter item price: ");
                    input.nextLine();
                    double price = sc.nextDouble();
                    System.out.print("Enter item quantity: ");
                    input.nextLine();
                    int quantity = sc.nextInt();
                    System.out.print("Enter item brand: ");
                    String brand = sc.next();
                    System.out.print("Enter item core: ");
                    int core = sc.nextInt();
                    System.out.print("Enter item thread: ");
                    int thread = sc.nextInt();
                    System.out.print("Enter item frequency: ");
                    input.nextLine();
                    String frequency = sc.nextLine();
                    //add all the details into the array
                    String itemID = null;
                    String itemType = null;
                    for (int i = 0; i < globalInventory.cpu.length; i++) {
                        //get itemID from array
                        itemID = globalInventory.cpu[i].getItemID();
                        //split string into integer and character
                        String[] parts = itemID.split("(?<=\\D)(?=\\d)");
                        //get the integer part
                        int num = Integer.parseInt(parts[1]);
                        //store the integer part in a variable
                        int num2 = num;
                        //compare next array value to the variable if it is larger
                        //store the larger value in the variable
                        if (globalInventory.cpu[i].getItemID().compareTo(itemID) > 0) {
                            num2 = Integer.parseInt(parts[1]);

                        }
                        //add 1 to the largest variable
                        num2++;
                        //concatenate the C with the new integer
                        String newID = "C" + num2;
                        itemType = "cpu";
                    }
                    //store everything into the globalInventory array
                    globalInventory.cpu[globalInventory.cpu.length] = new cpu(itemID, price, brand, quantity, itemType, name, core, thread, frequency);





            }
        }while(x == 0);
     */


    public static void updateStock() {
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
                    System.out.print("Enter item ID: ");
                    String itemID = sc.next();
                    System.out.print("Enter new price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    int quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.cpu.length; i++) {
                        if (globalInventory.cpu[i].getItemID().equals(itemID)) {
                            globalInventory.cpu[i].setPrice(price);
                            globalInventory.cpu[i].setQuantity(quantity);
                        }
                    }
                    break;
                case 2:
                    for (Items i : globalInventory.ram) {
                        System.out.println(i);
                    }
                    System.out.print("Enter item ID: ");
                    itemID = sc.next();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.ram.length; i++) {
                        if (globalInventory.ram[i].getItemID().equals(itemID)) {
                            globalInventory.ram[i].setPrice(price);
                            globalInventory.ram[i].setQuantity(quantity);
                        }
                    }
                    break;

                case 3:
                    for (Items i : globalInventory.gpu) {
                        System.out.println(i);
                    }
                    System.out.print("Enter item ID: ");
                    itemID = sc.next();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.gpu.length; i++) {
                        if (globalInventory.gpu[i].getItemID().equals(itemID)) {
                            globalInventory.gpu[i].setPrice(price);
                            globalInventory.gpu[i].setQuantity(quantity);
                        }
                    }
                    break;

                case 4:
                    for (Items i : globalInventory.casing) {
                        System.out.println(i);
                    }
                    System.out.print("Enter item ID: ");
                    itemID = sc.next();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.casing.length; i++) {
                        if (globalInventory.casing[i].getItemID().equals(itemID)) {
                            globalInventory.casing[i].setPrice(price);
                            globalInventory.casing[i].setQuantity(quantity);
                        }
                    }
                    break;

                case 5:
                    for (Items i : globalInventory.psu) {
                        System.out.println(i);
                    }
                    System.out.print("Enter item ID: ");
                    itemID = sc.next();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.psu.length; i++) {
                        if (globalInventory.psu[i].getItemID().equals(itemID)) {
                            globalInventory.psu[i].setPrice(price);
                            globalInventory.psu[i].setQuantity(quantity);
                        }
                    }
                    break;

                case 6:
                    for (Items i : globalInventory.storage) {
                        System.out.println(i);
                    }
                    System.out.print("Enter item ID: ");
                    itemID = sc.next();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.storage.length; i++) {
                        if (globalInventory.storage[i].getItemID().equals(itemID)) {
                            globalInventory.storage[i].setPrice(price);
                            globalInventory.storage[i].setQuantity(quantity);
                        }
                    }
                    break;

                case 7:
                    for (Items i : globalInventory.motherboard) {
                        System.out.println(i);
                    }
                    System.out.print("Enter item ID: ");
                    itemID = sc.next();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    System.out.print("Enter new quantity: ");
                    quantity = sc.nextInt();
                    for (int i = 0; i < globalInventory.motherboard.length; i++) {
                        if (globalInventory.motherboard[i].getItemID().equals(itemID)) {
                            globalInventory.motherboard[i].setPrice(price);
                            globalInventory.motherboard[i].setQuantity(quantity);
                        }
                    }
                    break;

                case 8:
                    x = 1;
                    break;
            }


        } while (x == 0);
    }
}