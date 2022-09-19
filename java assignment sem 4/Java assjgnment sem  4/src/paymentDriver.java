import java.util.Scanner;

public class paymentDriver {
    public static void paymentDriver() {
        //let user choose to use card or cash
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose payment method: ");
        System.out.println("1. Card");
        System.out.println("2. Cash");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                //let user enter card details
                System.out.println("Please enter your card details: ");
                System.out.print("Card Number: ");
                String cardNumber = input.next();
                if (cardNumber.length() == 16) {
                    CardPayment.isValidCardNumber(cardNumber);
                    if (CardPayment.isValidCardNumber(cardNumber) == true) {
                        System.out.print("Expiry Date: ");
                        String expiryDate = input.next();
                        if (expiryDate.length() == 5) {
                            CardPayment.isExpired(expiryDate);
                            if (CardPayment.isExpired(expiryDate) == false) {
                                System.out.print("CVV: ");
                                String cvv = input.next();
                                System.out.println("Payment successful");
                                cart.clearCart();
                                break;


                            } else if (CardPayment.isExpired(expiryDate) == true) {
                                System.out.println("Card is expired");
                                break;
                            }
                        }
                        else if(expiryDate.length() != 5){
                            System.out.println("Invalid expiry date");
                            break;
                        }
                    } else if (CardPayment.isValidCardNumber(cardNumber) == false) {
                        System.out.println("Invalid card number");
                        break;
                    }


                }
                else if(cardNumber.length() != 16){
                    System.out.println("Invalid card number");
                    break;
                }
            }
    }
}