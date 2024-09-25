import java.util.ArrayList;
import java.util.ListIterator;

public class Iterator2 {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("ankit");
        l.add("meena");
        l.add("Deepak");

        ListIterator it = l.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
