interface A {
    private void m1() {
        System.out.println("Private Method");
    }

    default void m2() {
        m1();
    }
}

class B implements A{

}

public class Doubt2 implements A {
    public static void main(String[] args) {
        A a = new B();
        a.m2();
    }
}
