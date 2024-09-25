import java.util.*;

public class Hashmap2 {
    public static void main(String[] args) {

        HashMap h = new HashMap();
        h.put(1, "Name");
        h.put(2, "Deepak");
        // Experiment 1
        h.put(1, "Ankit");// Repalace Name to Ankit
        h.put(3, "Meena");
        System.out.println(h);
        // -----------------------------------------------------------

        // Experiment 2
        h.put('a', "A");
        h.put('b', "B");
        h.put('c', "C");
        h.put('d', "D");
        System.out.println(h);
        // -----------------------------------------------------------

        // Experiment 3
        h.put(1.0, "Ankit ");
        h.put(1.1, "Ankit ");
        h.put(1.2, "Ankit ");
        h.put(1.3, "Ankit ");
        System.out.println(h);
        // -------------------------------------------------------------
        
    }
}
