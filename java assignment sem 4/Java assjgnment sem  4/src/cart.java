public class cart extends Items{
    public static Items[] cart = new Items[100];

    public static void add(Items i, int quantity) {
        for (int j = 0; j < cart.length; j++) {
            if (cart[j] == null) {
                cart[j] = i;
                cart[j].setQuantity(quantity);
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
}
