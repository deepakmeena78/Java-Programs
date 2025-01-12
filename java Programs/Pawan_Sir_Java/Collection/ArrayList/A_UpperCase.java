
//1. WAP to store string data in arraylist and convert all the names into upper case which starts from a.
import java.util.ArrayList;
import java.util.ListIterator;

public class A_UpperCase {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("ankit");
        al.add("meena");
        al.add("deepak");
        al.add("ajeest");
        al.add("ajay");

        ListIterator it = al.listIterator();
        while (it.hasNext()) {
            String s = ((String) it.next());
            if (s.startsWith("a")) {
                System.out.println(s.toUpperCase());
            } else {
                System.out.println(s);
            }
        }
    }
}
