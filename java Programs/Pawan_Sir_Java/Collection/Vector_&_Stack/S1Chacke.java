import java.util.Stack;

public class S1Chacke {
    public static void main(String[] args) {

        Stack s = new Stack<>();
        s.add(4);
        s.add(3);
        s.add(2);
        s.add(1);
        s.add(5);
        // System.out.println(s);
        // s.peek();
        // System.out.println(s);
        // s.pop();
        // System.out.println(s);
        // s.push(8);
        // System.out.println(s);
        // s.empty();
        // System.out.println(s);
        // s.search(s);
        // System.out.println(s);

        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.push(8));
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());

        System.out.println(s.empty());
        System.out.println(s.search(3));
    }
}