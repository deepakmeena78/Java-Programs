import java.util.Vector;

public class V1AddMethod {
    public static void main(String args[]) {

        Vector v = new Vector<>();
        v.add(4);
        v.add(3);
        v.add(2);
        v.add(1);
        v.add(5);
        System.out.println("Total Element : " + v);
        System.out.println("First Element : " + v.firstElement());
        System.out.println("Last Element : " + v.lastElement());
        v.set(1, 8);
        System.out.println("Set Element : " + v);
    }
}