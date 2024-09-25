import java.util.Stack;

public class S2Practice1 {
    public static void main(String[] args) {

        Stack s = new Stack<>();
        s.add(6);
        s.add(3);
        s.add(4);
        s.add(1);
        s.add(7);
        System.out.println(s);
        s.remove(3);
        System.out.println(s);
        s.add(9);
        System.out.println(s.capacity());
    }
}
