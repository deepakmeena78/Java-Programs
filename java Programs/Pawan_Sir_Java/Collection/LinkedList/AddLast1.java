import java.util.LinkedList;

public class AddLast1 {
    public static void main(String[] args) {

        LinkedList lk = new LinkedList<>();
        lk.add(0, 4);
        lk.add(5);
        lk.add(3);
        lk.add(1);
        lk.addLast(9);// last Element add
        System.out.println(lk);
    }
}
