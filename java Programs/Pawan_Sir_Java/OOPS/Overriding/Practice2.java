class A {
    public void m1() {
        System.out.println("Class A");
    }
}

class B extends A {
    public void m1() {
        System.out.println("Class B");
    }
}

public class Practice2 {
    public static void main(String args[]) {
        A a = new A();
        a.m1();
    }
}
