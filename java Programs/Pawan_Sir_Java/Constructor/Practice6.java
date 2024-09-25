class P {
    String s = "Parent";
}

class C extends P {
    String s = "Child";

    public void m1() {
        System.out.println(s);
        System.out.println(this.s);
        System.out.println(super.s);
    }
}

public class Practice6 {
    public static void main(String args[]) {
        P p = new P();
        C c = new C();
        c.m1();
    }
}
