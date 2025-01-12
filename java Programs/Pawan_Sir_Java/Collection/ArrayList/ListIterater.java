import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class ListIterater {
    public static void main(String[] args) {

        List l = new ArrayList();
        l.add("ajeet");
        l.add("vipin");
        l.add("deepak");
        l.add("meena");
        l.add("karan");
        System.out.println(l);

        ListIterator itr = l.listIterator();
        while (itr.hasNext()) {
            String s = ((String) itr.next());
            if (s.startsWith("a")) {
                String yo = s.toUpperCase();
                System.out.println(yo);
            } else {
                System.out.println(s);
            }
        }
    }
}

// for (Person person : l) {
// if (person.getId() > 103) {
// System.out.println(person.getName());
// }
// }