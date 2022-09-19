import java.util.Scanner;

public class newOrder extends Items {
    public static void newOrder() {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Select what to buy: ");
        System.out.println("1. CPU");
        System.out.println("2. RAM");
        System.out.println("3. GPU");
        System.out.println("4. Casing");
        System.out.println("5. PSU");
        System.out.println("6. Storage");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                for (Items i : globalInventory.cpu) {
                    System.out.println(i);
                }
                //let user select item by item id
                System.out.println("Please select the item by item id: ");
                input.nextLine();
                String itemid = input.nextLine();
                for (int i = 0; i < globalInventory.cpu.length; i++) {
                    if (globalInventory.cpu[i].getItemID().equals(itemid)) {
                        System.out.println("Item selected: " + globalInventory.cpu[i].toString());
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if(quantity > globalInventory.cpu[i].getQuantity()){
                            System.out.println("Not enough stock");
                            break;
                        }
                        else if(quantity <= globalInventory.cpu[i].getQuantity()){
                            int newQuantity = globalInventory.cpu[i].getQuantity() - quantity;
                            globalInventory.cpu[i].setQuantity(newQuantity);
                            System.out.println("Item added to cart");
                            cart.add(globalInventory.cpu[i], quantity);
                            break;
                        }
                    }
                }
                break;
            case 2:
                for (Items i : globalInventory.ram) {
                    System.out.println(i);
                }
                //let user select item by item id
                System.out.println("Please select the item by item id: ");
                input.nextLine();
                String itemid2 = input.nextLine();
                for (int i = 0; i < globalInventory.ram.length; i++) {
                    if (globalInventory.ram[i].getItemID().equals(itemid2)) {
                        System.out.println("Item selected: " + globalInventory.ram[i].toString());
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if(quantity > globalInventory.ram[i].getQuantity()){
                            System.out.println("Not enough stock");
                            break;
                        }
                        else if(quantity <= globalInventory.ram[i].getQuantity()){
                            int newQuantity = globalInventory.ram[i].getQuantity() - quantity;
                            globalInventory.ram[i].setQuantity(newQuantity);
                            System.out.println("Item added to cart");
                            cart.add(globalInventory.ram[i], quantity);
                            break;
                        }
                    }
                }
                break;
            case 3:
                for (Items i : globalInventory.gpu) {
                    System.out.println(i);
                }
                //let user select item by item id
                System.out.println("Please select the item by item id: ");
                input.nextLine();
                String itemid3 = input.nextLine();
                for (int i = 0; i < globalInventory.gpu.length; i++) {
                    if (globalInventory.gpu[i].getItemID().equals(itemid3)) {
                        System.out.println("Item selected: " + globalInventory.gpu[i].toString());
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if(quantity > globalInventory.gpu[i].getQuantity()){
                            System.out.println("Not enough stock");
                            break;
                        }
                        else if(quantity <= globalInventory.gpu[i].getQuantity()){
                            int newQuantity = globalInventory.gpu[i].getQuantity() - quantity;
                            globalInventory.gpu[i].setQuantity(newQuantity);
                            System.out.println("Item added to cart");
                            cart.add(globalInventory.gpu[i], quantity);
                            break;
                        }
                    }
                }
                break;
            case 4:
                for (Items i : globalInventory.casing) {
                    System.out.println(i);
                }
                //let user select item by item id
                System.out.println("Please select the item by item id: ");
                input.nextLine();
                String itemid4 = input.nextLine();
                for (int i = 0; i < globalInventory.casing.length; i++) {
                    if (globalInventory.casing[i].getItemID().equals(itemid4)) {
                        System.out.println("Item selected: " + globalInventory.casing[i].toString());
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if(quantity > globalInventory.casing[i].getQuantity()){
                            System.out.println("Not enough stock");
                            break;
                        }
                        else if(quantity <= globalInventory.casing[i].getQuantity()){
                            int newQuantity = globalInventory.casing[i].getQuantity() - quantity;
                            globalInventory.casing[i].setQuantity(newQuantity);
                            System.out.println("Item added to cart");
                            cart.add(globalInventory.casing[i], quantity);
                            break;
                        }
                    }
                }
                break;
            case 5:
                for (Items i : globalInventory.psu) {
                    System.out.println(i);
                }
                //let user select item by item id
                System.out.println("Please select the item by item id: ");
                input.nextLine();
                String itemid5 = input.nextLine();
                for (int i = 0; i < globalInventory.psu.length; i++) {
                    if (globalInventory.psu[i].getItemID().equals(itemid5)) {
                        System.out.println("Item selected: " + globalInventory.psu[i].toString());
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if(quantity > globalInventory.psu[i].getQuantity()){
                            System.out.println("Not enough stock");
                            break;
                        }
                        else if(quantity <= globalInventory.psu[i].getQuantity()){
                            int newQuantity = globalInventory.psu[i].getQuantity() - quantity;
                            globalInventory.psu[i].setQuantity(newQuantity);
                            System.out.println("Item added to cart");
                            cart.add(globalInventory.psu[i], quantity);
                            break;
                        }
                    }
                }
                break;
            case 6:
                for (Items i : globalInventory.storage) {
                    System.out.println(i);
                }
                //let user select item by item id
                System.out.println("Please select the item by item id: ");
                input.nextLine();
                String itemid6 = input.nextLine();
                for (int i = 0; i < globalInventory.storage.length; i++) {
                    if (globalInventory.storage[i].getItemID().equals(itemid6)) {
                        System.out.println("Item selected: " + globalInventory.storage[i].toString());
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if(quantity > globalInventory.storage[i].getQuantity()){
                            System.out.println("Not enough stock");
                            break;
                        }
                        else if(quantity <= globalInventory.storage[i].getQuantity()){
                            int newQuantity = globalInventory.storage[i].getQuantity() - quantity;
                            globalInventory.storage[i].setQuantity(newQuantity);
                            System.out.println("Item added to cart");
                            cart.add(globalInventory.storage[i], quantity);
                            break;
                        }
                    }
                }
                break;
            case 7:
                System.out.println("Thank you for shopping with us!");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }


    }
}
