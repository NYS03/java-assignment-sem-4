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
                //check if cart is empty
                double total = 0;
                System.out.println(newOrder.cart[i].toString());
                total += itemCart.totalPrice();
                grandTotal = total;

            }



            //print total price
        }
        if(newOrder.cart[0] != null){
            System.out.println("Total price: RM" + grandTotal);
        }
        else {
            System.out.println("Cart is empty");
        }
    }

    public static void clearCart() {
        for (int i = 0; i < newOrder.cart.length; i++) {
            newOrder.cart[i] = null;
            grandTotal = 0;
        }
    }
}
