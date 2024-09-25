//1. Write a Java program to associate the specified value with the specified key
//   in a Tree Map.

import java.util.*;

public class TM_Assi11 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap<>();
        tm.put(0, "A");
        tm.put(1, "B");
        tm.put(2, "C");
        tm.put(3, "D");
        tm.put(4, "E");

        System.out.println("Obj : " + tm);

        for (int i = 0; i < tm.size(); i++) {
            System.out.print(": " + i + " " + tm.get(i) + " :");
        }

    }
}