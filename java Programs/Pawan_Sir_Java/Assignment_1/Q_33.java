public class Q_33 {
    public static void main(String[] args) {
        double l = 30;
        double b = 20;
        double a = l * b;
        double l1 = 20;
        double b1 = 4;
        double a1 = l1 * b1;
        double l2 = 30;
        double b2 = 3;
        double a2 = l2 * b2;
        double l3 = 3;
        double b3 = 4;
        double a3 = l3 * b3;
        double area = a - ((a1 + a2) - a3);
        System.out.println("Area: " + area);
        // Output= 442
    }
}
