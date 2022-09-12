import java.util.*;
public class Stock extends Items {

    public void Stock() {

        Items[] cpu = {new cpu("C1000", 1480, "Intel", 1, "cpu", "Intel i7 9700k", 8 , 8, "3.6Ghz/4.9GHz"),
                        new cpu("C1001", 1000, "Intel", 1, "cpu", "Intel i5 9600k", 6 , 6, "3.7GHz/4.6GHz"),
                        new cpu("C1002", 600, "AMD", 1, "cpu", "AMD Ryzen 5 3600", 6 , 12, "3.6GHz/4.2GHz"),
                        new cpu("C1003", 1350, "AMD", 1, "cpu", "AMD Ryzen 7 5700x", 8 , 16, "3.4GHz/4.6GHz"),
                        new cpu("C1004", 11250, "Intel", 1, "cpu", "Intel Xeon Platinum 9282 ", 56 , 112, "2.6GHz/3.8GHz"),
                        new cpu("C1005", 800, "AMD", 1, "cpu", "AMD Ryzen 5 5600x", 6 , 12, "3.7GHz/4.6GHz"),
                        new cpu("C1006", 513, "Intel", 1, "cpu", "Intel i3 8100", 4 , 4, "3.6GHz/3.6GHz"),
                        new cpu("C1007", 3600, "AMD", 1, "cpu", "AMD Ryzen 9 5950x", 16 , 32, "3.4GHz/4.9GHz"),
                        new cpu("C1008", 2560, "Intel", 1, "cpu", "Intel i9 12900k", 16 , 24, "3.2GHz/5.2GHz"),
                        new cpu("C1009", 2470, "AMD", 1, "cpu", "AMD Ryzen 9 5900x", 12 , 24, "3.7GHz/4.8Ghz"),
                        new cpu("C1010", 1350, "Intel", 1, "cpu", "Intel i5 12600k", 10 , 16, "3.7GHz/4.9GHz"),
                        new cpu("C1011", 715, "AMD", 1, "cpu", "AMD Ryzen 5 5500", 6 , 12, "3.6GHz/4.2GHz"),
                        new cpu("C1012", 30000, "AMD", 1, "cpu", "Ryzen Threadripper PRO 5995WX", 64 , 128, "2.7GHz/4.5GHz")};

        Items[] ram = {new ram("R1000", 1500, "Kingston", 1, "ram", "Kingston HyperX Fury Beast 2x16GB", "DDR5", "4800MHz"),
                        new ram("R1001", 1600, "Kingston", 1, "ram", "Kingston HyperX Fury Beast 2x16GB", "DDR5", "5200MHz"),
                        new ram("R1002", 1400, "XPG", 1, "ram", "XPG Lancer 2x16GB", "DDR5", "5200MHz"),
                        new ram("R1003", 2300, "Corsair", 1, "ram", "Corsair Dominator Platinum 2x16GB", "DDR5", "6200MHz"),
                        new ram("R1004", 1100, "G.SKILL", 1, "ram", "G.SKILL Ripjaws S5(Black) 2x16GB", "DDR5", "5200MHz"),
                        new ram("R1005", 200, "G.SKILL", 1, "ram", "G.SKILL Aegis 8GB", "DDR4",     "3200MHz"),
                        new ram("R1006", 1200, "Corsair", 1, "ram", "Corsair Dominator Platinum 2x32GB", "DDR4", "3200MHz")};

        Items[] gpu = {new gpu("G1000", 7500, "Gigabyte", 1, "gpu", "Gigabyte RTX 3090TI Gaming OC", "DDR6X", "24GB", 384),
                        new gpu("G1001", 3500, "Gigabyte", 1, "gpu", "Gigabyte RTX 3080 Vision OC", "DDR6X", "10GB", 320),
                        new gpu("G1002", 6500, "MSI", 1, "gpu", "MSI RTX 3090 Gaming X Trio", "DDR6X", "24GB", 384),
                        new gpu("G1003", 1700, "Galax", 1, "gpu", "Galax RTX 3050 Dual", "DDR6", "8GB", 128),
                        new gpu("G1004", 5400, "Zotac", 1, "gpu", "Zotac RTX 3080TI Trinity OC", "DDR6X", "12GB", 384),
                        new gpu("G1005", 135000, "Nvidia", 1, "gpu", "Nvidia A100 80GB PCIe", "HBM2e", "80GB", 5120)};

        Items[] casing = {new casing("K1000", 749, "Lian Li", 1 ,"casing", "Lian Li O11D Evo", "Atx")};

        Items[] psu = {new psu("P1000", 899, "Cooler Master", 1, "psu", "Cooler Master Platinum 850W", "ATX", 850)};

        Items[] storage = {new storage("S1000", 2000, "Samsung", 1, "storage", "Samsung 980 Pro", "SSD", "2TB")};

        Items[] motherboard = {new motherboard("M1000", 2600, "MSI", 1, "motherboard", "MSI TRX40 PRO WIFI", "TR4", "ATX", "DDR4", 256, "2133MHz/4666MHz")};
        
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

    }

    public void printStockList(){
        //implement toString method
        System.out.println("Stock List");
        System.out.println("**********");
        System.out.println("Item ID\t\tItem Name\t\tItem Price\t\tItem Quantity");

    }
}