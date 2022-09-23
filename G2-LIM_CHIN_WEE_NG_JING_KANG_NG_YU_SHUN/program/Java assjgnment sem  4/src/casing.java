public class casing extends Items {
    private String casingType; //ATX, mATX, mITX

    public casing() {

    }

    public casing(String itemID, double price, String brand, String name, int quantity, String itemType, String casingType) {
        super(itemID, price, brand, quantity, itemType, name);
        this.casingType = casingType;
    }

    public String getCasingType() {
        return casingType;
    }

    public void setCasingType(String casingType) {
        this.casingType = casingType;
    }

    public String toString() {
        return super.toString() +
                "\nCasing Type: " + casingType +
                "\n";
    }
}
