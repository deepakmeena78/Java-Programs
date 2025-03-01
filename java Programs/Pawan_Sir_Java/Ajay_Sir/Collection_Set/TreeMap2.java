import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Costo implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -o1.compareTo(o2);
    }
}

public class TreeMap2 {
    public static void main(String[] args) {

        Map<Integer, String> m = new TreeMap<>(new Costo());

        m.put(101, "ajeet");
        m.put(104, "karan");
        m.put(103, "vipin");
        m.put(102, "meena");
        m.put(101, "aa"); 

        System.out.println(m);
    }
}
