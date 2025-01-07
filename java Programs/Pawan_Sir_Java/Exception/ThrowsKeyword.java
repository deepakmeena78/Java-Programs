import java.io.PrintWriter;

class Textt {
    public void m1() {
        System.out.println("M1");
        m2();
    }

    public void m2() {
        System.out.println("M2");
        m3();
    }

    public void m3() {
        System.out.println("M3");
        try {
            int a = 10 / 0;
        } catch (ArithmeticException r) {
            throw new ArrayIndexOutOfBoundsException("Good Yaar");
        }
    }
}

public class ThrowsKeyword {
    public static void main(String[] args) {

        try {
            System.out.println("Main Started");
            Textt t = new Textt();
            t.m1();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
