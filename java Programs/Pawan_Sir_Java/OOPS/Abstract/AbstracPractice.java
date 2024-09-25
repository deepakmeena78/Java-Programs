public abstract class AbstracPractice {
    public abstract int m1();
    // AbstracPractice(){
    // }
}

class A extends AbstracPractice {
    public int m1() {
        return 1;
    }
}

class B extends AbstracPractice {
    public int m1() {
        return 2;
    }
}

class C extends AbstracPractice {
    public int m1() {
        return 3;
    }
}

class Test {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.m1());
        B obj1 = new B();
        System.out.println(obj1.m1());
        C obj2 = new C();
        System.out.println(obj2.m1());
    }
}