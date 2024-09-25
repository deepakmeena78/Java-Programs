import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String s) {
        super(s);
    }
}

public class ShoppingCart {
    private double totalitem;

    public void card(double total) throws InsufficientFundsException {
        this.totalitem = this.totalitem + total;
        System.out.println(this.totalitem);
        throw new InsufficientFundsException("In-sufficient Item");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double p1, p2, p3, p4, p5;
        try {
            System.out.println("Itam 1 Price");
            p1 = sc.nextDouble();
            System.out.println("Itam 2 Price");
            p2 = sc.nextDouble();
            System.out.println("Itam 3 Price");
            p3 = sc.nextDouble();
            System.out.println("Itam 4 Price");
            p4 = sc.nextDouble();
            System.out.println("Itam 5 Price");
            p5 = sc.nextDouble();
            try {
                if (p1 < 0 || p2 < 0 || p3 < 0 || p4 < 0 || p5 < 0) {
                    ShoppingCart obj = new ShoppingCart();
                    obj.card(p1 + p2 + p3 + p4 + p5);
                }
            } catch (NumberFormatException a) {
                System.out.println(a);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}