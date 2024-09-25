
//3. Write a Java program to get the number of elements in a hash set.
import java.util.*;

public class HS_Assi3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet hs = new HashSet<>();
        System.out.println("Enter 6 Value");
        for (int i = 0; i < 6; i++) {
            String s = sc.next();
            hs.add(s);
        }

        Iterator i = hs.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
