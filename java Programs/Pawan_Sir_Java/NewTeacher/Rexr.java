interface H1 {
    void h1();
}

interface H2 {
    void h2();
}

abstract class B implements H1, H2 {
    abstract public void b();
}

class C extends B {
    public void h1() {
        System.out.println("H1");
    }

    public void h2() {
        System.out.println("H2");

    }

    public void b() {
        System.out.println("B");

    }
}

public class Rexr {
    public static void main(String[] args) {
        C c1 = new C();
        c1.h1();
        c1.h2();
        c1.b();
    }
}
