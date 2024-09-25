import java.util.LinkedList;

public class Peek1 {
    public static void main(String[] args) {
        
        LinkedList lk = new LinkedList<>();
        lk.add(4);
        lk.add(5);
        lk.add(3);
        lk.add(1);
        //lk.peek();// clear all Element
        System.out.println(lk.peek());
    }
}
