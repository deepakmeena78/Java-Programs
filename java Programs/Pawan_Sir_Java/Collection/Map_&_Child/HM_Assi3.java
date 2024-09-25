
//3. Write a Java program to copy all mappings from the specified map to
//   another map.
import java.util.*;

public class HM_Assi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap hm = new HashMap<>();
        HashMap hm1 = new HashMap<>();

        hm.put(0, "A");
        hm.put(1, "B");
        hm.put(2, "C");
        hm.put(3, "D");
        hm.put(4, "E");

        hm1.put(5,"F");
        hm1.put(6, "G");
        hm1.put(7, "H");
       
        hm.putAll(hm1);
        System.out.println(" Obj : "+hm);

        Set s = hm.entrySet();
        Iterator ii = s.iterator();

        System.out.print("Entry Methos :> ");
        while (ii.hasNext()) {
            Map.Entry entry = (Map.Entry) ii.next();
            System.out.print(entry.getKey() + "  " + entry.getValue() + " : ");
        }
    }
}