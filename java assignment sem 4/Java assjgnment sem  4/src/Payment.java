abstract class Payment {
    protected static double amountPaid;
    protected static double balance;
    protected static double totalCharges;

    //constructors
    public Payment(){

    }

    public Payment(double amountPaid, double balance, double totalCharges){
        Payment.amountPaid = amountPaid;
        Payment.balance = balance;
        Payment.totalCharges = totalCharges;
    }

    //getters and setters
    public static double getAmountPaid() {
        return amountPaid;
    }

    public static void setAmountPaid(double amountPaid) {
        Payment.amountPaid = amountPaid;
    }

    public static double getBalance() {
        return balance;
    }

    public static void setBalance(double balance) {
        Payment.balance = balance;
    }

    public static double getTotalCharges() {
        return totalCharges;
    }

    public static void setTotalCharges(double totalCharges) {
        Payment.totalCharges = totalCharges;
    }

    //toString
    @Override
    public String toString() {
        return "Amount Paid: " + amountPaid + " \nBalance: " + balance + " \nTotal Charges: " + totalCharges;
    }

    //abstract methods
    public abstract void makePayment();
}
