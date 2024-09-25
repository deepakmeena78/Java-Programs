class A {
    public void m1() {
        System.out.println("A-m1-called");
    }
}

class B extends A {
    public void m1() {
        System.out.println("b-m1-called");
    }

    public void m2() {
        System.out.println("b-m2-called");
    }
}

class C extends B {
    public void m1() {
        System.out.println("c-m1-called");
    }

    public void m2() {
        System.out.println("c-m2-called");
    }

    public void m3() {
        System.out.println("c-m3-called");
    }
}

class TestMain {
    public static void main(String args[]) {
        A obj = new A();
        obj.m1();
    }
}