public class motherboard extends Items{
    private String motherBoardName;
    private String motherBoardType; //lga or am
    private String motherBoardSize; //atx, e-atx etc
    private String motherBoardRamType; //ddr3, ddr4 etc
    private int motherBoardRamSize; //4gb, 8gb etc
    private String motherBoardRamSpeed; //1600mhz, 2400mhz etc

    public motherboard(){

    }

    public motherboard(String itemID, double price, String brand, int quantity, String itemType, String motherBoardName, String motherBoardType, String motherBoardSize, String motherBoardRamType, int motherBoardRamSize, String motherBoardRamSpeed){
        super(itemID, price, brand, quantity, itemType);
        this.motherBoardName = motherBoardName;
        this.motherBoardType = motherBoardType;
        this.motherBoardSize = motherBoardSize;
        this.motherBoardRamType = motherBoardRamType;
        this.motherBoardRamSize = motherBoardRamSize;
        this.motherBoardRamSpeed = motherBoardRamSpeed;
    }

    public String getMotherBoardName(){
        return motherBoardName;
    }

    public void setMotherBoardName(String motherBoardName){
        this.motherBoardName = motherBoardName;
    }

    public String getMotherBoardType(){
        return motherBoardType;
    }

    public void setMotherBoardType(String motherBoardType){
        this.motherBoardType = motherBoardType;
    }

    public String getMotherBoardSize(){
        return motherBoardSize;
    }

    public void setMotherBoardSize(String motherBoardSize){
        this.motherBoardSize = motherBoardSize;
    }

    public String getMotherBoardRamType(){
        return motherBoardRamType;
    }

    public void setMotherBoardRamType(String motherBoardRamType){
        this.motherBoardRamType = motherBoardRamType;
    }

    public int getMotherBoardRamSize(){
        return motherBoardRamSize;
    }

    public void setMotherBoardRamSize(int motherBoardRamSize){
        this.motherBoardRamSize = motherBoardRamSize;
    }

    public String getMotherBoardRamSpeed(){
        return motherBoardRamSpeed;
    }

    public void setMotherBoardRamSpeed(String motherBoardRamSpeed){
        this.motherBoardRamSpeed = motherBoardRamSpeed;
    }

    public String toString(){
        return super.toString() +
                        "\nMotherboard Name: " + motherBoardName +
                        "\nMotherboard Type: " + motherBoardType +
                        "\nMotherboard Size: " + motherBoardSize +
                        "\nMotherboard RAM Type: " + motherBoardRamType +
                        "\nMotherboard RAM Size: " + motherBoardRamSize + "GB" +
                        "\nMotherboard RAM Speed: " + motherBoardRamSpeed;
    }

}
