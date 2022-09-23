public class Receipt {
    private double price;
    private int quantity;
    private String name;

    public Receipt() {
        super();
    }

    public Receipt(double price, int quantity, String name) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString(int z) {
        //print receipt with formatting
        return "Item " + z + ": " + getName() + "\nQuantity: " + getQuantity() + "\nPrice: RM" + getPrice() + "\n";


    }
}