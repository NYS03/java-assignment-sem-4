import java.util.Date;

public class ReceiptDriver {
    public static Receipt[] receipt = new Receipt[100];
    public static int paymentType;
    public static double grandTotal = 0;


    public static void storeInfo() {
        for (int j = 0; j < receipt.length; j++) {
            if (receipt[j] == null) {
                //add items 1 by 1
                receipt[j] = new Receipt(newOrder.cart[j].getPrice(), newOrder.cart[j].getQuantity(), newOrder.cart[j].getName());
                break;
            }
        }
    }

    public static void receiptDriver() {
        if (receipt[0] == null) {
            System.out.println("No receipt to print");
        } else {
            //insert everything in cart into Receipt

            double total = 0;
            for (int i = 0; i < receipt.length; i++) {
                if (receipt[i] != null) {
                    //check if user used card or cash payment
                    if (paymentType == 1) {
                        System.out.println("Payment type: Cash");
                        //get date
                        Date date = new Date();
                        System.out.println("Date: " + date);
                        int z = 1;
                        for (int j = 0; j < receipt.length; j++) {
                            if (receipt[j] != null) {
                                System.out.println(receipt[j].toString(z));
                                total += receipt[j].getPrice() * receipt[j].getQuantity();
                                grandTotal = total;
                                z += z;
                            }
                        }
                        System.out.println("Total: RM" + grandTotal);
                        System.out.println("Cash Received: RM" + paymentDriver.payment[i].getAmountPaid());
                        System.out.println("Change: RM" + paymentDriver.change);
                        System.out.println("Thank you for shopping with us!");
                        //clear receipt
                        for (int k = 0; k < receipt.length; k++) {
                            receipt[k] = null;
                            grandTotal = 0;
                        }
                        break;
                    } else if (paymentType == 2) {
                        System.out.println("Payment type: Card");
                        //get date
                        Date date = new Date();
                        System.out.println("Date: " + date);
                        System.out.println("Card Number: " + CardPayment.hideCardNumber(paymentDriver.cardNumber));
                        for (int j = 0; j < receipt.length; j++) {
                            if (receipt[j] != null) {
                                int z = 1;
                                System.out.println(receipt[j].toString(z));
                                total += receipt[j].getPrice() * receipt[j].getQuantity();
                                grandTotal = total;
                                z++;
                            }
                        }
                        System.out.println("Total: RM" + grandTotal);
                        System.out.println("Thank you for shopping with us!");
                        for (int j = 0; j < 100; j++) {
                            if (receipt[j] != null) {
                                receipt[j] = null;
                            }
                        }
                        break;
                    }
                }
            }
        }
    }

}
