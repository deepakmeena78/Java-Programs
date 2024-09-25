public class Practice3 {
    public void m1(String s) {
        System.out.println("String");
    }

    public void m1(StringBuffer sf) {
        System.out.println("String Buffer");
    }

    public void m1(String[] arr) {
        System.out.println("String arr []");
    }

    public static void nmain(String args[]) {
        Practice3 p = new Practice3();
        p.m1("Ankit");
        p.m1(new StringBuffer("S Ankit"));
        // p.m1(null);
    }
}
