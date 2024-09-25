public class Q_21 {
    public static void main(String[] args) {
        double l1 = 15;
        double b1 = 8;
        double h1 = 5;
        double v1 = l1 * b1 * h1;
        double l2 = 15 * 100;
        double b2 = 10 * 100;
        double h2 = 8 * 100;
        double v2 = l2 * b2 * h2;
        double comp = v2 / v1;
        System.out.println("Bricks needed: " + comp);
        // Output=2000000
    }
}
