import java.util.LinkedList;

public class Clone1 {
    public static void main(String[] args) {

        LinkedList lk = new LinkedList<>();
        lk.add(4);
        lk.add(5);
        lk.add(3);
        lk.add(1);
        lk.clone();// clone all Element
        System.out.println(lk.clone());
    }
}
