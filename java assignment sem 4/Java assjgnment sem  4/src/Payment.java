abstract class Payment {
    protected  double amountPaid;
    protected  double balance;
    protected  double totalCharges;

    protected double amountReceived;

    //constructors
    public Payment(){

    }

    public Payment(double amountPaid, double balance, double totalCharges, double amountReceived){
        this.amountPaid = amountPaid;
        this.balance = balance;
        this.totalCharges = totalCharges;
        this.amountReceived = amountReceived;
    }

    //getters and setters
    public  double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public  double getBalance() {
        return balance;
    }

    public  void setBalance(double balance) {
        this.balance = balance;
    }

    public  double getTotalCharges() {
        return totalCharges;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public double getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }

    //toString
    @Override
    public String toString() {
        return "Amount Paid: " + amountPaid + " \nBalance: " + balance + " \nTotal Charges: " + totalCharges;
    }

    //abstract methods
    public abstract double makePayment();
}
