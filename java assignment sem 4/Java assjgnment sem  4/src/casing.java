public class casing extends Items{
    private String casingName;
    private String casingType; //ATX, mATX, mITX

    public casing(){

    }

    public casing(String itemID, double price, String brand, int quantity, String itemType, String casingName, String casingType){
        super(itemID, price, brand, quantity, itemType);
        this.casingName = casingName;
        this.casingType = casingType;
    }

    public String getCasingName(){
        return casingName;
    }

    public void setCasingName(String casingName){
        this.casingName = casingName;
    }

    public String getCasingType(){
        return casingType;
    }

    public void setCasingType(String casingType){
        this.casingType = casingType;
    }

    public String toString(){
        return super.toString() +
                        "\nCasing Name: " + casingName +
                        "\nCasing Type: " + casingType;
    }
}
