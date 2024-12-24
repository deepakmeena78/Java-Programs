class A {
    int a;
}

class B extends A {
    int a;

    void set(int x, int y) {
        super.a = x;
        a = y;
    }

    void display() {
        System.out.println("Local : " + a);
        System.out.println("Super : " + super.a);
    }
}

public class SuperUse {
    public static void main(String[] args) {

        B b = new B();
        b.set(10, 5);
        b.display();
    }
}