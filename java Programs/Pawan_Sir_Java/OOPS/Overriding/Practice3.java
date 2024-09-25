class P {
    String s = "Ankit";
}

class C extends P {
    String str = "Meena ji";
}

class Practice3 {
    public static void main(String args[]) {
        P p = new P();
        System.out.println(p.s);
        C c = new C();
        System.out.println(c.str);
    }
}