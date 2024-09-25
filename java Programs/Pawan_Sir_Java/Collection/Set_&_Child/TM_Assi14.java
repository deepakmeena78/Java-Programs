
//4. Write a Java program to search for a value in a Tree Map.
import java.util.*;

public class TM_Assi14 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(0, "A");
        tm.put(1, "B");
        tm.put(2, "C");
        tm.put(3, "D");
        tm.put(4, "E");

        System.out.println(tm);
        System.out.println(tm.lowerEntry(3));

    }
}
