
//3. Write a Java program to search for a key in a Tree Map.
import java.util.*;

public class TM_Assi13 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(0, "A");
        tm.put(1, "B");
        tm.put(2, "C");
        tm.put(3, "D");
        tm.put(4, "E");

        System.out.println("Obj1 Values : " + tm);
        System.out.println("Find : " + tm.ceilingEntry(2));
        System.out.println("Find : " + tm.ceilingEntry(3));
        System.out.println(tm);
    }
}
