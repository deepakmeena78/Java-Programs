
//5. Write a Java program to check whether a map contains key-value
//   mappings (empty) or not.
import java.util.*;

public class HM_Assi6 {
    public static void main(String[] args) {

        HashMap hm = new HashMap<>();
        hm.put(0, "A");
        hm.put(1, "B");
        hm.put(2, "C");
        hm.put(3, "D");
        hm.put(4, "E");

        System.out.println("Obj Values : " + hm);
        System.out.println("Empty Method : " + hm.isEmpty());
        hm.clear();
        System.out.println("Clear Vlues : " + hm);
        System.err.println("Empty Method : " + hm.isEmpty());
    }
}
