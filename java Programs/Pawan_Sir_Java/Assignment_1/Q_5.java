public class Q_5 {
    public static void main(String[] args) {
        double total = 1600;
        double per_sq_m = 25;
        double l = 20;
        double a = total / per_sq_m;
        double b = a / l;
        double p = 2 * (l + b);
        System.out.println("Perimeter & Bredth: " + p + ", " + b);
        // Output= 46.4, 3.2
    }
}
