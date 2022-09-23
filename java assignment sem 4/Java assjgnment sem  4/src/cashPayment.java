import java.util.Calendar;

public class cashPayment extends Payment{

    public cashPayment(){
        super();
    }

    public cashPayment(double amountPaid, double balance, double totalCharges, double amountReceived){
        super(amountPaid, balance, totalCharges, amountReceived);
    }


    public static double calculateChange(double amountReceived, double total){

        return amountReceived - total;
    }

    public String toString(){
        return super.toString() + "\nAmount: " + totalCharges + "\nChange: " + calculateChange(amountReceived, totalCharges);
    }

    @Override
    public double makePayment() {
        return calculateChange(amountReceived, totalCharges);
    }


}
