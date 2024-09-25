import java.util.Vector;

public class V2TraileMethods {
    public static void main(String[] args) {
        Vector v = new Vector<>(20);
        v.add(4);
        v.add(3);
        v.add(2);
        v.add(1);
        v.add(5);
        System.out.println(v.capacity());
    }
}
