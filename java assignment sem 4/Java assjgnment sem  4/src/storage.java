public class storage extends Items{
    private String StorageType; //SSD, HDD
    private String StorageSize;

    public storage(){

    }

    public storage(String itemID, double price, String brand, String name, int quantity, String itemType, String StorageType, String StorageSize){
        super(itemID, price, brand, quantity, itemType, name);
        this.StorageType = StorageType;
        this.StorageSize = StorageSize;
    }
    public String getStorageType(){
        return StorageType;
    }

    public void setStorageType(String StorageType){
        this.StorageType = StorageType;
    }

    public String getStorageSize(){
        return StorageSize;
    }

    public void setStorageSize(String StorageSize){
        this.StorageSize = StorageSize;
    }

    public String toString(){
        return super.toString() +
                        "\nStorage Type: " + StorageType +
                        "\nStorage Size: " + StorageSize +
                        "\n";
    }



}
