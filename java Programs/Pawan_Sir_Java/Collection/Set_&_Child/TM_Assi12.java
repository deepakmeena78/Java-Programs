//2. Write a Java program to copy Tree Map's content to another Tree Map.

import java.util.*;

public class TM_Assi12 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(0, "A");
        tm.put(1, "B");
        tm.put(2, "C");
        tm.put(3, "D");
        tm.put(4, "E");
        System.out.println("Obj1 Values : " + tm);

        TreeMap tm1 = new TreeMap<>();
        tm1.put(5, "F");
        tm1.put(6, "G");
        tm1.put(7, "H");
        System.out.println("Obj2 Values : " + tm1);

        tm.putAll(tm1);
        System.out.println("Add Obj1 + Obj2 = : " + tm);
    }
}
