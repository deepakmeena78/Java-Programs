public class Practice2 {
    public void m1(Object o) {
        System.out.println("Object o");
    }

    public void m1(int a) {
        System.out.println(a + " Integer");
    }

    public void m1(String s) {
        System.out.println(s + " String");
    }

    public static void main(String args[]) {
        Practice2 p = new Practice2();
        p.m1(new Object());
        p.m1(5);
        p.m1(null);
    }
}
