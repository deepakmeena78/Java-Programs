/*
 * Create an interface PaymentGateway with a method processPayment(double amount).
Implement the interface in classes CreditCardPayment and UPIPayment.
Write a driver class to test the functionality by accepting the payment method from the user and processing the payment.
 */
interface PaymentGate {
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentGate {
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment : " + amount);
    }
}

class UPIPayment implements PaymentGate {
    public void processPayment(double amount) {
        System.out.println("UPI Payment : " + amount);
    }
}

public class ASPaymentGateway {
    public static void main(String[] args) {

        PaymentGate c = new CreditCardPayment();
        PaymentGate u = new UPIPayment();
        c.processPayment(300);
        u.processPayment(200);
    }
}
