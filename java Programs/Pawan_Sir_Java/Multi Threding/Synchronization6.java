class A1 extends Thread {

    public void m1() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("M1 synchronized");
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void m2() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("M2 synchronized");
                sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class B extends Thread {
    A1 A1;

    public B(A1 A1) {
        this.A1 = A1;
    }

    public void run() {
        A1.m1();
        A1.m2();
    }
}

public class Synchronization6 {
    public static void main(String[] args) {

        A1 a = new A1();
        B b = new B(a);
        b.start();
    }
}
