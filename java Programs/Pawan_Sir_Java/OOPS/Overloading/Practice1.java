public class Practice1 {
    public void m1() {
        System.out.println("No Argument");
    }

    public void m1(int a) {
        System.out.println(a + "  intiger");
    }

    public void m1(String s) {
        System.out.println(s + " String");
    }

    public void m1(Float f) {
        System.out.println(f + " Floot");
    }

    public static void main(String args[]) {
        Practice1 p = new Practice1();
        p.m1();
        p.m1(5);
        p.m1("Ankit");
        p.m1(10.5f);
    }

}