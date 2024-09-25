
//2. Write a Java program to iterate through all elements in a hash list
import java.util.*;

public class HS_Assi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet hm = new HashSet<>();
        System.out.println("Enter 6 Value :");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            hm.add(s);
        }
        Iterator i = hm.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
