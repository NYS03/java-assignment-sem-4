import java.util.*;

public class newOrder extends Items{
    public static void newOrder(){
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
                for (Items i : globalInventory.cpu) {
                    if (i.getItemID().matches(itemid) ) {
                        System.out.println("Item selected: " + i);
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if (quantity > i.getQuantity()) {
                            System.out.println("Sorry, we don't have that much quantity");
                        } else {
                            i.setQuantity(i.getQuantity() - quantity);
                            System.out.println("Item added to cart");
                            //add item to cart using cart class
                            cart.add(i, quantity);
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
                for (Items i : globalInventory.ram) {
                    if (i.getItemID().matches(itemid2) ) {
                        System.out.println("Item selected: " + i);
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if (quantity > i.getQuantity()) {
                            System.out.println("Sorry, we don't have that much quantity");
                        } else {
                            i.setQuantity(i.getQuantity() - quantity);
                            System.out.println("Item added to cart");
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
                for (Items i : globalInventory.gpu) {
                    if (i.getItemID().matches(itemid3) ) {
                        System.out.println("Item selected: " + i);
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if (quantity > i.getQuantity()) {
                            System.out.println("Sorry, we don't have that much quantity");
                        } else {
                            i.setQuantity(i.getQuantity() - quantity);
                            System.out.println("Item added to cart");
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
                for (Items i : globalInventory.casing) {
                    if (i.getItemID().matches(itemid4) ) {
                        System.out.println("Item selected: " + i);
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if (quantity > i.getQuantity()) {
                            System.out.println("Sorry, we don't have that much quantity");
                        } else {
                            i.setQuantity(i.getQuantity() - quantity);
                            System.out.println("Item added to cart");
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
                for (Items i : globalInventory.psu) {
                    if (i.getItemID().matches(itemid5) ) {
                        System.out.println("Item selected: " + i);
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if (quantity > i.getQuantity()) {
                            System.out.println("Sorry, we don't have that much quantity");
                        } else {
                            i.setQuantity(i.getQuantity() - quantity);
                            System.out.println("Item added to cart");
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
                for (Items i : globalInventory.storage) {
                    if (i.getItemID().matches(itemid6) ) {
                        System.out.println("Item selected: " + i);
                        System.out.println("Please enter the quantity: ");
                        int quantity = input.nextInt();
                        if (quantity > i.getQuantity()) {
                            System.out.println("Sorry, we don't have that much quantity");
                        } else {
                            i.setQuantity(i.getQuantity() - quantity);
                            System.out.println("Item added to cart");

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
