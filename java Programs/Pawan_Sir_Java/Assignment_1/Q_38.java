public class Q_38 {
    public static void main(String[] args) {
        double v = 1287;
        double pi = 3.14;
        double r = 10;
        double h = v / (pi * r * r);
        double a = 2 * pi * r * (r + h);
        System.out.println("Area: " + a);
        // Output= 885.4000000000001
    }
}
