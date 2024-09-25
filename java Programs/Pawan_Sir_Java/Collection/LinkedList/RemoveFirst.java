import java.util.LinkedList;

public class RemoveFirst {
    public static void main(String[] args) {

        LinkedList lk = new LinkedList<>();
        lk.add(4);
        lk.add(5);
        lk.add(3);
        lk.add(1);
        lk.removeFirst();// Remove first Element add
        System.out.println(lk);
    }
}
