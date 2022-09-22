public class Items{
    private String itemID;
    private double price;
    private String brand;
    private int quantity;
    private int purchaseQuantity;
    private String itemType;
    private String name;

    public Items(){

    }

    public Items(String itemID, double price, String brand, int quantity, String itemType, String name){
        this.itemID = itemID;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.itemType = itemType;
        this.name = name;
    }

    public String getItemID(){
        return itemID;
    }

    public void setItemID(String itemID){
        this.itemID = itemID;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getQuantity(){
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getItemType(){
        return itemType;
    }

    public void setItemType(String itemType){
        this.itemType = itemType;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }


    public String toString(){
        return "\nItem ID: " + itemID + "\nPrice: RM" + price + "\nBrand: " + brand + "\nItem Name: " + name + "\nQuantity: " + quantity + "\nItem Type: " + itemType;
    }


}
