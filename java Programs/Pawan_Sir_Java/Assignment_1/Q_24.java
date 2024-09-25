public class Q_24 {
    public static void main(String[] args) {
        double l1 = 25;
        double b1 = 10;
        double h1 = 7.5;
        double v1 = l1 * b1 * h1;
        double l2 = 2 * 100;
        double b2 = 0.75 * 100;
        double h2 = 2 * 100;
        double v2 = l2 * b2 * h2;
        System.out.println("Total Price: " + (((v2 / v1) * 900) / 100));
        // Output= 14400
    }
}
