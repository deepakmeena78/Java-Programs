import java.util.*;

public class DurgaSir3 {
    public static void main(String[] args) {

        LinkedList l = new LinkedList<>();
        l.add(1);
        l.add("A");
        l.add(null);//remove Element Because is Last
        l.add(0, 3);
        l.set(0, 2);
        l.removeLast();
        l.addFirst(4);
        System.out.println(l);
    }
}
