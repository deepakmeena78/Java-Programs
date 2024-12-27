abstract class Payment {
    double amount;
    String transactionID;

    public Payment(double amount, String transactionID) {
        this.amount = amount;
        this.transactionID = transactionID;
    }

    abstract public void processPayment();

    public void displayDetails() {
        System.out.println("Amount : " + amount);
        System.out.println("transaction ID : " + transactionID);
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    public CreditCardPayment(double amount, String transactionID, String cardNumber) {
        super(amount, transactionID);
        this.cardNumber = cardNumber;
    }

    public void processPayment() {
        System.out.println("Processing credit card payment for amount: $[amount]");
    }
}

class PaypalPayment extends Payment {
    String paypalID;

    public PaypalPayment(double amount, String transactionID, String paypalID) {
        super(amount, transactionID);
        this.paypalID = paypalID;
    }

    public void processPayment() {
        System.out.println("Processing PayPal payment for amount: $[amount]");
    }
}

public class ASPayment {
    public static void main(String[] args) {
        
        CreditCardPayment c = new CreditCardPayment(20000,"101","9111");
        c.processPayment();
        c.displayDetails();

        PaypalPayment p = new PaypalPayment(90000    , "102","6260");
        p.processPayment();
        p.displayDetails();
    }
}
 