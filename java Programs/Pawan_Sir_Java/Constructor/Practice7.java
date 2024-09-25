//Method ricurtion runtime Exception

public class Practice7 {
    public static void m1() {
        System.out.println("m1 Method");
        m1();
    }

    public static void m2() {
        System.out.println("m2 Method");
        m2();
    }

    public static void main(String args[]) {
        System.out.println("Call");
        m1();
    }
}
