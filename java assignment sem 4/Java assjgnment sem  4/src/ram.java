public class ram extends Items{
    private String ramName;
    private String ramType; //DDR3, DDR4, DDR5
    private String ramSpeed;

    public ram(){

    }

    public ram(String itemID, double price, String brand, int quantity, String itemType, String ramName, String ramType, String ramSpeed){
        super(itemID, price, brand, quantity, itemType);
        this.ramName = ramName;
        this.ramType = ramType;
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
                        "\nRAM Speed: " + ramSpeed;
    }

}
