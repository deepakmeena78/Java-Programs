import java.util.HashSet;
import java.util.Set;

public class Settry {
    public static void main(String[] args) {

        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(40);

        System.out.println(s);
    }
}