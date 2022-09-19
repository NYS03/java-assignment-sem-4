public class cart extends Items{
    public static Items[] cart = new Items[100];

    public static void add(Items i, int quantity) {
        for (int j = 0; j < cart.length; j++) {
            if (cart[j] == null) {
                //add items 1 by 1
                cart[j] = i;
                cart[j].setQuantity(i.getQuantity());
                break;
            }
        }
    }

    public static void checkCart() {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                System.out.println(cart[i].toString());
            }
        }
        //print total price
        System.out.println("Total price: RM" + itemCart.totalPrice());

    }

    public static void clearCart() {
        for (int i = 0; i < cart.length; i++) {
            cart[i] = null;
        }
    }
}
