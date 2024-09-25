public class Q_15 {
    public static void main(String[] args) {
        double l = 22;
        double b = 15;
        double a1 = l * b;
        double s = 21;
        double a2 = s * s;
        if (a1 > a2)
            System.out.println("Shelly's garden is greater");
        else if (a2 > a1)
            System.out.println("Rachel's garden is greater");
        else
            System.out.println("Both equal");
        // Output= Rachel's garden is greater
    }
}
