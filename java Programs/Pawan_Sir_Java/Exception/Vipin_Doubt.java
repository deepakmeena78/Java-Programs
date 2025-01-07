import java.util.Scanner;

class Text {
    public void m1() {
        String s = null;
        s.length();
        System.out.println("M1 Methods : " + s);
    }

    public void m2() {
        // int a = 10 / 0;
        // System.out.println("M2 Methods : " + a);
    }
}

public class Vipin_Doubt {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        try {
            Text t = new Text();
            t.m1();
            t.m2();
        } catch (NullPointerException w) {
            System.out.println("Pakad lliya");
        }
    }
}
   