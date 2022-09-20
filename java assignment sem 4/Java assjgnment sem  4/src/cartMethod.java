public class cartMethod extends Items{

    public static void add(Items i, int quantity) {
        for (int j = 0; j < newOrder.cart.length; j++) {
            if (newOrder.cart[j] == null) {
                //add items 1 by 1
                newOrder.cart[j] = newOrder.cart[j];
                 break;
            }
        }
    }


    public static void checkCart() {
        for (int i = 0; i < newOrder.cart.length; i++) {
            if (newOrder.cart[i] != null) {
                System.out.println(newOrder.cart[i].toString());
            }
        }
        //print total price
        System.out.println("Total price: RM" + itemCart.totalPrice());

    }

    /*public static void clearCart() {
        for (int i = 0; i < cart.length; i++) {
            cart[i] = null;
        }
    }*/
}
