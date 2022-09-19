import java.util.Calendar;

public class CardPayment extends Payment{

    private String cardType;
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CardPayment(){

    }

    public CardPayment(double amountPaid, double balance, double totalCharges, String cardType, String cardNumber, String cardHolderName, String expiryDate){
        super(amountPaid, balance, totalCharges);
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }

    public String getCardType(){
        return cardType;
    }

    public String getCardNumber(){
        return cardNumber;
    }

    public String getCardHolderName(){
        return cardHolderName;
    }

    public String getExpiryDate(){
        return expiryDate;
    }

    public void setCardType(String cardType){
        this.cardType = cardType;
    }

    public void setCardNumber(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName){
        this.cardHolderName = cardHolderName;
    }

    public void setExpiryDate(String expiryDate){
        this.expiryDate = expiryDate;
    }

    //method to check if credit card number is valid using Luhn Algorithm
    public static boolean isValidCardNumber(String cardNumber){
        int sum = 0;
        boolean alternate = false;
        for (int i = cardNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(cardNumber.substring(i, i + 1));
            if (alternate)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    //method to check if credit card is expired
    public static boolean isExpired(String expiryDate){
        String[] date = expiryDate.split("/");
        int month = Integer.parseInt(date[0]);
        int year = Integer.parseInt(date[1]);
        int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (year < currentYear){
            return true;
        }
        else if (year == currentYear){
            if (month < currentMonth){
                return true;
            }
        }
        return false;
    }

    //method to check if credit card is valid
    public boolean isValidCard(String cardNumber, String expiryDate){
        if (isValidCardNumber(cardNumber) && !isExpired(expiryDate)){
            return true;
        }
        return false;
    }

    //function that change first 10 numbers of credit card to *
    public String hideCardNumber(String cardNumber){
        String hiddenCardNumber = "";
        for (int i = 0; i < cardNumber.length(); i++) {
            if (i < 10){
                hiddenCardNumber += "*";
            }
            else{
                hiddenCardNumber += cardNumber.charAt(i);
            }
        }
        return hiddenCardNumber;
    }
//toString

    public String toString(){
        return super.toString() + "\nCard Number: " + hideCardNumber(cardNumber);
    }

    @Override
    public void makePayment() {

    }
}
