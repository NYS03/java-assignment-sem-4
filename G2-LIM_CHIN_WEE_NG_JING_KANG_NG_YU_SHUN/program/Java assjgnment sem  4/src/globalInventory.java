public class globalInventory {
    public static Items[] cpu = {new cpu("C1000", 1480, "Intel", 1, "Intel i7 9700k", "cpu", 8, 8, "3.6Ghz/4.9GHz"),
            new cpu("C1001", 1000, "Intel", 1, "Intel i5 9600k", "cpu", 6, 6, "3.7GHz/4.6GHz"),
            new cpu("C1002", 600, "AMD", 1, "AMD Ryzen 5 3600", "cpu", 6, 12, "3.6GHz/4.2GHz"),
            new cpu("C1003", 1350, "AMD", 1, "AMD Ryzen 7 5700x", "cpu", 8, 16, "3.4GHz/4.6GHz"),
            new cpu("C1005", 800, "AMD", 1, "AMD Ryzen 5 5600x", "cpu", 6, 12, "3.7GHz/4.6GHz"),
            new cpu("C1006", 513, "Intel", 1, "Intel i3 8100", "cpu", 4, 4, "3.6GHz/3.6GHz"),
            new cpu("C1007", 3600, "AMD", 1, "AMD Ryzen 9 5950x", "cpu", 16, 32, "3.4GHz/4.9GHz"),
            new cpu("C1008", 2560, "Intel", 1, "Intel i9 12900k", "cpu", 16, 24, "3.2GHz/5.2GHz"),
            new cpu("C1009", 2470, "AMD", 1, "AMD Ryzen 9 5900x", "cpu", 12, 24, "3.7GHz/4.8Ghz"),
            new cpu("C1010", 1350, "Intel", 1, "Intel i5 12600k", "cpu", 10, 16, "3.7GHz/4.9GHz"),
            new cpu("C1011", 715, "AMD", 1, "AMD Ryzen 5 5500", "cpu", 6, 12, "3.6GHz/4.2GHz")};

    public static Items[] ram = {new ram("R1000", 1500, "Kingston", 1, "ram", "Kingston HyperX Fury Beast 2x16GB", "DDR5", "4800MHz"),
            new ram("R1001", 1600, "Kingston", 1, "ram", "Kingston HyperX Fury Beast 2x16GB", "DDR5", "5200MHz"),
            new ram("R1002", 1400, "XPG", 1, "ram", "XPG Lancer 2x16GB", "DDR5", "5200MHz"),
            new ram("R1003", 2300, "Corsair", 1, "ram", "Corsair Dominator Platinum 2x16GB", "DDR5", "6200MHz"),
            new ram("R1004", 1100, "G.SKILL", 1, "ram", "G.SKILL Ripjaws S5(Black) 2x16GB", "DDR5", "5200MHz"),
            new ram("R1005", 200, "G.SKILL", 1, "ram", "G.SKILL Aegis 8GB", "DDR4", "3200MHz"),
            new ram("R1006", 1200, "Corsair", 1, "ram", "Corsair Dominator Platinum 2x32GB", "DDR4", "3200MHz")};

    public static Items[] gpu = {new gpu("G1000", 7500, "Gigabyte", 1, "gpu", "Gigabyte RTX 3090TI Gaming OC", "DDR6X", "24GB", 384),
            new gpu("G1001", 3500, "Gigabyte", 1, "gpu", "Gigabyte RTX 3080 Vision OC", "DDR6X", "10GB", 320),
            new gpu("G1002", 6500, "MSI", 1, "gpu", "MSI RTX 3090 Gaming X Trio", "DDR6X", "24GB", 384),
            new gpu("G1003", 1700, "Galax", 1, "gpu", "Galax RTX 3050 Dual", "DDR6", "8GB", 128),
            new gpu("G1004", 5400, "Zotac", 1, "gpu", "Zotac RTX 3080TI Trinity OC", "DDR6X", "12GB", 384),
            new gpu("G1005", 135000, "Nvidia", 1, "gpu", "Nvidia A100 80GB PCIe", "HBM2e", "80GB", 5120)};

    public static Items[] casing = {new casing("K1000", 749, "Lian Li", "Lian Li O11D Evo", 1, "casing", "Atx")};

    public static Items[] psu = {new psu("P1000", 899, "Cooler Master", "Cooler Master Platinum 850W", 1, "psu", "ATX", 850)};

    public static Items[] storage = {new storage("S1000", 2000, "Samsung", "Samsung 980 Pro", 1, "storage", "SSD", "2TB")};

    public static Items[] motherboard = {new motherboard("M1000", 2600, "MSI", "MSI TRX40 PRO WIFI", 1, "motherboard", "TR4", "ATX", "DDR4", 256, "2133MHz/4666MHz")};


}
