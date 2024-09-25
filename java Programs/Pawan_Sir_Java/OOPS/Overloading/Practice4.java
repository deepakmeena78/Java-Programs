public class Practice4 {
    public void m1(int a) {
        System.out.println("Integer");
    }

    public void m1(int... i) {
        System.out.println(i + "Var - arg");
    }

    public void m1(String arr[]) {
        System.out.println(arr + "String arr");
    }

    public static void main(String args[]) {
        Practice4 p = new Practice4();
        // p.m1(new String[]);
        p.m1(10, 20);
        p.m1();
    }
}
