public class Items{
    private String itemID;
    private double price;
    private double brand;
    private double quantity;
    private double itemType;

    public Items(){

    }

    public Items(String itemID, double price, double brand, double quantity, double itemType){
        this.itemID = itemID;
        this.price = price;
        this.brand = brand;
        this.quantity = quantity;
        this.itemType = itemType;
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

    public double getBrand(){
        return brand;
    }

    public void setBrand(double brand){
        this.brand = brand;
    }

    public double getQuantity(){
        return quantity;
    }

    public void setQuantity(double quantity){
        this.quantity = quantity;
    }

    public double getItemType(){
        return itemType;
    }

    public void setItemType(double itemType){
        this.itemType = itemType;
    }

    public String toString(){
        return "Item ID: " + itemID + "\nPrice: " + price + "\nBrand: " + brand + "\nQuantity: " + quantity + "\nItem Type: " + itemType;
    }
}
