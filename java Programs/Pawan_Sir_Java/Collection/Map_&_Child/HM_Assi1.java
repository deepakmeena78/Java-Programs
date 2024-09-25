
//1. Write a Java program to associate the specified value with the specified key
//   in a HashMap.
import java.util.*;

public class HM_Assi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap hm = new HashMap();
        System.out.println("Enter Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            hm.put(i, s);
        }

        Set s = hm.entrySet();
        Iterator ii = s.iterator();

        while (ii.hasNext()) {
            Map.Entry entry = (Map.Entry) ii.next();
            System.out.print(entry.getKey() + "  " + entry.getValue() + " :");
        }
    }
}
