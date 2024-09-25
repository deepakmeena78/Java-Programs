import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {

        Set l = new HashSet<>();
        l.add("ankit");
        l.add("meena");
        l.add("Deepak");

        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
