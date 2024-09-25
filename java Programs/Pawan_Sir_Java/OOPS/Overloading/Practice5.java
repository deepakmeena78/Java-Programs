class A {
}

class B extends A {

}

public class Practice5 {
    public void m1(A a) {
        System.out.println("Class A _ b");
    }

    public void m1(B b) {
        System.out.println("Class B _ b");
    }

    public static void main(String args[]) {
        Practice5 b2 = new Practice5();
        A a1 = new A();
        a1.m1();
        B b1 = new B();
        b1.m1();
    }
}
