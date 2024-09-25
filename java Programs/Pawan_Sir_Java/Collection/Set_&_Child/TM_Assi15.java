
//5. Write a Java program to get all keys from a Tree Map.
import java.util.*;

public class TM_Assi15 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(0, "A");
        tm.put(1, "B");
        tm.put(2, "C");
        tm.put(3, "D");
        tm.put(4, "E");
        tm.put(5, "E");

        for (int i = 0; i < tm.size(); i++) {
            System.out.print(tm.get(i) + " ");
        }
    }
}
