public class psu extends Items{
    private String psuName;
    private String psuType; //ATX, SFX, SFX-L
    private String psuWattage;

    public psu(){

    }

    public psu(String itemID, double price, double brand, double quantity, double itemType, String psuName, String psuType, String psuWattage){
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

    public String getPsuWattage(){
        return psuWattage;
    }

    public void setPsuWattage(String psuWattage){
        this.psuWattage = psuWattage;
    }

    public String toString(){
        return super.toString() +
                        "\nPSU Name: " + psuName +
                        "\nPSU Type: " + psuType +
                        "\nPSU Wattage: " + psuWattage;
    }


}
