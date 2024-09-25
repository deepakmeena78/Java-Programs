class A {
    synchronized public void m1(){
        System.out.println("Class A M1");
        B b = new B();
        b.p2();
    }
    synchronized public void m2(){
        System.out.println("Class A M2");
    }
}

class B {
    synchronized public void p1(){
        System.out.println("Class B P1");
        A a = new A();
        a.m2();
    }
    synchronized public void p2(){
        System.out.println("Class B P2");
    }
}

public class synchronization8 extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        
    }
}
