import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
    public static void main(String[] args) {

        ArrayList l = new ArrayList();
        l.add("ankit");
        l.add("meena");
        l.add("Deepak");

        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}