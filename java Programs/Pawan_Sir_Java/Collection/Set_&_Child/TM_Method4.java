import java.util.*;

public class TM_Method4 {
    public static void main(String[] args) {

        TreeMap t = new TreeMap<>();

        t.put(0, "A");
        t.put(1, "B");
        t.put(2, "C");
        t.put(3, "D");
        t.put(4, "E");

        System.out.println("\n" + t + "\n");

        System.out.println("CeilingEntry : " + t.ceilingEntry(7));

        System.out.println("HigherEntry : " + t.higherEntry(1));

        System.out.println("LowerKey : " + t.lowerKey(7));

        System.out.println("FloorEntry : " + t.floorEntry(8));

        System.out.println("FloorKey : " + t.floorKey(9));

        System.out.println("FirstEntry : " + t.firstEntry());

        System.out.println("LastEntry : " + t.lastEntry());

        System.out.println("FirstKey : " + t.firstKey());

        System.out.println("LastKey : " + t.lastKey()); 

        System.out.println("HeadMap : " + t.headMap(2));

        System.out.println("PollFirstEntry : " + t.pollFirstEntry());

        System.out.println("PollLastEntre : " + t.pollLastEntry() + "\n");
    }
}
