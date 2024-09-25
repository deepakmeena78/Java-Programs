public class A {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }

    public void m1() {
        try {
            System.out.println(10 / 0);
            System.out.println();
        } catch (Exception e) {
            System.out.println("A");
        }
        System.out.println("Final");
    }
}
