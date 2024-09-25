public abstract class AbstracPractice2 {
}

class A1 extends AbstracPractice2 {
    public void m2() {
        System.out.println("Class A");
    }
}

class B1 extends AbstracPractice2 {
    public int m2(int a) {
        return a*a;
    }
}

class C1 extends AbstracPractice2 {
    public void m2() {
        System.out.println("Class C");
    }
}

class Test1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.m2();
        B1 b1 = new B1();
        System.out.println(b1.m2(4));
        C1 c1 = new C1();
        c1.m2();
    }
}
