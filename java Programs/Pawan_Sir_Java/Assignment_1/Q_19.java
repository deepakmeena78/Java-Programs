public class Q_19 {
    public static void main(String[] args) {
        double e = 7;
        double v1 = e * e * e;
        double l = 7;
        double b = 4;
        double h = 8;
        double v2 = l * b * h;
        if (v2 > v1) {
            System.out.println("Cuboid is greater");
        } else if (v1 > v2) {
            System.out.println("Cube is greater");
        } else {
            System.out.println("both equal");
        }
        // Output= Cube is greater
    }
}
