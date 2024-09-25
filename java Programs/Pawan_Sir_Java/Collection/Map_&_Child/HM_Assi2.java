
//2. Write a Java program to count the number of key-value (size) mappings in
//   a map.
import java.util.*;

public class HM_Assi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap hm = new HashMap();
        System.out.println("Enter Element :");
        for (int i = 0; i < 5; i++) {
            String s = sc.next();
            hm.put(i, s);
        }

        System.out.println("Map Size : " + hm.size());
    }
}
