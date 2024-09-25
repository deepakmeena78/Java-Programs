public class Q_12 {
    public static void main(String[] args) {
        double h = 13;
        double l1 = 12;
        double l2 = Math.sqrt((h * h) - (l1 * l1));
        System.out.println("Other Length: " + l2);
        double a = (l1 * l2) / 2;
        System.out.println("Area; " + a);
        // Output= 5, 30
    }
}
