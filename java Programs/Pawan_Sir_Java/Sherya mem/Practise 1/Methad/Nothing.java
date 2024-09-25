public class Nothing {
    public static void main(String[] args) {
        m1();
        System.out.println("main" + 10 / 0);
    }

    public static void m1() {
        m2();
        System.out.println("1");
    }

    public static void m2() {
        System.out.println("2");
    }
}
