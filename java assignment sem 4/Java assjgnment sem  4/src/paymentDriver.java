import java.util.Scanner;

public class paymentDriver {
    static Payment[] payment = new Payment[100];
    static String cardNumber;

    static double change;
    public static void paymentDriver() {
        //let user choose to use card or cash
        Scanner input = new Scanner(System.in);
        if (newOrder.cart[0] == null) {
            System.out.println("Cart is empty!");
        }
        else {
        System.out.println("Please choose payment method: ");
        System.out.println("1. Card");
        System.out.println("2. Cash");
        System.out.print("Enter your choice: ");
        int choice = 0;
        try {
            choice = Integer.parseInt(input.nextLine());
        }catch (NumberFormatException npf){
            System.out.println("Invalid input");
        }
            switch (choice) {
                case 1:
                    //let user enter card details
                    System.out.println("Please enter your card details: ");
                    System.out.print("Card Number: ");
                    cardNumber = input.next();
                    if (cardNumber.length() == 16) {
                        CardPayment.isValidCardNumber(cardNumber);
                        if (CardPayment.isValidCardNumber(cardNumber) == true) {
                            System.out.print("Expiry Date(MM/YY): ");
                            String expiryDate = input.next();
                            if (expiryDate.length() == 5) {
                                CardPayment.isExpired(expiryDate);
                                if (CardPayment.isExpired(expiryDate) == false) {
                                    System.out.print("CVV: ");
                                    String cvv = input.next();
                                    //delay and print a success message
                                    try {
                                        Thread.sleep(2000);
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                    System.out.println("Payment successful!");
                                    //set payment type to card
                                    ReceiptDriver.paymentType = 2;
                                    for (int i = 0; i < newOrder.cart.length; i++) {
                                        if (newOrder.cart[i] != null) {
                                            ReceiptDriver.storeInfo();
                                        }
                                    }
                                    cartMethod.clearCart();
                                    break;
                                } else if (CardPayment.isExpired(expiryDate) == true) {
                                    System.out.println("Card is expired");
                                    break;
                                }
                            } else if (expiryDate.length() != 5) {
                                System.out.println("Invalid expiry date");
                                break;
                            }
                        } else if (CardPayment.isValidCardNumber(cardNumber) == false) {
                            System.out.println("Invalid card number");
                            break;
                        }


                    } else if (cardNumber.length() != 16) {
                        System.out.println("Invalid card number");
                        break;

                    }
                case 2:
                    System.out.println("List of Items: ");
                    cartMethod.checkCart();

                    System.out.println("Amount:");
                    int payAmount = input.nextInt();
                    if (payAmount >= cartMethod.grandTotal) {
                        change = cashPayment.calculateChange(payAmount, cartMethod.grandTotal);
                        System.out.println("Changes: RM" + change);

                        for (int i = 0; i < newOrder.cart.length; i++) {
                            if (newOrder.cart[i] != null) {
                                payment[i] = new cashPayment(payAmount, cashPayment.calculateChange(payAmount, cartMethod.grandTotal), cartMethod.grandTotal, payAmount);
                                payment[i].setTotalCharges(cartMethod.grandTotal);
                            }
                        }
                        //set payment type to cash
                        ReceiptDriver.paymentType = 1;
                        for (int i = 0; i < newOrder.cart.length; i++) {
                            if (newOrder.cart[i] != null) {
                                ReceiptDriver.storeInfo();
                            }
                        }
                        cartMethod.clearCart();
                        break;
                    } else
                        System.out.println("Invalid....Not enough money!!");
            }
        }
    }
}