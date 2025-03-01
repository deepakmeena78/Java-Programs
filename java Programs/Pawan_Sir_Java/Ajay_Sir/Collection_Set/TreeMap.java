import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {

        Map<Integer, String> m = new java.util.TreeMap<Integer, String>();
        m.put(101, "ajeet");
        m.put(104, "karan");
        m.put(103, "vipin");
        m.put(102, "meena");
        m.put(101, "aa");

        System.out.println(m);
    }
}
