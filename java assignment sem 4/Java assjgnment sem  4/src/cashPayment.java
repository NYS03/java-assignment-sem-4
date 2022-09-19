public class cashPayment extends Payment{
    private double amount;
    private double change;

    public cashPayment(){
        super();
    }

    public cashPayment(double amountPaid, double balance, double totalCharges, double amount, double change){
        super(amountPaid, balance, totalCharges);
        this.amount = amount;
        this.change = change;
    }

    public double getAmount(){
        return amount;
    }

    public double getChange(){
        return change;
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setChange(double change){
        this.change = change;
    }

    public double calculateChange(double amount, double total){
        return amount - total;
    }

    public String toString(){
        return super.toString() + "\nAmount: " + amount + "\nChange: " + change;
    }

    @Override
    public void makePayment() {

    }


}
