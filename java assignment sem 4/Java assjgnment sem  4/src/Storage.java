public class Storage extends Items{
    private String StorageName;
    private String StorageType; //SSD, HDD
    private String StorageSize;

    public Storage(){

    }

    public Storage(String itemID, double price, double brand, double quantity, double itemType, String StorageName, String StorageType, String StorageSize){
        super(itemID, price, brand, quantity, itemType);
        this.StorageName = StorageName;
        this.StorageType = StorageType;
        this.StorageSize = StorageSize;
    }

    public String getStorageName(){
        return StorageName;
    }

    public void setStorageName(String StorageName){
        this.StorageName = StorageName;
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
                        "\nStorage Name: " + StorageName +
                        "\nStorage Type: " + StorageType +
                        "\nStorage Size: " + StorageSize;
    }



}
