import java.util.Scanner;

public class newOrder {
    public static itemCart[] cart = new itemCart[100];

    public static void newOrder() {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Please Select what to buy: ");
            System.out.println("                        ===========================");
            System.out.println("                        |1. CPU                    |");
            System.out.println("                        |2. RAM                    |");
            System.out.println("                        |3. GPU                    |");
            System.out.println("                        |4. Casing                 |");
            System.out.println("                        |5. PSU                    |");
            System.out.println("                        |6. Storage                |");
            System.out.println("                        |7. Exit                   |");
            System.out.println("                        ===========================");
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException nfe) {
            }
            switch (choice) {
                case 1:
                    for (Items i : globalInventory.cpu) {
                        System.out.println(i);
                    }
                    //let user select item by item id
                    System.out.println("Please select the item by item id: ");
                    String itemid = input.nextLine();
                    if (itemid.length() == 5) {
                        for (int i = 0; i < globalInventory.cpu.length; i++) {
                            if (globalInventory.cpu[i].getItemID().equalsIgnoreCase(itemid)) {
                                System.out.println("Item selected: " + globalInventory.cpu[i].toString());
                                System.out.println("Please enter the quantity: ");
                                int quantity = 0;
                                try {
                                    quantity = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                }
                                if (quantity > globalInventory.cpu[i].getQuantity()) {
                                    System.out.println("Not enough stock");
                                    break;
                                } else if (quantity <= globalInventory.cpu[i].getQuantity()) {
                                    cartMethod.add(globalInventory.cpu[i], quantity);
                                    globalInventory.cpu[i].setQuantity(globalInventory.cpu[i].getQuantity() - quantity);
                                    System.out.println("Item added to cart");
                                    break;
                                }

                            } else if (i == globalInventory.cpu.length - 1) {
                                System.out.println("Item not found");
                            }
                        }
                        break;
                    } else if (itemid.length() != 5) {
                        System.out.println("Invalid item id");
                        break;
                    }


                case 2:
                    for (Items i : globalInventory.ram) {
                        System.out.println(i);
                    }
                    //let user select item by item id
                    System.out.println("Please select the item by item id: ");
                    String itemid2 = input.nextLine();
                    if (itemid2.length() == 5) {
                        for (int i = 0; i < globalInventory.ram.length; i++) {
                            if (globalInventory.ram[i].getItemID().equalsIgnoreCase(itemid2)) {
                                System.out.println("Item selected: " + globalInventory.ram[i].toString());
                                System.out.println("Please enter the quantity: ");
                                int quantity = 0;
                                try {
                                    quantity = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                }
                                if (quantity > globalInventory.ram[i].getQuantity()) {
                                    System.out.println("Not enough stock");
                                    break;
                                } else if (quantity <= globalInventory.ram[i].getQuantity()) {
                                    cartMethod.add(globalInventory.ram[i], quantity);
                                    globalInventory.ram[i].setQuantity(globalInventory.ram[i].getQuantity() - quantity);
                                    System.out.println("Item added to cart");
                                    break;
                                }
                            } else if (i == globalInventory.ram.length - 1) {
                                System.out.println("Item not found");
                            }
                        }
                        break;
                    } else if (itemid2.length() != 5) {
                        System.out.println("Invalid item id");
                        break;
                    }

                case 3:
                    for (Items i : globalInventory.gpu) {
                        System.out.println(i);
                    }
                    //let user select item by item id
                    System.out.println("Please select the item by item id: ");
                    input.nextLine();
                    String itemid3 = input.nextLine();
                    if (itemid3.length() == 5) {
                        for (int i = 0; i < globalInventory.gpu.length; i++) {
                            if (globalInventory.gpu[i].getItemID().equalsIgnoreCase(itemid3)) {
                                System.out.println("Item selected: " + globalInventory.gpu[i].toString());
                                System.out.println("Please enter the quantity: ");
                                int quantity = 0;
                                try {
                                    quantity = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                }
                                if (quantity > globalInventory.gpu[i].getQuantity()) {
                                    System.out.println("Not enough stock");
                                    break;
                                } else if (quantity <= globalInventory.gpu[i].getQuantity()) {
                                    cartMethod.add(globalInventory.gpu[i], quantity);
                                    globalInventory.gpu[i].setQuantity(globalInventory.gpu[i].getQuantity() - quantity);
                                    System.out.println("Item added to cart");
                                    break;
                                }
                            } else if (i == globalInventory.gpu.length - 1) {
                                System.out.println("Item not found");
                            }
                        }
                        break;
                    } else if (itemid3.length() != 5) {
                        System.out.println("Invalid item id");
                        break;
                    }

                case 4:
                    for (Items i : globalInventory.casing) {
                        System.out.println(i);
                    }
                    //let user select item by item id
                    System.out.println("Please select the item by item id: ");
                    input.nextLine();
                    String itemid4 = input.nextLine();
                    if (itemid4.length() == 5) {
                        for (int i = 0; i < globalInventory.casing.length; i++) {
                            if (globalInventory.casing[i].getItemID().equalsIgnoreCase(itemid4)) {
                                System.out.println("Item selected: " + globalInventory.casing[i].toString());
                                System.out.println("Please enter the quantity: ");
                                int quantity = 0;
                                try {
                                    quantity = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                }
                                if (quantity > globalInventory.casing[i].getQuantity()) {
                                    System.out.println("Not enough stock");
                                    break;
                                } else if (quantity <= globalInventory.casing[i].getQuantity()) {
                                    cartMethod.add(globalInventory.casing[i], quantity);
                                    globalInventory.casing[i].setQuantity(globalInventory.casing[i].getQuantity() - quantity);
                                    System.out.println("Item added to cart");
                                    break;
                                }
                            } else if (i == globalInventory.casing.length - 1) {
                                System.out.println("Item not found");
                            }
                        }
                        break;
                    } else if (itemid4.length() != 5) {
                        System.out.println("Invalid item id");
                        break;
                    }

                case 5:
                    for (Items i : globalInventory.psu) {
                        System.out.println(i);
                    }
                    //let user select item by item id
                    System.out.println("Please select the item by item id: ");
                    input.nextLine();
                    String itemid5 = input.nextLine();
                    for (int i = 0; i < globalInventory.psu.length; i++) {
                        if (globalInventory.psu[i].getItemID().equalsIgnoreCase(itemid5)) {
                            System.out.println("Item selected: " + globalInventory.psu[i].toString());
                            System.out.println("Please enter the quantity: ");
                            int quantity = 0;
                            try {
                                quantity = Integer.parseInt(input.nextLine());
                            } catch (NumberFormatException nfe) {

                            }
                            if (quantity > globalInventory.psu[i].getQuantity()) {
                                System.out.println("Not enough stock");
                                break;
                            } else if (quantity <= globalInventory.psu[i].getQuantity()) {
                                cartMethod.add(globalInventory.psu[i], quantity);
                                globalInventory.psu[i].setQuantity(globalInventory.psu[i].getQuantity() - quantity);
                                System.out.println("Item added to cart");
                                break;
                            }
                        } else if (i == globalInventory.psu.length - 1) {
                            System.out.println("Item not found");
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
                    if (itemid6.length() == 5) {
                        for (int i = 0; i < globalInventory.storage.length; i++) {
                            if (globalInventory.storage[i].getItemID().equalsIgnoreCase(itemid6)) {
                                System.out.println("Item selected: " + globalInventory.storage[i].toString());
                                System.out.println("Please enter the quantity: ");
                                int quantity = 0;
                                try {
                                    quantity = Integer.parseInt(input.nextLine());
                                } catch (NumberFormatException nfe) {
                                }
                                if (quantity > globalInventory.storage[i].getQuantity()) {
                                    System.out.println("Not enough stock");
                                    break;
                                } else if (quantity <= globalInventory.storage[i].getQuantity()) {
                                    cartMethod.add(globalInventory.storage[i], quantity);
                                    globalInventory.storage[i].setQuantity(globalInventory.storage[i].getQuantity() - quantity);
                                    System.out.println("Item added to cart");
                                    break;
                                }
                            } else if (i == globalInventory.storage.length - 1) {
                                System.out.println("Item not found");
                            }
                        }
                        break;
                    } else if (itemid6.length() != 5) {
                        System.out.println("Invalid item id");
                        break;
                    }

                case 7:
                    System.out.println("Thank you for shopping with us!");
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (choice != 7);
    }
}