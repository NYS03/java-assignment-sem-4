public class itemCart extends Items{
    private String itemID;
    private double price;
    private String brand;
    private int quantity;
    private String itemType;

    public itemCart(){
        super();
    }

    public itemCart(String itemID, double price, String brand, int quantity, String itemType){
        super(itemID, price, brand, quantity, itemType);
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

    //method to add all items in cart to totalprice
    public static double totalPrice(){
        double total = 0;
        for (int i = 0; i < cart.cart.length; i++) {
            if (cart.cart[i] != null) {
                total += cart.cart[i].getPrice() * cart.cart[i].getQuantity();
            }
        }
        return total;
    }

    public String toString(){
        return super.toString() +
                        "\nItem ID: " + itemID +
                        "\nPrice: " + price +
                        "\nBrand: " + brand +
                        "\nQuantity: " + quantity +
                        "\nItem Type: " + itemType +
                        "\n";
    }

}