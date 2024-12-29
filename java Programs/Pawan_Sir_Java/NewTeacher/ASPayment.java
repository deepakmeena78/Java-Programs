/*
 * Scenario 1: Payment Processing System
You are developing a payment processing system to handle various payment methods.

Abstract Class:

Create an abstract class Payment with the following:
Fields:
double amount
String transactionID
Constructor to initialize the fields.
Abstract method processPayment().
Concrete method displayDetails() to print the transaction ID and amount.
Subclasses:

Create the following subclasses:
CreditCardPayment:
Additional field: String cardNumber.
Override processPayment() to print "Processing credit card payment for amount: $[amount].".
PaypalPayment:
Additional field: String paypalID.
Override processPayment() to print "Processing PayPal payment for amount: $[amount]."
Main Class:

Create instances of both CreditCardPayment and PaypalPayment.
Call processPayment() and displayDetails() for each object.


 */


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
        System.out.println("Processing credit card payment for amount: " + amount);
    }
}

class PaypalPayment extends Payment {
    String paypalID;

    public PaypalPayment(double amount, String transactionID, String paypalID) {
        super(amount, transactionID);
        this.paypalID = paypalID;
    }

    public void processPayment() {
        System.out.println("Processing PayPal payment for amount: " + amount);
    }
}

public class ASPayment {
    public static void main(String[] args) {

        CreditCardPayment c = new CreditCardPayment(20000, "101", "9111");
        c.processPayment();
        c.displayDetails();

        PaypalPayment p = new PaypalPayment(90000, "102", "6260");
        p.processPayment();
        p.displayDetails();
    }
}
