public class ram extends Items{
    private String ramName;
    private String ramType; //DDR3, DDR4, DDR5
    private String ramSize;
    private String ramSpeed;

    public ram(){

    }

    public ram(String itemID, double price, double brand, double quantity, double itemType, String ramName, String ramType, String ramSize, String ramSpeed){
        super(itemID, price, brand, quantity, itemType);
        this.ramName = ramName;
        this.ramType = ramType;
        this.ramSize = ramSize;
        this.ramSpeed = ramSpeed;
    }

    public String getRamName(){
        return ramName;
    }

    public void setRamName(String ramName){
        this.ramName = ramName;
    }

    public String getRamType(){
        return ramType;
    }

    public void setRamType(String ramType){
        this.ramType = ramType;
    }

    public String getRamSize(){
        return ramSize;
    }

    public void setRamSize(String ramSize){
        this.ramSize = ramSize;
    }

    public String getRamSpeed(){
        return ramSpeed;
    }

    public void setRamSpeed(String ramSpeed){
        this.ramSpeed = ramSpeed;
    }

    public String toString(){
        return super.toString() +
                        "\nRAM Name: " + ramName +
                        "\nRAM Type: " + ramType +
                        "\nRAM Size: " + ramSize +
                        "\nRAM Speed: " + ramSpeed;
    }

}
