import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String s) {
        super(s);
    }
}

public class BankingApplication {
    private static double balance = 50000;

    public void withdrawc(double withdraw) throws InsufficientFundsException {
        if (balance < withdraw) {
            throw new InsufficientFundsException("In-sufficient funds");
        } else {
            System.out.println("withdraw " + withdraw);
            balance = balance - withdraw;
            System.out.println("Current Total Amount " + balance);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double w;
        try {
            System.out.println("withdraw Amount");
            w = sc.nextDouble();
            BankingApplication obj = new BankingApplication();
            obj.withdrawc(w);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}