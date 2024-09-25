import java.util.*;

public class DurgaSir1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector v = new Vector<>(10,3);
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v);
        System.out.println(v.capacity());
    }
}