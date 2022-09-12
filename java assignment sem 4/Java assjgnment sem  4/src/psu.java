public class psu extends Items{
    private String psuName;
    private String psuType; //ATX, SFX, SFX-L
    private int psuWattage;

    public psu(){

    }

    public psu(String itemID, double price, String brand, int quantity, String itemType, String psuName, String psuType, int psuWattage){
        super(itemID, price, brand, quantity, itemType);
        this.psuName = psuName;
        this.psuType = psuType;
        this.psuWattage = psuWattage;
    }

    public String getPsuName(){
        return psuName;
    }

    public void setPsuName(String psuName){
        this.psuName = psuName;
    }

    public String getPsuType(){
        return psuType;
    }

    public void setPsuType(String psuType){
        this.psuType = psuType;
    }

    public int getPsuWattage(){
        return psuWattage;
    }

    public void setPsuWattage(int psuWattage){
        this.psuWattage = psuWattage;
    }

    public String toString(){
        return super.toString() +
                        "\nPSU Name: " + psuName +
                        "\nPSU Type: " + psuType +
                        "\nPSU Wattage: " + psuWattage +
                        "W\n";
    }


}
