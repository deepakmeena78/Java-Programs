public class Q_6 {
    public static void main(String[] args) {
        double s1 = 10;
        double s2 = 9;
        double p = 36;
        double s3 = p - (s1 + s2);
        double s = p / 2;
        double a = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("Area: " + a);
        // Output= 36
    }
}
