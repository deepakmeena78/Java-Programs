interface I1 {
    static void m1() {
        System.out.println("Interface Static");
    }
}

public class Douts {
    public static void main(String[] args) {
        I1.m1();
    }
}