public class psu extends Items {
    private String psuType; //ATX, SFX, SFX-L
    private int psuWattage;

    public psu() {

    }

    public psu(String itemID, double price, String brand, String name, int quantity, String itemType, String psuType, int psuWattage) {
        super(itemID, price, brand, quantity, itemType, name);
        this.psuType = psuType;
        this.psuWattage = psuWattage;
    }

    public String getPsuType() {
        return psuType;
    }

    public void setPsuType(String psuType) {
        this.psuType = psuType;
    }

    public int getPsuWattage() {
        return psuWattage;
    }

    public void setPsuWattage(int psuWattage) {
        this.psuWattage = psuWattage;
    }

    public String toString() {
        return super.toString() +
                "\nPSU Type: " + psuType +
                "\nPSU Wattage: " + psuWattage +
                "W\n";
    }


}
