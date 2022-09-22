public class cartMethod extends Items{
    public static double grandTotal = 0;
    public static void add(Items i, int quantity) {
        for (int j = 0; j < newOrder.cart.length; j++) {
            if (newOrder.cart[j] == null) {
                //add items 1 by 1
                newOrder.cart[j] = new itemCart(i.getItemID(), i.getPrice(), i.getBrand(), quantity, i.getItemType(), i.getName());
                break;
            }
        }
    }


    public static void checkCart() {

        for (int i = 0; i < newOrder.cart.length; i++) {
            if (newOrder.cart[i] != null) {
                double total = 0;
                System.out.println(newOrder.cart[i].toString());
                total += itemCart.totalPrice();
                grandTotal = total;
            }
        }
        System.out.println("Total price: RM" + grandTotal);
        //print total price

    }

    public static void clearCart() {
        for (int i = 0; i < newOrder.cart.length; i++) {
            newOrder.cart[i] = null;
        }
    }
}
